package com.mytest.naveenoops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public Page page;
	
	
	
	@BeforeMethod
	@Parameters(value= {"browser"})    // here browser value comes from a testng.xml file so we use parameters keyword to read from testng.xml file
	public void setUpTest(String browser) throws InterruptedException
	{
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		
			
		} else 
		{
			
			System.out.println("No browser is defined in xml file.......");
			
		}
		
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
	
		page = new BasePage(driver);   // here we make a object of BasePage because Page class is abstract so we cannot create object of page class
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	
}
