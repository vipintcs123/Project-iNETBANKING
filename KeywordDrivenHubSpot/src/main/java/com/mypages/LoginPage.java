/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Vipin Shukla
 *
 */

public class LoginPage extends BasePage {
	
	
	// page locators , we use private because we encapsulate the elements, we cannot use elements outside the class
	
	 private By emailId = By.id("username");
	 private By password = By.id("password");
	 private By loginButton = By.xpath("//*[@data-key='login.form.button']");
	 private By header = By.xpath("//*[@data-key='login.signupLink.text']");

	public LoginPage(WebDriver driver) {
		super(driver);


	}


	
	
	// getters, how to access private variable of the class with the help of public variable so we use getters for this

	
	public WebElement getEmailId() {
		
		
		return getElement(emailId);   // it returns a element for emailid and goes to a BasePage where WebElement method is defined for recognizing an element
	}


	
	
	
	
	public WebElement getPassword() {
		
		return getElement(password);    // it returns a element for password and goes to a BasePage where WebElement method is defined for recognizing an element 
	}

	
	
	
	
	
	
	
	public WebElement getLoginButton() {
		
		return getElement(loginButton);  // it returns a element for button and goes to a BasePage where WebElement method is defined for recognizing an element
	}

	
	
	
	
	
	public WebElement getHeader() {

		return getElement(header);
	
	}

	

	
	
	
	public String getLoginPageTitle()
	{
		
		return getPageTitle();
	}
	
	
	
	
	public String getLoginPageHeader()
	{
		
	 return getPageHeader(header);
		
	}
	
	
	
	

	
	 public HomePage doLogin(String username, String pwd)
	 {
		 getEmailId().sendKeys(username);
		 getPassword().sendKeys(pwd);
		 getLoginButton().click();            
		 
		 return getInstance(HomePage.class);  // When we click on login then return landing page class object that is Home page because after login it go to next page
		 
		 // here we return HomePage class object
		 
	 }
	
	
	
// here below we do method overloading with negative testing, here we login without user name and password
		
	 public void doLogin()
	 {
		 getEmailId().sendKeys("");
		 getPassword().sendKeys("");
		 getLoginButton().click();            
		 
	 }
	
	
	 // here below we also do method overloading by passing either user name or password like username and blank password etc or we pass userCredentials
	 
	 // username : vipinshukla715@gmail.com  , here we want only email id and we not want username keyword so we split on the basis of :
	 // here we use split, this is also negative testing with different credentials
		
	 public void doLogin(String userCred)
	 {

       if(userCred.contains("username"))
       {
    	   
    	   getEmailId().sendKeys(userCred.split(":")[1].trim());
       }
       
       else if(userCred.contains("password"))
       {
    	   
    	   getEmailId().sendKeys(userCred.split(":")[1].trim());
    	   
       }
       
       
        getLoginButton().click();
        
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
