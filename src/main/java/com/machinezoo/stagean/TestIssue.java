// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Description of one test issue.
 * This annotation can be repeated to describe multiple issues.
 * It is used in combination with {@link NoTests}, {@link StubTests}, {@link DraftTests}, or {@link CompleteTests},
 * especially when there are too many issues to list on one line.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TestIssues.class)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface TestIssue {
	/**
	 * Description of the issue.
	 * 
	 * @return free-form issue description in Markdown syntax
	 */
	String value();
}
