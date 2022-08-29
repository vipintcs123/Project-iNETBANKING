package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	
	
	
	// page locators :
	
	By emailId = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//button//i18n-string[@data-key='login.form.button']");
	
	
	
	// page actions :
	
	public String getLoginPageTitle()
	{
		
		return driver.getTitle();
	}
	
	
	
	public void doLogin(String username, String pwd) {
		
		doSendKeys(emailId, username);
		doSendKeys(password, pwd);
		doClick(loginButton);
		
	}
	
	
	
	
	
	

}
