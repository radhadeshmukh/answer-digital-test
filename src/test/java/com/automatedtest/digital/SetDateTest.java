package com.automatedtest.digital;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/Feature/SetDate.feature"}, 
        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.automatedtest.digital.infrastructure.driver",
                "com.automatedtest.digital.SetDate"})
public class SetDateTest {

}
