package com.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSD extends BaseClass{
	@Given("Open Browser")
	public void open_browser() {
	   browserOpen("chrome");
	}

	@Given("Launch Adactin URL")
	public void launch_adactin_url() {
	   loadUrl("https://adactinhotelapp.com/");
	}

	@When("Enter the Username {string}")
	public void enter_the_username(String string) {
		WebElement user = findElementById("username");
		dataSend(user, string);
	}

	@When("Enter the Password {string}")
	public void enter_the_password(String string) {
		WebElement pwd = findElementById("password");
		dataSend(pwd, string);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	   WebElement loginBtn = findElementByXpath("//input[@id='login']");
	   click(loginBtn);
	}

	@Then("Validate User Logged successfully")
	public void validate_user_logged_successfully() {
	  WebElement loggedIn = findElementByXpath("//*[@name='username_show']");
	  boolean result = loggedIn.isDisplayed();
	  assertEquals(true, result);
	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as(String string) {
		WebElement user = findElementById("username");
		dataSend(user, string);
	}
	@When("Enter the Password as {string}")
	public void enter_the_password_as(String string) {
		WebElement pwd = findElementById("password");
		dataSend(pwd, string);
	}
}
