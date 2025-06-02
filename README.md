# Fibonacci Series in Kotlin

[![version](https://img.shields.io/badge/version-1.0.3-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/fibonacci/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/fibonacci/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/fibonacci/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/fibonacci)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.21-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-8.14.1-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

## Features

- Tail-recursive `fibonacci(n)` function
- `printFibonacciSeries(n)` to return a string of all Fibonacci numbers up to `n`
- Full JUnit 5 test coverage
- Written in idiomatic Kotlin

## Usage

```kotlin
val result = fibonacci(10) // 55
val series = printFibonacciSeries(6) // "0, 1, 1, 2, 3, 5, 8"
````

## Requirements

* Kotlin 2.1.21
* JDK 21+
* Gradle

## Running the tests

```bash
./gradlew test
```

## Project structure

```
├── src/
│   └── main/kotlin/rk/powermilk/Fibonacci.kt
│   └── test/kotlin/rk/powermilk/FibonacciTest.kt
├── build.gradle.kts
├── README.md
```

## License

This project is licensed under the MIT License.

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Rafał Kociniewski** - [PowerMilk](https://github.com/rkociniewski)
