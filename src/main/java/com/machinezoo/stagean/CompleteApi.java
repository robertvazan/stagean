// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Optionally flags code that has finished API.
 * This is the default when no annotation is present.
 * Since APIs are expected to be stable, this annotation also implies the API is unlikely to change in the future.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface CompleteApi {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link ApiIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
