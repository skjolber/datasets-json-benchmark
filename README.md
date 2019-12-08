[![Build Status](https://travis-ci.org/skjolber/datasets-json-benchmark.svg?branch=master)](https://travis-ci.org/skjolber/datasets-json-benchmark)

# datasets-json-benchmark
Project for benchmarking popular JSON parsers for Java using [JMH] on __specific datasets__.

Supported frameworks: 

  * Jackson
  * gson
  * Jsoniter
  * DSL-JSON (not yet)

Supported datasets:

  * NVE database

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
Running for OpenJDK 1.8.0 build 232, Linux 5.3.7.

A [visualization_v1.0.0] is available, summery:

| Framework | Version | Time (s) | 
| --------- | ----- |----- | 
|[gson] |  |  |
|[Jackson]|  |  |
|[jsoniter]|  | | 

In short, [jsoniter] pregenerated parser is the fastest parser. However it is imature.


# History

 - 1.0.0: Initial version

[Apache 2.0]:          			http://www.apache.org/licenses/LICENSE-2.0.html
[issue-tracker]:       			https://github.com/skjolber/datasets-json-benchmark/issues
[Gradle]:              		 	https://gradle.org/
[JMH]:					http://openjdk.java.net/projects/code-tools/jmh/
[visualization_v1.0.0]:			https://skjolber.github.io/datasets-json-benchmark/jmh_v1.0.0/index.html
[visualization_v1.1.0]:			https://skjolber.github.io/datasets-json-benchmark/jmh_v1.1.0/index.html
[visualization_v1.2.0]:			https://skjolber.github.io/datasets-json-benchmark/jmh_v1.2.0/index.html

