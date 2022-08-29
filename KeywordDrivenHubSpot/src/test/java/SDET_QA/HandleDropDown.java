package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.opencart.com/index.php?route=account/register");
		  
		 WebElement drpCountryElement = driver.findElement(By.id("input-country"));
		 
		 // Select a option from a drop down using Select class objects and by using select class methods
		 
		 Select drpCountry = new Select(drpCountryElement);
		// drpCountry.selectByVisibleText("Denmark");
		// drpCountry.selectByValue("10");  // Argentina   ,this method used when value attribute is present in HTML DOM during inspect
		// drpCountry.selectByIndex(13);  // Australia
		 
		 
		 
	
		 
		 
	 //  Select a option from a drop down without using methods
		 
		 List<WebElement> alloptions = drpCountry.getOptions();   // here we got all the options from a drop down, each option is a web element
		 
		 for( WebElement option:alloptions)
		 {
			 
			 if(option.getText().equals("Cuba"))
			 {
				 option.click();
				 break;
				
			 }
			 
			
			 
		 }
		 
		 

	}

}
