// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has unfinished tests.
 * Annotation parameter should clarify what needs to be finished.
 * This annotation is intended for the code under test, but it can be also applied to tests themselves.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface DraftTests {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link TestIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification in Markdown syntax
	 */
	String value() default "";
}
