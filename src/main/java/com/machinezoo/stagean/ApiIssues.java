// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Collection of {@link ApiIssue} annotations.
 * This annotation should not be used directly. Repeat {@link ApiIssue} annotation instead.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface ApiIssues {
	/**
	 * All {@link ApiIssue} annotations defined on the element.
	 * Compiler aggregates all {@link ApiIssue} annotations repeated on the element in this value.
	 * 
	 * @return {@link ApiIssue} annotations defined on the element
	 */
	ApiIssue[] value();
}
