[![Maven Central](https://img.shields.io/maven-central/v/com.machinezoo.stagean/stagean)](https://search.maven.org/artifact/com.machinezoo.stagean/stagean)
[![Build Status](https://travis-ci.com/robertvazan/stagean.svg?branch=master)](https://travis-ci.com/robertvazan/stagean)

# Stagean annotations #

Stagean is a Java library of annotation types that let you document development stage of your project on class or method level. Hand-edited Stagean annotations complement automated coverage and analysis tools to create overall picture of project's state and progress.

## Example ##

```java
@NoDocs
@DraftTests("async scenarios are untested")
public class MyClass {
    @StubCode
    public void doSomething() {
        throw new UnsupportedOperationException();
    }
    // ...
}
```

In the above example, `@NoDocs`, `@DraftTests`, and `@StubCode` are development stage annotations.

## Download ##

Stagean is available from [Maven Central](https://search.maven.org/artifact/com.machinezoo.stagean/stagean). Further setup instructions are on the [website](https://stagean.machinezoo.com/). Stagean is distributed under [Apache License 2.0](LICENSE).

## Status ##

Stagean API is stable. Stagean is currently used only in author's own projects, but it is intended for public use.

## Documentation ##

[Stagean website](https://stagean.machinezoo.com/) provides background, overview, and examples. Use [javadoc](https://stagean.machinezoo.com/javadoc/com/machinezoo/stagean/package-summary.html) for reference.

## Contribute ##

Bug reports, feature suggestions, and pull requests are welcome. For major changes, open an issue first to discuss the change.

* Sources: [GitHub](https://github.com/robertvazan/stagean), [Bitbucket](https://bitbucket.org/robertvazan/stagean)
* Issues: [GitHub](https://github.com/robertvazan/stagean/issues), [Bitbucket](https://bitbucket.org/robertvazan/stagean/issues)
* License: [Apache License 2.0](LICENSE)

