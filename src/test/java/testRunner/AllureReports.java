package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test

@CucumberOptions(
        features = "src/test/resources/Features/Reports.feature"
        ,glue = {"stepDefinition"}
        ,plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ,monochrome = true
        ,publish = true
)
public class AllureReports extends AbstractTestNGCucumberTests
{
}
// Git successful