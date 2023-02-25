package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberJan3\\src\\test\\java\\com\\feature\\files",
				 glue="com.stepdefinition")
public class HooksRunner {

}
