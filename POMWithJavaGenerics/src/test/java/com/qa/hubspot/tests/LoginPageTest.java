package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();                 // here getInstance() method give object of LoginPage class
		System.out.println("Login page title is: " +title);
		Assert.assertEquals(title, "HubSpot Login");
		
	}
	
	
	
	@Test(priority=2)
	public void loginTest()
	{
		
		 page.getInstance(LoginPage.class).doLogin("vipinshukla714@gmail.com", "Lawyer123@@");
	}
	
	
	
	
	
	

}
