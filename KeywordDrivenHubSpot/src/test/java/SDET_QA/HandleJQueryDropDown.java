package SDET_QA;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropDown {
	
	public static WebDriver driver;

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		  
		  
		  driver.findElement(By.id("justAnInputBox")).click();  // perform click action on drop down and it open all options from a drop down
		  
		 
		  
		  // selectChoiceValues(driver, "choice 1");  //   // Here we pass single value/choice which we want to select
		  
		  // selectChoiceValues(driver, "choice 2","choice 2 3", "choice 6","choice 6 2 1", "choice 6 2");   // Here we pass multiple values/choices which we want to select
		  
		   selectChoiceValues(driver, "all");         //  if we want to select all the values/ all the choices then we pass "all" keyword
		  
		  

	}
	
	
	
	 		  
	  // Now below create a generic method where we click on single option as well as multiple options or all the options.
	
	public static void selectChoiceValues(WebDriver driver, String... value)  // here values can hold single as well as multiple values, it behave as string array
	{
		
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));  // here we got all the options present in a drop down
		
        if(!value[0].equalsIgnoreCase("all"))   // if part will execute if we pass single choice or multiple choices
        {
        	
        	for(WebElement item : choiceList)
        	{
        		
        		String text = item.getText();
        		
        		for(String val:value)            // this loop is used , as soon as we get text from a item and compare with List of item which we are passing in method
        		{
        			
        			if(text.equals(val))
        			{
        				
        			  item.click();
        			  break;
        			}
        			
        		}
        	}
        	
        }
        
        else   // else part execute if we pass "all" means we want to select all the choices
        	
        {
        	
        	try
        	{
        		for(WebElement item : choiceList)
            	{
            		
            		item.click();
            		
            		
            	}
        		
        	}
        	
        	catch(Exception e1)
        	
        	{
        		
        		
        		e1.printStackTrace();
        		
        		
        	}
        }
        
		
	}

}
