// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Description of one code issue.
 * This annotation can be repeated to describe multiple issues.
 * It is used in combination with {@link StubCode}, {@link DraftCode}, or {@link CompleteCode},
 * especially when there are too many issues to list on one line.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(CodeIssues.class)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface CodeIssue {
	/**
	 * Description of the issue.
	 * 
	 * @return free-form issue description
	 */
	String value();
}
