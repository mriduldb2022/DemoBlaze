package com.demoblaze.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.basepage.BaseClass;
import com.demoblaze.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeNegativeTestStepDef extends BaseClass {
	
	ElementPage PF = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("I open the browser and I navigate to the application")
	public void i_open_the_browser_and_i_navigate_to_the_application() {
	    //BaseClass.SetUp();
	   
	}

	@When("I click on the Login button on the homepage")
	public void i_click_on_the_login_button_on_the_homepage() {
		PF.getLoginButton().click();
	   
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		PF.getEmail().sendKeys("mriduldb@yahoo.com");
		PF.getPassword().sendKeys("1234567");
	   
	}

	@When("I click on the Submit button")
	public void i_click_on_the_submit_button() {
	   PF.getSubmitButton().click();
	}

	@Then("I am suppose to get an error message")
	public void i_am_suppose_to_get_an_error_message() {
	    
	   
	}
}
