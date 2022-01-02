// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Collection of {@link DocIssue} annotations.
 * This annotation should not be used directly. Repeat {@link DocIssue} annotation instead.
 */
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface DocIssues {
	/**
	 * All {@link DocIssue} annotations defined on the element.
	 * Compiler aggregates all {@link DocIssue} annotations repeated on the element in this value.
	 * 
	 * @return {@link DocIssue} annotations defined on the element
	 */
	DocIssue[] value();
}
