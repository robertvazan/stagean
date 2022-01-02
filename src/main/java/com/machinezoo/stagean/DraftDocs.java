// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has unfinished javadoc.
 * Annotation parameter should clarify what needs to be finished.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface DraftDocs {
	/**
	 * Free-form text used for clarification.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
