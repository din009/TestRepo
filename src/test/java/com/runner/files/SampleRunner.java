package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberJan3\\src\\test\\java\\com\\feature\\files\\LoginPage.feature",
				 glue="com.stepdefinition", 
			//	 dryRun=true, //not execute the script, just return the missed snippets
			//	 strict=true  //execute the script and return the missed snippets
				 monochrome=true, //ignore the human un-readable data
		    //   Previously we used format instead of plugin, 
			//   plugin used to get reports & get failed testcases
				 plugin= {"html:reports/LoginPageReport.html", "json:reports/LoginPageJsonReport.json", 
						  "rerun:target/FailedTestCases.txt"}
				)
public class SampleRunner {

}
