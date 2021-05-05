# Automation Test

This repository contains the code for automation test for answer digital.

## Get the code

Git:

    git clone https://github.com/radhadeshmukh/answer-digital-test
    cd answer-digital-test


Or simply [download a zip](https://github.com/radhadeshmukh/answer-digital-test/archive/main.zip) file.

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. 


## Using Junit to run the tests

- Import the code into an IDE like Eclipse or Netbeans.
- Right click on the project.
- Select "Run As" "Junit Test".
- The tests will start their execution.

## Overriding options

The Cucumber runtime parses command line options to know what features to run, where the glue code lives, what plugins to use etc.
When you use the JUnit runner, these options are generated from the `@CucumberOptions` annotation on your test.

Sometimes it can be useful to override these options without changing or recompiling the JUnit class. This can be done with the
`cucumber.options` system property. The general form is:

Using Maven:

    mvn -Dcucumber.features="..." -Dcucumber.glue="..." test


## What tests are being checked?

URL used for the test - https://demoqa.com/

- Enter all details into the student registration form and submit
- Click on the second button and accept the alert
- Hover over the button and the input field
- Drag and drop element into specific area
- Close the small modal
- Use the date picker to set the date to 1 month in the future

## Where are the feature files?

There are in total six feature files located inside `src/test/java/resources/com/automatedtest/Feature` directory. These feature files are being loaded in the runner class using `@CucumberOptions` annotation. 

```
@CucumberOptions(features = {"src/test/resources/com/automatedtest/Feature/Alert.feature"}, 
        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.automatedtest.digital.infrastructure.driver",
                "com.automatedtest.digital.Alert"})
```
