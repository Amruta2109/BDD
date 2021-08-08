package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/com/feature", 
		glue = "com.stepdefs", 
		plugin = {"pretty","html:target/report.html"},
		tags="@LoginParameter",
		dryRun=false
		
		)

public class TestRunner {

}
