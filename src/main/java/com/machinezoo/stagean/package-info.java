// Part of Stagean: https://stagean.machinezoo.com/
/*
 * Most annotations defined in this package are named like <Quality><Kind>, for example StubApi or DraftDocs.
 * This results in a lot of annotations that can be sometimes combined in incorrect ways (e.g. StubDocs together with DraftDocs),
 * but it is preferable to level/quality parameter that would be more verbose and hard to extend.
 * 
 * Explanation of why annotations are defined the way they are:
 * 
 * @Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE, ElementType.TYPE })
 * 
 * Annotations defined here can be applied to any type or member.
 * Only locals and parameters are excluded, because it makes no sense to annotate them with development stages.
 * In the rare cases where it does make sense, for example when parameter has poor javadoc,
 * the enclosing type or member should be annotated instead with clarifying message as its value or comment.
 * 
 * @Documented
 * 
 * All annotations are marked as @Documented, so that users of the code can see the markings directly in javadoc
 * without having to wade through the code. Use of scanning tools is nevertheless preferable to annotation-spotting in javadoc.
 * 
 * @Retention(RetentionPolicy.CLASS)
 * 
 * This is the default and thus omitted. We want the annotations in class files, so that maven artifacts and other binaries can be scanned.
 * We don't want the annotations loaded at runtime, because they take up RAM and slow down loading (a bit)
 * and there is no sensible way to use them at runtime, because applications/libraries have no reason to scan themselves.
 * 
 * String value() default "";
 * 
 * It is possible to clarify every use of every annotation just by adding free-form text as the only annotation parameter.
 * From the point of view of annotation tools, all that matters is assigning quality level to a piece of code.
 * All other information can be included informally in annotation's parameter or in a comment above the annotation.
 * Annotations are not repeatable, because different issues affecting the same code can be listed in annotation's parameter.
 */
/**
 * This package contains annotation types that can be used to document current development stage on type or member level.
 * Hand-edited annotations can complement the sometimes inaccurate coverage tools.
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
 * <li>{@code *Code} - implementation excluding the API</li>
 * <li>{@code *Api} - API, the signature and behavior of public members</li>
 * <li>{@code *Tests} - tests, usually meaning unit tests</li>
 * <li>{@code *Docs} - javadoc</li>
 * </ul>
 * <p>
 * There is no {@code NoCode} or {@code NoApi} since those have no meaning and {@code DraftCode}/{@code DraftApi} should be used instead.
 * Nuances in meaning can be clarified in string parameter that is taken by all annotations.
 * Application is free to define its own annotation types.
 */
package com.machinezoo.stagean;
