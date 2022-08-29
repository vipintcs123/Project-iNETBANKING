package com.qa.hubspot.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().fullscreen();
		driver.get("https://app-eu1.hubspot.com/login");
		
		// now we create object of page class
		
		page = new Page(driver,wait);
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	
}
