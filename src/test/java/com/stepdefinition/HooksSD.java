package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HooksSD {
	@Given("Method One")
	public void method_one() {
	    System.out.println("Hooks Method One");
	}

	@Given("Method Two")
	public void method_two() {
		System.out.println("Hooks Method Two");
	}

	@Given("Method Three")
	public void method_three() {
		System.out.println("Hooks Method Three");
	}
	
	@When("Action performed")
	public void action_performed() {
		System.out.println("Action Peformed");
	}
}
