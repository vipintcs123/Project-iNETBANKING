package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	
	}
	
	
	
	// now we write a generic util wrapper or action method
	
	public void doClick(By locator)
	{
		driver.findElement(locator).click();;
		
	}

	
	public void doSendKeys(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
		
	}

	
	public String doGetText(By locator)
	{
		
		return driver.findElement(locator).getText();
	}
	
	
	
	
	
}
