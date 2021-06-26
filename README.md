[![Build and Test](https://github.com/concordion/concordion-status-info-extension-demo/actions/workflows/ci.yml/badge.svg)](https://github.com/concordion/concordion-status-info-extension-demo/actions/workflows/ci.yml)
[![Apache License 2.0](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

This [Concordion](www.concordion.org) extension demo gives a visual example of what the concordion-status-info-extension does.


## Using [Gradle](www.gradle.org)

   1. Include the following line in a gradle build file:
   
   ``` testCompile 'org.concordion:concordion-expected-to-fail-info-extension:+' ```
   
   2. From a command line opened at the location to which this package has been unzipped, run gradlew clean test
   3. View the Concordion output under the subfolder build/reports/spec/demo

## Running From Commandline

From the command line, cd to the folder containing a copy of this project, and run
```./gradlew clean build``` on Unix-based systems, or ```gradlew clean build``` on Windows.

This will download the required dependencies, clean the existing project, recompile all source code and run all the tests.

View the Concordion run reports in build/reports/spec/org/concordion/ext/specification/ 


## Running from an IDE

   Import as a Gradle project. This may require additional plugins to be installed to support Gradle.
   You can then run the Gradle task 'build' under tasks/build which will run the tests.
   The output can be found here:
   \Temp\concordion\org\concordion\ext\specification
   
   The generated html files and can be opened in your browser.
   
   The tests should pass successfully.
