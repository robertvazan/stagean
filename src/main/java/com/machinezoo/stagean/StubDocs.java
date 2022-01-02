// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Flags code that has almost no javadoc.
 * Stub javadoc includes only the summary line and perhaps some other basic information.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface StubDocs {
	/**
	 * Free-form text used for clarification.
	 * If there are too many issues to list, {@link DocIssue} annotations can be used to spread them over several lines.
	 * 
	 * @return free-form clarification
	 */
	String value() default "";
}
