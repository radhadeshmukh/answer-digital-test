package com.automatedtest.digital;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/Feature/DragandDropElement.feature"}, 
        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.automatedtest.digital.infrastructure.driver",
                "com.automatedtest.digital.draganddropelement"})
public class DragandDropElementTest {

}
