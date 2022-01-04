// Part of Stagean: https://stagean.machinezoo.com/
package com.machinezoo.stagean;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/*
 * Type target.
 */
@CompleteCode
@DraftApi
@StubTests
@NoDocs
@CodeIssue("issue")
public class ApplicabilityTest {
	/*
	 * All annotation applied.
	 */
	@NoApi
	@NoTests
	@NoDocs
	public static void none() {
	}
	@StubCode
	@StubApi
	@StubTests
	@StubDocs
	public static void stub() {
	}
	@DraftCode
	@DraftApi
	@DraftTests
	@DraftDocs
	public static void draft() {
	}
	@CompleteCode
	@CompleteApi
	@CompleteTests
	@CompleteDocs
	public static void complete() {
	}
	@CodeIssue("code issue")
	@ApiIssue("API issue")
	@TestIssue("test issue")
	@DocIssue("doc issue")
	public static void issues() {
	}
	@CodeIssue("issue 1")
	@CodeIssue("issue 2")
	public static void repeating() {
	}
	/*
	 * Field target.
	 */
	@CompleteCode
	@DraftApi
	@StubTests
	@NoDocs
	@CodeIssue("issue")
	public static int field;
	/*
	 * Constructor target.
	 */
	@CompleteCode
	@DraftApi
	@StubTests
	@NoDocs
	@CodeIssue("issue")
	public ApplicabilityTest() {
	}
	public static enum EnumTarget {
		ONE,
		/*
		 * Enum constant target.
		 */
		@CompleteCode
		@DraftApi
		@StubTests
		@NoDocs
		@CodeIssue("issue")
		TWO;
	}
	/*
	 * Annotation target.
	 */
	@CompleteCode
	@DraftApi
	@StubTests
	@NoDocs
	@CodeIssue("issue")
	public static @interface AnnotationTarget {
	}
	/*
	 * Method target.
	 */
	@CompleteCode
	@DraftApi
	@StubTests
	@NoDocs
	@CodeIssue("issue")
	public static void method() {
	}
	/*
	 * Text parameter.
	 */
	@CompleteCode("test")
	@DraftApi("test")
	@StubTests("test")
	@NoDocs("test")
	@CodeIssue("issue")
	public static void parameter() {
	}
	@Test
	public void load() {
		/*
		 * Intentionally left empty. We just want to check that the annotations compile and the test class is loaded.
		 */
	}
	@Test
	public void runtime() {
		assertEquals(0, ApplicabilityTest.class.getAnnotations().length);
	}
}
