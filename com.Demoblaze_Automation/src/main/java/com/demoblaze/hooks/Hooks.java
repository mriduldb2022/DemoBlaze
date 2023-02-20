package com.demoblaze.hooks;

import com.demoblaze.basepage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	//Initialize Starts the Browser before every scenario 
		@Before
		public static void initialize() {
		//	BaseClass.initializeProperties();
			BaseClass.SetUp();;
			
		}
		
		
		
		
		//TearDown will quit the Browser after every scenario 
		@After
		public static void tearDown() {		
			driver.quit();
			
		}
}
