
[![Build Status](https://travis-ci.org/skjolber/datasets-json-benchmark.svg?branch=master)](https://travis-ci.org/skjolber/datasets-json-benchmark)

# datasets-json-benchmark
Project for benchmarking popular JSON parsers for Java using [JMH] on __specific datasets__.

Supported frameworks: 

  * [Jackson]
  * [Gson]
  * [Jsoniter]

Supported datasets:

  * NVE database
     * Full schema parsing
     * Reduced schema parsing (skipping values not actually in use)
          * OWASP Dependency Check 

## License
[Apache 2.0]

# Obtain
The project is based on [Gradle].

# Usage
Modify the build version to your current snapshot, then run 

```
./gradlew --stop && ./gradlew clean jmhClasses jmh --refresh-dependencies --info
```

The JMH plugin seems to have trouble refreshing the project, so restart the Gradle deamon before running.
## Benchmarks

  * Deserialize to objects

## Results

### Java 8
Running for OpenJDK 1.8.0 build 232, Linux 5.3.14.

A [visualization_v1.0.0-JDK8] is available, summery:

 * GSON is slowest
 * Jackson is about twice as fast
 * Joniter is at 30-40% faster than Jackson
 * Reduced schema parsing is faster. 

In short, [jsoniter] pregenerated parser is the fastest parser. However a bug was detected in the stream handling, so the library seems not to have sufficient quality testing / code coverage.

### Java 11
Running for OpenJDK 11 build 11.0.5+10-LTS, Linux 5.3.14.

A [visualization_v1.0.0-JDK11] is available; same results as above.

 * Jackson does relatively better
 * Performance regressions for the other two

# History

 - 1.0.0: Initial version

[Apache 2.0]: http://www.apache.org/licenses/LICENSE-2.0.html
[issue-tracker]: https://github.com/skjolber/datasets-json-benchmark/issues
[Gradle]: https://gradle.org/
[JMH]: http://openjdk.java.net/projects/code-tools/jmh/
[visualization_v1.0.0-JDK11]: https://skjolber.github.io/datasets-json-benchmark/jmh_v1.0.0-JDK11/index.html
[visualization_v1.0.0-JDK8]: https://skjolber.github.io/datasets-json-benchmark/jmh_v1.0.0-JDK8/index.html
[Jsoniter]: https://github.com/json-iterator
[Jackson]: https://github.com/FasterXML/jackson
[Gson]: https://github.com/google/gson
