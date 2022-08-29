package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanldeMultipleDropdown {
	
	 public static WebDriver driver;

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		  
		  
		// Here We write a generic method and pass the drop down element and value and that method automatically select the option from a drop down.
		  
		WebElement countryElement = driver.findElement(By.name("Country"));
		
		selectOptionFromDropDown(countryElement, "Australia");

	}
	
	
	
	
	
	// Here We write a generic method and pass the drop down element and value and that method automatically select the option from a drop down.
	
	public static void selectOptionFromDropDown(WebElement ele, String value)   // here we accept 2 arguments one is drop down and other is value which we want to select
	{
		
		Select drp = new Select(ele);
		List<WebElement> alloptions = drp.getOptions();   // here we got all the options from a drop down, each option is a web element
		 
		 for( WebElement option:alloptions)
		 {
			 
			 if(option.getText().equals(value))  // as soon as we find Austria then we click on that element and break the loop
			 {
				 option.click();
				 break;
				
			 }
			 
			
			 
		 }
		 
		
	}
	

}
