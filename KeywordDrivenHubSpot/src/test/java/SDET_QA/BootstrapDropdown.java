package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {
	
	public static void main(String[] args)
	{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    
    driver.get("https://www.hdfcbank.com/");
    
    
    // First we have to click on drop down, so for this we inspect first drop down element
    
    driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();   // clicking on the drop down
    
    
    // 1. Selecting a Product Type (Here we handle a first dropdown)
    
    // After click on  drop down then different options are coming, so we write xpath so that all options are matching with that xpath
    
    List<WebElement> productTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));   // here we got all options present in drop down
    
    System.out.println("Number of options :"+productTypes.size());   // we got no of option, here every option is a web element
    
    
    // Now we write a loop statement to read each and every options and compare with expected option
    
    for(WebElement ptype : productTypes)    // productTypes contains all options and each and every option is a webelement
    {
    	
    	if(ptype.getText().equals("Accounts"))
    	{
    		ptype.click();
    		break;                        // as soon as we find a element we click on that element and then we come out from a loop using break statement
    	}
    }
    
    
    
    
    
    
    
    
    
    

	
	  // 2. Selecting a Product (Here we handle a second dropdown)
    
    
    driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();  // here we click on dropdown and multiple options are coming
    
	List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));  // here we got all options in form of web element present in a dropdown
	
	 System.out.println("Number of options :"+products.size());   // we got no of option, here every option is a web element
	 
	  
	    // Now we write a loop statement to read each and every options and compare with expected option
	    
	    for(WebElement product : products)    // productTypes contains all options and each and every option is a webelement
	    {
	    	
	    	if(product.getText().equals("Salary Accounts"))
	    	{
	    		product.click();
	    		break;                        // as soon as we find a element we click on that element and then we come out from a loop using break statement
	    	}
	    }
	        
    
	}
	
	

}
