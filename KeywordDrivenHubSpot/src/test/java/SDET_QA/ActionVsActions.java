package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionVsActions {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	 
	    driver.get("http://automationpractice.com/index.php");
	    
	  WebElement features =  driver.findElement(By.xpath("//a[@title='Women']"));
	  
	  // Now we perform mouse hover operation on features element
	  
	  Actions act = new Actions(driver);
	  
	  Thread.sleep(3000);
	  
	  act.moveToElement(features).perform();             // If we call perform() method internally it will call build().perform() method to complete the action
	    
	 // act.moveToElement(features).build().perform();   // So my choice we can use either perform() or build().perform()
	
	  
	  /*
	   // Action is a interface WHEREAS Actions is a class
	    
	 Action action = act.moveToElement(features).build();   // here build() method return an Action, but it not perform action, here we store an action then we complete the action using perform()
	 action.perform();  // to complete the action we use a perform() method
		
		
// Build() will only create an action whereas perform() will complete the action, using Action interface we store the action in Action interface reference variable
		
		*/
	}

}

