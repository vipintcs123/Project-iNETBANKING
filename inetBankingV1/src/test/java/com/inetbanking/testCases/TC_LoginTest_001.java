package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException
	{
		
	
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);                // here username and password comes from a base class that we already defined in baseclass.java
		logger.info("Entered username");            // In base class we got data from a readconfig file, read config file will access the data of .properties file
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
			
		}
		
		else
		{
			captureScreen(driver, "loginTest");  // here we pass driver and test case name,  this method is defined in a base class
			Assert.assertTrue(false);
			logger.info("Login Test failed");
			
		}
	}
	

}
