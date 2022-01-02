// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Optionally flags code that has finished implementation.
 * This is the default when no annotation is present.
 * This annotation describes implementation only. It says nothing about its API.
 * Use {@link CompleteApi} to indicate the API is finished too.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface CompleteCode {
	/**
	 * Free-form text used for clarification.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
