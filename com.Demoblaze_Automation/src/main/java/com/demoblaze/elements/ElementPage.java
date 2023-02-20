package com.demoblaze.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.basepage.BaseClass;

public class ElementPage extends BaseClass {

	public ElementPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@data-target='#logInModal']")
	private WebElement LoginButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	
	@FindBy(id = "loginusername")
	private WebElement Email;
	public WebElement getEmail() {
		return Email;
	}

	
	@FindBy(id = "loginpassword")
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy (xpath = "//*[@onClick='logIn()']")
	private WebElement SubmitButton;
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
	
}
