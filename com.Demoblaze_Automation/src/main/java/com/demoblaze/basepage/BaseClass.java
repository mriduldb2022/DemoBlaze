package com.demoblaze.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void SetUp() {
		
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		driver.findElement(By.xpath("//*[@data-target='#logInModal']")).click();
//		driver.findElement(By.id("loginusername")).sendKeys("mriduldb@yahoo.com");
//		driver.findElement(By.id("loginpassword")).sendKeys("1234567");
//		driver.findElement(By.xpath("//*[@onClick='logIn()']")).click();
//		
//		
//		
//		String expected = "Welcome mriduldb@yahoo.com";
//		String actual = driver.findElement(By.id("nameofuser")).getText();
//		Assert.assertEquals(actual, expected);
//		
//		
//		System.out.println("The Title of the application is : " + driver.getTitle());
//		
		
	}
	
	public static void main(String[] args) {
		// BaseClass.SetUp();
	}
}
