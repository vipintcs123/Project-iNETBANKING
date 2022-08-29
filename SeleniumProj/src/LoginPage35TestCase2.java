import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage35TestCase2 {   // fro this we use TestCase2Lec35 class, RedirectLec35TestCase2 and ErrorMessage class

	 WebDriver abcd;
	 
	 
	 // Create web elements using elements locators 
	 
	 By User = By.name("username");
	 By Pwd = By.name("password");
     By LoginButton = By.id("tdb1");
     By ErrorMessage = By.className("messageStackError");
     By CatalogLink = By.linkText("Online Catalog");
     
     
     
     
     // Now we going to create constructor for this class
     
     public LoginPage35TestCase2 (WebDriver abcd2)
     {
    	 
    	 this.abcd = abcd2;
     }
     
     
     
     
     // create customized commands
     
     
     public void typeUsername(String Uname)
     
     {
    	 abcd.findElement(User).sendKeys(Uname);
    	 
     }
     
     
     
     public void typePassword(String Password)
     
     {
    	 abcd.findElement(Pwd).sendKeys(Password);
    	 
     }
     
     
     
     public void clickLoginButton()
     
     {
    	 abcd.findElement(LoginButton).click();
    	 
     }     
     
     
    public String captureErrorMessage()
     
     {
         String message = abcd.findElement(ErrorMessage).getText();   // getText() returns string type data that is system defined
         
         return message;
    	 
     }     
    
    
    
    public void clickLink()
    
    {
    	abcd.findElement(CatalogLink).click();
    	
    }
     
     
	 

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	
}
