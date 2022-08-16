package com.inetbanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	
	
	@Test(dataProvider = "LoginData")   // This test method read the data from a Data provider method which is defined below
	public void loginDDT(String user,String pwd) throws InterruptedException   
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
	   Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			
			driver.switchTo().alert().accept();     // close the alert
			driver.switchTo().defaultContent();    // now switch to main-page/top window
			Assert.assertTrue(false);             // this false test case
			logger.warn("Login failed");
			
		}
		
		
		else
		{
			
			Assert.assertTrue(true);  
			logger.info("Login passed");
			lp.clickLogout();
			
			Thread.sleep(3000);
			
			driver.switchTo().alert().accept();  // switch to alert and then close the logout alert
			driver.switchTo().defaultContent();  // now switch to main-page/top window
			
		}
			
		
	}
	
	
	
	
	
	
	 // method to verify alert is present or not, if alert present then this method return true otherwise it return false
	
	// below method is user defined method to check alert is present or not
	
	
	public boolean isAlertPresent() 
	{
		
		try {
		driver.switchTo().alert();       // if alert is present then it switch to alert otherwise it throw an exception so we use try catch
		return true;
		} 
		catch(NoAlertPresentException e)
		{
			return false;
			
		}
			
	}
	
	
	
	
	
	
	// data provider used to provide data to test method, below method is data provider method
	
	// Data provider will take data from excel and stores data into two dimensional array and finally it returns the two dimensional to the actual test case.
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		
		int rownum = XLUtils.getRowCount(path, "Sheet1");  // here we got row count
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);   // here we get a column count
		
		
		// we have to create 2d array before read the data from excel, because the data we have to stored in 2D array bcoz data come in form of 2d array
		
		
		// we have to create 2d array of size equal to total no of rows and column
		
		String logindata[][] = new String[rownum][colcount];  // create array equal to row and column present in excel sheet
		
		
		// here we capture the data which stored in 2d format
		
		for(int i=1;i<=rownum;i++)   // this outer for loop represent the no of rows, here i represent row number
		{
			
			for(int j=0;j<colcount;j++)    // this inner for loop represents the every column from a particular row, here  j represent column number
				
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);  // here data come from excel and store as 2d array
				
			}
		}
		
		
		return logindata;
		
	}
	
	
	
	
	
	
	

}
