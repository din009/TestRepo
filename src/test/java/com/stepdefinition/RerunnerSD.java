package com.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class RerunnerSD {
	@Given("Test Method One")
	public void test_method_one() {
	    System.out.println("Test Method One");
	}

	@Given("Test Method Two")
	public void test_method_two() {
		System.out.println("Test Method Two");
		Assert.fail();
	}

	@Given("Test Method Three")
	public void test_method_three() {
		System.out.println("Test Method Three");
		Assert.fail();
	}
}
