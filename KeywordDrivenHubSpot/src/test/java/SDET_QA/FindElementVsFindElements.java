package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {
  
	  public static void main(String[] args)
	  {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  
		  driver.get("https://demo.nopcommerce.com/");
		  
		  // findElement : findElement() always Returns a Single WebElement
		  
		  // Scenario 1:
		  
		  WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		  searchBox.sendKeys("xyz");
		  
		  
		  
		  // Scenario 2: Here multiple elements are present but still we using findElement then it returns first web element only
		  
		  WebElement ele = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		  System.out.println(ele.getText());
		  
		  
		  
		  
		  
		  
		    // findElements : findElements() always Returns a multiple web element, List<WebElement>
		  
		  // Scenario 1: 
		  
		  List<WebElement> links  = driver.findElements(By.xpath("//div[@class='footer-upper']//a")); // Here List is collecion in java
		  System.out.println("No of elements captured : "+links.size());   // no of web elements
		  
// To perform action on all web element we have to use the loop and we iterate the elements and then we get the element and perform operation on that element
		  
		 for(WebElement ele1 :links)    // here we get element from a list one by one
		 {
			 
			 System.out.println(ele1.getText());
		 }
		  
		  
		 
		 
// Scenario 2: Here below xpath match only single web element is present and still we using findElements(), findElements always returns list of web element
		  
		   List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));  
		   System.out.println(logo.size());   // here we got only single element because above xpath points to a only single element
		  
		  
	  }
}
