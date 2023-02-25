package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberJan3\\src\\test\\java\\com\\feature\\files\\RerunnerSample.feature",
				 glue="com.stepdefinition", 
				 plugin= {"rerun:target/FailedTestcase.txt"})
public class FailedTestRunner {

}
