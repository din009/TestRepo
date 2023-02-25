package com.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSD {

	@Given("Open Browser and pass Adacting URL")
	public void open_browser_and_pass_adacting_url() {
	   System.out.println("Open Browser with Adactin URL");
	}
    //asList
	@When("Enter the Username as List")
	public void enter_the_username_as_list(DataTable dataTable) {
	  List<String> data = dataTable.asList();
	  System.out.println(data.get(1));
	}

	@When("Enter the Password as List")
	public void enter_the_password_as_list(DataTable dataTable) {
		 List<String> data = dataTable.asList();
		  System.out.println(data.get(1));
	}

	@When("Click Login button")
	public void click_login_button() {
	   System.out.println("Login button Clicked");
	}

	@Then("User logged into Adactin")
	public void user_logged_into_adactin() {
	  System.out.println("User logged in Successfully");
	}
	
	//asLists
	@When("Enter the Username as Lists")
	public void enter_the_username_as_lists(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(1).get(1));
	}

	@When("Enter the Password as Lists")
	public void enter_the_password_as_lists(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(0).get(1));
	}

	//asMap
	@When("Enter the Username as Map")
	public void enter_the_username_as_map(DataTable dataTable) {
	   Map<String, String> data = dataTable.asMap();
	   System.out.println(data.get("username"));
	}

	@When("Enter the Password as Map")
	public void enter_the_password_as_map(DataTable dataTable) {
	   Map<String, String> data = dataTable.asMap();
	   System.out.println(data.get("password"));
	}

	//asMaps
	@When("Enter the User details as Maps")
	public void enter_the_user_details_as_maps(DataTable dataTable) {
	  List<Map<String, String>> data =  dataTable.asMaps();
	  	System.out.println(data.get(0).get("Mail"));
	  	System.out.println(data.get(2).get("Password"));
	}


}
