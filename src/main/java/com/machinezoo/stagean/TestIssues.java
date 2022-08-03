// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import java.lang.annotation.*;

/**
 * Collection of {@link TestIssue} annotations.
 * This annotation should not be used directly. Repeat {@link TestIssue} annotation instead.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
public @interface TestIssues {
	/**
	 * All {@link TestIssue} annotations defined on the element.
	 * Compiler aggregates all {@link TestIssue} annotations repeated on the element in this value.
	 * 
	 * @return {@link TestIssue} annotations defined on the element
	 */
	TestIssue[] value();
}
