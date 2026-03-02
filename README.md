# Java Kitchen Sink

A collection of various Java examples and experiments using different build systems.

## Structure

This repository contains independent projects, each with its own build system:

- **core-java**: Plain Java examples using Maven
- **spring-examples**: Spring-related examples
  - **spring-boot**: Spring Boot examples using Maven
- **gradle-examples**: Java examples using Gradle

## Requirements

- Java 17+
- Maven 3.6+ (for Maven projects)
- Gradle 7+ (for Gradle projects)

## Building

Each project is independent. Navigate to the specific directory and use the appropriate build tool:

### Maven Projects
```bash
cd core-java
mvn clean install
```

```bash
cd spring-examples/spring-boot
mvn clean install
```

### Gradle Projects
```bash
cd gradle-examples
./gradlew build
```

## Running Examples

Each project contains its own examples that can be run independently. Check the README in each project for specific instructions.