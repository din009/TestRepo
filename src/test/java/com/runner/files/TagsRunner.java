package com.runner.files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberJan3\\src\\test\\java\\com\\feature\\files", 
				 glue="com.stepdefinition",
				 //tags= "@regression" //single tag execution
				 //tags = ("@smoke and @regression") // execute two tags based on AND
				 //tags=("@smoke or @sanity") //execute the tags based on OR
				 //tags="not @omit" //to ignore particular scenario
				 //tags="not @regression" //to ignore particular tag
				 //tags=("@regression and (@sanity or @smoke)") //based on AND, OR
				 tags="@Background"
				 )
public class TagsRunner {

}
