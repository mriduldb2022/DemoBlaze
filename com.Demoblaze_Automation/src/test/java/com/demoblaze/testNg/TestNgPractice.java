package com.demoblaze.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgPractice {
	WebDriver driver;
	
	@BeforeMethod
	public void StartUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}
	
	@Test()
	public void ClickLoginButton() {
		driver.findElement(By.xpath("//*[@data-target='#logInModal']")).click();
	}
	
}
