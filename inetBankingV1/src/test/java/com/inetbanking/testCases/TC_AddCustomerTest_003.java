package com.inetbanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		
		LoginPage lp = new LoginPage(driver);   // this driver also come from base class because we extend a base class
		lp.setUserName(username);    // here user name and password come from base class
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		
		
		
		AddCustomerPage addcust = new AddCustomerPage(driver);   // this driver also come from base class because we extend a base class
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details......");
		
		addcust.custName("Vpin");
		addcust.custgender("male");
		addcust.custdob("11","15","1985");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYDE");
		addcust.custstate("AP");
		addcust.custpinno("5000994");
		addcust.custtelephoneno("987890991");
		
		
		String email = randomestring()+"@gmail.com";             // here we call randomstring method defined below, and here we got dynamic email id every time
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		
		Thread.sleep(3000);
		
		logger.info("validation started......");
		
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed......");
		}
		
		else
		{
			logger.info("test case failed......");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			
			
		}
		
		
		
	}
		
	
	/* We write below methods also in a base class so every test case can use this method, so we comment these methods here
	
	
		// we have to pass email address unique every time  , So to overcome this here we are going to generate a random email id means 
		  // every time different email generated, here we generate dynamically because application not allows same email id every time
		// So we going to make user defined method for generate a random email id, see below :
		
		
		public String randomestring()   // when we call this method , it give a random string 
		{
			String generatedstring = RandomStringUtils.randomAlphabetic(5);   // here it generate 5 character random string
			return(generatedstring);
			
		}
		
		
		
		public String randomeNum()   // when we call this method , it give a random number 
		{
			String generatedstring2 = RandomStringUtils.randomNumeric(4);   // here it generate 5 character random number
			return  generatedstring2;
			
		}
		
		
		
		*/
		
	
		 
		
		
}
	
	
	
	


