// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Optionally flags code that has finished tests.
 * This is the default when no annotation is present.
 * This annotation is intended for the code under test, but it can be also applied to tests themselves.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface CompleteTests {
	/**
	 * Free-form text used for clarification.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
