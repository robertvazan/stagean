// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Description of one API issue.
 * This annotation can be repeated to describe multiple issues.
 * It is used in combination with {@link NoApi}, {@link StubApi}, {@link DraftApi}, or {@link CompleteApi},
 * especially when there are too many issues to list on one line.
 */
@Documented
@Repeatable(ApiIssues.class)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface ApiIssue {
	/**
	 * Description of the issue.
	 * 
	 * @return free-form issue description
	 */
	String value();
}
