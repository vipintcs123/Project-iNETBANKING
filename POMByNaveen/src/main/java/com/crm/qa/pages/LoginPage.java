package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	
	// PageFactory - OR:
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	
	@FindBy(linkText="Sign Up")
	WebElement signUpBtn;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Subscribe to notifications')]")
	WebElement crmsubscribeLogo;
	
	
	// now we initialize the all the elements, here we initialize all the page objects
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);    // this means current class object, all above elements are initialized with driver
	}
	

	
	
	// now we write action methods which are available on Login page
	
	
	
	public String validateLoginPageTitle()
	{
		
		return driver.getTitle();
	}
	
	
	public boolean validateCRMImage() throws InterruptedException
	{
		Thread.sleep(3000);
		return crmsubscribeLogo.isDisplayed();       // it return true if subscribe logo is present otherwise it returns false
		
	}
	
	
	
	
	public HomePage login(String un, String pwd) throws InterruptedException
	{
		Thread.sleep(3000);
		username.sendKeys(un);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		loginBtn.click();	  // after click on login button it goes to home page so this login method return home page class object
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
}
