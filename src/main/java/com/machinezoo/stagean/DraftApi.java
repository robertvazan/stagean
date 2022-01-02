// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has unfinished API.
 * Annotation parameter should clarify what needs to be finished.
 * Since APIs are expected to be stable, this annotation also describes APIs that are completely defined but still likely to change in the future.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface DraftApi {
	/**
	 * Free-form text used for clarification.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
