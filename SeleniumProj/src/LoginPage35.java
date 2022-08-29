import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage35 {   // for this we use class TestCase1Lec35
	
	WebDriver Neisha;
	
	
	
	// Create element using element locators 
	
	
	By User = By.name("username");
	By Pwd = By.name("password");
	By LoginButton  = By.id("tdb1");
	
	
	
	public LoginPage35(WebDriver Farjana)     // One constructor only for one class
	{
		
		this.Neisha = Farjana;  
		
	}
	
	
	
	  //Create User Actions / Customized commands, below we write all the customized commands 
	 
	
	//  customized command for username edit box
	
	public void typeUsername(String Uname)
	{
	   Neisha.findElement(User).sendKeys(Uname);	
	}
	
	
	//  here we return a value from username edit box 
	
	public void captureUsername()   
	{
	   Neisha.findElement(User).getAttribute("value");	
	}
	
	
	
	// to clear the value from a edit box
	
	public void clearUsername()   
	{
	   Neisha.findElement(User).clear();	
	}
	
	
	// to enter a password in a password edit box
	
	public void typePassword(String Password)   
	{
	   Neisha.findElement(Pwd).sendKeys(Password);	
	}
	
	
	
	// to click a login button
	
	public void clickLoginButton()   
	{
	   Neisha.findElement(LoginButton).click();
	}
	
	
	
	
	
	
	

}
