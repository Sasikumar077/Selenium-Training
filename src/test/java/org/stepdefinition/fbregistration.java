package org.stepdefinition;

import org.baseclass.baseclass;
import org.test.pojoproject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbregistration extends baseclass{
	
	pojoproject f;
	@Given("User has to Launch the browser and maximise the window")
	public void user_has_to_Launch_the_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	    f = new pojoproject();
	    passText(em, f.getVarRef());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
	    f = new pojoproject();
	    passText(pass, f.getPassword());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	    f = new pojoproject();
	    clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}
	
	
}	

