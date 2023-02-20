package com.demoblaze.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/"}, 
		glue = {"com.demoblaze.Stepdef", "com.demoblaze.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false, 						
		monochrome = true
		//tags = "@smoke, @Regression"
			
		)

	public class FeatureRunner extends AbstractTestNGCucumberTests {
}
