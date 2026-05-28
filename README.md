<h1 style="text-align: center">Back-end testing project using the required configuration to launch with a test runner using JUnit 5</h1>

![Badge en Desarollo](https://img.shields.io/badge/STATUS-IN%20EVOLUTION-blue)
![Static Badge](https://img.shields.io/badge/Java-red?style=flat-square)
![GitHub followers](https://img.shields.io/github/followers/luisrestrepo6940?style=flat&logo=github)
![Static Badge](https://img.shields.io/badge/Serenity-8A2BE2?style=flat-square)
![Static Badge](https://img.shields.io/badge/Gradle-blue?style=flat-square)

### CONTENT

* [Introduction](#introduction).
* [Requirements](#requirements).
* [Recommended](#recommended).
* [Configuration](#configuration).
* [Test Runner Settings](#test-runner-settings).
* [Troubleshooting](#troubleshooting).
* [Maintainers](#maintainers).

### INTRODUCTION

Automated API testing project, printing consumption details to the log: Request method, Request URI, .Body, Response, and more.

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

#### The project directory structure
The project has build scripts for Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
+ main
    + java
        + co
            + com
                + certification
                    + exceptions
                    + integrations
                    + interactions
                    + models
                    + questions
                    + tasks
                    + userinterfaces
                    + utils
    + resources                
+ test
    + java
        + co
            + com
                + certification
                        + runners
                        + stepdefinitions
    + resources
        + features                  Feature files
```
### REQUIREMENTS

* Serenity-core: 5.3.10.
* Serenity-junit: 5.3.10.
* Serenity-screenplay: 5.3.10.
* Serenity-cucumber: 5.3.10.
* Serenity-screenplay-rest: 5.3.10. 
* Junit-jupiter: 5.10.2. 
* Cucumber-junit-platform-engine: 7.14.0
* Junit-platform-suite: 1.10.2
  
[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### RECOMMENDED

* SDK amazon corretto version 21.0.7.
* Gradle gradle-8.5-bin.zip

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### CONFIGURATION

Download or clone the repository and configure the settings and project structure with SDK amazon corretto version 21.0.7 and gradle 8.5.

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### TEST RUNNER SETTINGS

Test runner:

```java
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")

public class TestRunnerCumulativeRecord {
}
```

File junit-platform.properties:

```properties
cucumber.snippet-type=camelcase
cucumber.glue=co.com.certification.stepdefinitions
cucumber.plugin=pretty, net.serenitybdd.cucumber.core.plugin.SerenityReporterParallel
```

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### RESPONSE LOG EXAMPLE

Please write or contact the Teams user or email luis.f.restrepo@accenture.com

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### TROUBLESHOOTING

Please write or contact the Teams user or email luis.f.restrepo@accenture.com

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)

### MAINTAINERS

Luis Fernando Restrepo Agudelo - luis.f.restrepo@accenture.com

[![Go Back Badge](https://img.shields.io/badge/Back-gray?style=flat)](#content)
