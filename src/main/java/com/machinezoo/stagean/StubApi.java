// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has almost no API.
 * Stub API is a dummy placeholder for real API.
 * This annotation describes cases where implementation exists, but it is not properly exposed.
 * To describe non-existent implementation, use {@link StubCode}.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface StubApi {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link ApiIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
