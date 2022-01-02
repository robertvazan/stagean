// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has almost no implementation.
 * Stub code does not implement any feature. It just throws an exception or simply does nothing.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface StubCode {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link CodeIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
