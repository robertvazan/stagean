// Part of Stagean: https://stagean.machinezoo.com/
/*
 * Most annotations defined in this package are named like <Quality><Kind>, for example StubApi or DraftDocs.
 * This results in a lot of annotations that can be sometimes combined in incorrect ways (e.g. StubDocs together with DraftDocs),
 * but it is preferable to level/quality parameter that would be more verbose and hard to extend.
 * 
 * Explanation of why annotations are defined the way they are:
 * 
 * @Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE, ElementType.MODULE })
 * 
 * Annotations defined here can be applied to any type or member or their grouping (package, module, outer type).
 * Only locals and parameters are excluded, because it makes no sense to annotate them with development stages.
 * In the rare cases where it does make sense, for example when parameter has poor javadoc,
 * the enclosing type or member should be annotated instead with clarifying message as its value or comment.
 * 
 * @Documented
 * 
 * All annotations are marked as @Documented, so that users of the code can see the markings directly in javadoc
 * without having to wade through the code. Use of scanning tools is nevertheless preferable to annotation-spotting in javadoc.
 * 
 * @Retention(RetentionPolicy.RUNTIME)
 * 
 * Large applications might reasonably want to scan themselves in order to display pending issues in application UI.
 * This adds some cost to class loading and increases RAM usage, but the cost is proportional to number of annotations,
 * which should be very low in mature code.
 * 
 * String value() default "";
 * 
 * It is possible to clarify every use of every annotation just by adding free-form text as the only annotation parameter.
 * From the point of view of annotation tools, all that matters is assigning quality level to a piece of code.
 * All other information can be included informally in annotation's parameter or via *Issue annotations.
 * To allow tools to show as much information as possible, descriptions can use Markdown and they can span multiple lines.
 */
/**
 * This package contains annotation types that can be used to document current development stage on type or member level.
 * Hand-edited annotations can complement the sometimes inaccurate coverage tools. All annotations are visible in javadoc
 * <p>
 * Four development stages (or levels of quality) are recognized:
 * <ul>
 * <li>{@code No*} - if that kind of content does not exist at all</li>
 * <li>{@code Stub*} - if only short placeholder exists</li>
 * <li>{@code Draft*} - if something is unfinished (regardless of how much)</li>
 * <li>{@code Complete*} - if that kind of content is finished (default)</li>
 * </ul>
 * <p>
 * The following kinds of content have predefined annotation types:
 * <ul>
 * <li>{@code *Api} - APIs, i.e. signature and semantics of public types and members</li>
 * <li>{@code *Code} - implementation code, i.e. all code behind APIs</li>
 * <li>{@code *Tests} - tests, usually unit tests</li>
 * <li>{@code *Docs} - javadoc, perhaps also external docs (presumably linked from the javadoc)</li>
 * </ul>
 * <p>
 * There is no {@code NoCode} annotation, because it has no meaning
 * and {@code StubCode} annotation should be used in its place instead.
 * Applications/libraries are free to define their own annotation types,
 * but the above listed ones are expected to be supported by scanning tools.
 * <p>
 * Nuances in meaning can be clarified in string parameter that is taken by all annotations.
 * Specific issues are however better described with {@code *Issue} annotations, which can be repeated.
 * Longer text can be included in surrounding comments, but to allow tools to display as much information as possible,
 * it is preferable to embed all comments in multi-line string literals using Markdown syntax.
 * <p>
 * Annotations have retention policy set to {@link java.lang.annotation.RetentionPolicy#RUNTIME}.
 * Tools can scan for these annotations in sources, during annotation processing, and in compiled class files.
 * Applications can scan themselves at runtime. Annotations also show up in javadoc for annotated code,
 * so that users are informed about development stage of the class/method they are using.
 * 
 * @see <a href="https://stagean.machinezoo.com/">Stagean homepage</a>
 */
package com.machinezoo.stagean;
