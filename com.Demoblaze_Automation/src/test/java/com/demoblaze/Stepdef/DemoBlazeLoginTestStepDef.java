package com.demoblaze.Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.demoblaze.basepage.BaseClass;
import com.demoblaze.elements.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoBlazeLoginTestStepDef extends BaseClass{

	ElementPage PF = PageFactory.initElements(driver, ElementPage.class);
	
	@Given("User opens the browser")
	public void user_opens_the_browser() {
	  //BaseClass.SetUp();
	   
	}

	@Given("User navigates to {string}")
	public void user_navigates_to(String string) {
	  
	   
	}

	@When("User clicks on the Login button")
	public void user_clicks_on_the_Login_button() {
	   PF.getLoginButton().click();
	}

	@When("User enters the email")
	public void user_enters_the_email() throws InterruptedException {
		PF.getEmail().sendKeys("mriduldb@yahoo.com");
		Thread.sleep(5000);
	}

	@When("User enters the password")
	public void user_enters_the_password() throws InterruptedException {
		PF.getPassword().sendKeys("1234567");
		Thread.sleep(5000);
	}

	@When("User clicks on the submit button")
	public void user_clicks_on_the_submit_button() throws InterruptedException {
		PF.getSubmitButton().click();
	   Thread.sleep(5000);
	}

	@Then("User is successfully logged in and username is displayed")
	public void user_is_successfully_logged_in_and_username_is_displayed() {
		String expected = "Welcome mriduldb@yahoo.com";
		String actual = driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).getText();
	   Assert.assertEquals(actual, expected);
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	  System.out.println("The Title of the application is : " + driver.getTitle());
	  
//	  	Assert to find Webpage: 
	  
//	    String expected = webpage;
//		String actual;
//		driver.manage().deleteAllCookies();
//		driver.get(webpage);
//		actual = driver.getCurrentUrl();
//		Assert.assertEquals(actual, expected);

	   
	}
}
