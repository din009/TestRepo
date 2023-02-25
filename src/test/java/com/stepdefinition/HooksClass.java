package com.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksClass {

	@Before
	public void beforeEachScenario() {
		System.out.println("execute before the Scenario"); //Browser Open, Launch URL
	}
	
	@After
	public void afterEachScenario() {
		System.out.println("execute after the Scenario"); //page close
	}
	
	
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		System.out.println("Execute before each step");
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.isFailed();
		System.out.println("Execute after each step");
	}
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("Execute Before all");
	}
	@AfterAll
	public static void afterall() {
		System.out.println("Execute After all");
	}
	
}
