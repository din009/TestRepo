package com.stepdefinition;

import io.cucumber.java.en.Given;

public class BackgroundSD {
	@Given("Open Browser and Launch Amazon URL")
	public void open_browser_and_launch_amazon_url() {
	   System.out.println("Amazon URL launched in Browser");
	}
	
	@Given("Sample Method One")
	public void sample_method_one() {
	   System.out.println("Valid Username and Valid Password");
	}

	@Given("Sample Method Two")
	public void sample_method_two() {
		  System.out.println("Valid Username and InValid Password");
	}

	@Given("Sample Method Three")
	public void sample_method_three() {
		System.out.println("Invalid Username and Valid Password");
	}

}
