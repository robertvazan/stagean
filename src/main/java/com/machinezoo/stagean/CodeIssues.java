// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Collection of {@link CodeIssue} annotations.
 * This annotation should not be used directly. Repeat {@link CodeIssue} annotation instead.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface CodeIssues {
	/**
	 * All {@link CodeIssue} annotations defined on the element.
	 * Compiler aggregates all {@link CodeIssue} annotations repeated on the element in this value.
	 * 
	 * @return {@link CodeIssue} annotations defined on the element
	 */
	CodeIssue[] value();
}
