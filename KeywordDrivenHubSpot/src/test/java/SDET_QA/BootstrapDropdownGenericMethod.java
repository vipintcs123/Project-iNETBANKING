package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdownGenericMethod {

	public static void main(String[] args) {


		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	    driver.get("https://www.hdfcbank.com/");
	 
	    
	    // 1. Selecting a Product Type  (Here we handle a first drop down)
	    
	    driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();   // clicking on the drop down
	    
	    // After click on  drop down then different options are coming, so we write xpath so that all options are matching with that xpath
	    
	    List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));   // here we got all options present in drop down
	    
	    System.out.println("Number of options :"+productTypes.size());   // we got no of option, here every option is a web element
	    

	    // this method take 2 arguments, in first arguments we pass the options which coming/capture from a dropdown and in 2nd argument we give the value which we want to select
	    
	    selectOptionFromDropDown(productTypes, "Accounts");  

	    
	    

		  // 2. Selecting a Product (Here we handle a second drop down)
	    
	    
	    driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();  // here we click on dropdown and multiple options are coming
	    
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));  // here we got all options in form of web element present in a dropdown
		
		 System.out.println("Number of options :"+products.size());   // we got no of option, here every option is a web element
		 

		 // this method take 2 arguments, in first arguments we pass the options which coming/capture from a dropdown and in 2nd argument we give the value which we want to select
		    
		 selectOptionFromDropDown(products, "Salary Accounts");  

		 
	}
	    
	    
	
	
	
		    
		    
	// if there are multiple bootstrap dropdown then we have to write a generic method and then we call that method if we want to select a bootstrap drop down.
		    
// below method take 2 arguments one argument is option list and second argument is which option we want to select
	
		    
		    public static void selectOptionFromDropDown(List<WebElement> options, String value)
		    {
		    	
		    	 
			    for(WebElement option : options)    
			    {
			    	
			    	if(option.getText().equals(value))
			    	{
			    		option.click();
			    		break;                        
			    	}
			    }
		    	
		    }

}
