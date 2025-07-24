package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F05TiraLinks.feature", 
					glue = "com.StepDef",
					tags = "@AllLinks",
					publish = true)
public class R05TiraLinks {
	/*
	 * Execute Single Scenario		tags = "@MenLink"
	 * Execute Multiple Scenarios	tags = "@MenLink or @MakeupLink"
	 * Skip Single Scenario			tags = "not @SkinLink"
	 * Skip Multiple Scenarios		tags = "not @SkinLink and not @MomLink"
	 * Execute All Scenarios		
	 */
	
	//publish = true will generate html report. Copy the link of report from console

}
