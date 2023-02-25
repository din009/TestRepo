package com.runner.files;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/java/com/feature/files/LoginPage.feature",
				 glue="com.stepdefinition", 
			//	 dryRun=true, //not execute the script, just return the missed snippets
			//	 strict=true  //execute the script and return the missed snippets
				 monochrome=true, //ignore the human un-readable data
		    //   Previously we used format instead of plugin, 
			//   plugin used to get reports & get failed testcases
				 plugin= {"html:reports/LoginPageReport.html", "json:reports/LoginPageJsonReport.json", 
						  "rerun:target/FailedTestCases.txt"}
				)
public class SampleTestNgRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	
}
