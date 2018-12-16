# concordion-status-info-extension-demo

This [Concordion](www.concordion.org) extension demo gives a visual example of what the concordion-status-info-extension does.


## Using [Gradle](www.gradle.org)

   1. From a command line opened at the location to which this package has been unzipped, run gradlew clean test
   2. View the Concordion output under the subfolder build/reports/spec/demo

## Running From Commandline

From the command line, cd to the folder containing a copy of this project, and run
```./gradlew clean build``` on Unix-based systems, or ```.\gradlew clean build``` on Windows.

This will download the required dependencies, clean the existing project, recompile all source code and run all the tests.

View the Concordion run reports in build/reports/spec/org/concordion/ext/specification/ 


## Running from an IDE

   Import as a Gradle project. This may require additional plugins to be installed to support Gradle.
   You can then run the Gradle task 'build' under tasks/build which will run the tests.
   The output can be found here:
   \Temp\concordion\org\concordion\ext\specification
   
   The generated html files and can be opened in your browser.
   The tests should pass successfully.
