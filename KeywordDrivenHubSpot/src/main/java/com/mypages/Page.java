package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;
	
	
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver, 15);   //this WebDriverWait used for giving a explicitly wait of 15 seconds
				
	}	
	
	
	
	
	
	// abstract methods : methods without body
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	
	// at runtime whatever the page class we are passing like loginpage, and checking declared constructor and creating the object of that class
	
	// Suppose if we use login page class then we make object like LoginPage p = new LoginPage(); but here we not use this here we use newInstance for 
	// - for creating a object and pass a driver 
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) 
	{
		try {
		
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);   
		
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
}
