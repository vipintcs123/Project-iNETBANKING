import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationComm {

	public static void main(String[] args) throws InterruptedException {

	        	// Instantiate google chrome browser driver
		
				System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();  // creating chrome browser driver in web driver interface
				
				driver.manage().window().maximize();
				
				driver.get("https://www.google.com/");
				Thread.sleep(3000);
				
				
				// Example for isDisplayed() verification command
				
				//boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
				//System.out.println(linkPresent);   // Output :- true because link is present in google home page
				
				//driver.close();
				
				
				
				
				
				
				
				
				
				// Example for isEnabled() verification command
				

				//boolean linkPresent = driver.findElement(By.linkText("Gmail")).isEnabled();
				//System.out.println(linkPresent);   // Output :- true because link is present in google home page
				
				//driver.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				// Example for isSelected() verification command, it applicable only for radiobutton andd checkbox only, here we write code for radiobutton
				
				driver.get("https://gcreddy.com/project/create_account.php");
				Thread.sleep(3000);
				
				WebElement radioButton = driver.findElement(By.name("gender"));
				
			    boolean radioButtonStatus = radioButton.isSelected();
			    System.out.println(radioButtonStatus);
			    
			    
			    radioButton.click();  // here we click the mail radiobutton
			    radioButtonStatus = radioButton.isSelected();
			    System.out.println(radioButtonStatus);
			    
			    
			    
			    
			    
			    
			    
			    // Example for isSelected() for checkbox
			    
			    WebElement checkBox = driver.findElement(By.name("newsletter"));
			    
			    System.out.println(checkBox.isSelected());
			    
			    Thread.sleep(2000);
			    
			    checkBox.click();  // here we check the checkbox
			    
			    System.out.println(checkBox.isSelected());
			    
                checkBox.click();   // here by clicking again checkbox, checkbox must be unchecked here
			    
			    System.out.println(checkBox.isSelected());
			    

				
				
				

		
	}

}
