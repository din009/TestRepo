package com.stepdefinition;

import io.cucumber.java.en.Given;

public class TagsSD {
	@Given("Tags Sample Method One")
	public void tags_sample_method_one() {
	    System.out.println("Method One");
	}

	@Given("Tags Sample Method Two")
	public void tags_sample_method_two() {
	   System.out.println("Method Two");
	}

	@Given("Tags Sample Method Three")
	public void tags_sample_method_three() {
		 System.out.println("Method Three");
	}

	@Given("Tags Sample Method Four")
	public void tags_sample_method_four() {
		 System.out.println("Method Four");
	}

	@Given("Tags Sample Method Five")
	public void tags_sample_method_five() {
		 System.out.println("Method Five");
	}

	@Given("Tags Sample Method Six")
	public void tags_sample_method_six() {
		System.out.println("Method Six");
	}
}
