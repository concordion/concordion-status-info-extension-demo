# concordion-expected-to-fail-info-extension-demo

This [Concordion](www.concordion.org) extension demo gives a visual exmple of what the concordion-expected-to-fail-info-extension does.


## Using Gradle

   1. From a command line opened at the location to which this package has been unzipped, run gradlew clean test
   2. View the Concordion output under the subfolder build/reports/spec/demo

## Running from your IDE

   Import as a Gradle project. This may require additional plugins to be installed to support Gradle.
   You can then run the Gradle task 'check' under verification which will run the tests.
   The output can be found here:
   \Users\<username>\AppData\Local\Temp\concordion\org\concordion\ext\specification
   The generated html file and can be opened in your browser.
   The test should pass successfully.