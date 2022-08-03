// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has unfinished implementation.
 * Annotation parameter should clarify what needs to be finished.
 * For cases where implementation is finished, but its API still needs work or it is likely to change, use {@link DraftApi}.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface DraftCode {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link CodeIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification in Markdown syntax
	 */
	String value() default "";
}
