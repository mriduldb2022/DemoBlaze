package com.demoblaze.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoblaze.basepage.BaseClass;
import com.google.common.io.Files;

public class Utilities extends BaseClass {

	public static WebElement getExplicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);                    //Webdriver is an interface.
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elem;
	}
	
	//Clicking challenge: 
	
	//Action is not an interface, its is a class from Selenium
	//If we can not click an element using regular selenium webdriver interface then use action class click 
	
	public static void actionClick () {
		Actions action = new Actions(driver);
		action.click().build().perform();
	}
	
	
	public static void jsClick (WebElement element) {
		//CASTING- changing the type of the object, 
		// JavaScript Executor - Casting : FOR CLICKING: 

		JavascriptExecutor executor = (JavascriptExecutor) driver; 
		executor.executeScript("arguments[0].click();", element);
	}
	
	
	public static void elementScroll(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver; //CASTING-// JavaScript Executor -  FOR SCROLL IN TO VIEW :  
		executor.executeScript("arguments[0].scrollIntoView", element);
		
	}
	
	public static void scroolToBottomPage() {
		JavascriptExecutor executor = (JavascriptExecutor) driver; // JavaScript Executor - Casting : FOR scroll to bottom page : 
		executor.executeScript("Window.scrollto(0, document.body.scrollHeights)");
		
	}
	
	public static void scrollToPage () {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,0)");
		
	}
	public static void takeScreenShot() throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+ "//screenshot.screenshot.png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
		
	}
	public static void getHighLighter(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;');", element);
	}
	
	
	public static void clickDynamicElement(List<WebElement> element, int index) {
		for(int i = 0; i<element.size(); i++) {
	    	if (i>=index) { //The first element/product/index
	    		element.get(i).click();
	    		break;
	    	}
		}
	
	
		}
	public static void clickCheckBox(WebElement checkbox) {
		if(checkbox.isSelected()) {
			System.out.println("the checkbox is already selected");
		} else if(!checkbox.isSelected()) {
			checkbox.click();
			System.out.println("Now selecting the checkbox");
		} else {
			System.out.println("Checkbox did not select");
		}
	}
	
	
	
}

