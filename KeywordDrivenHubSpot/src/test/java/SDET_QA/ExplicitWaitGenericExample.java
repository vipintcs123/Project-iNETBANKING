package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitGenericExample {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	

		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com/");
		  
		  driver.manage().window().maximize();
	
		  
		  driver.findElement(By.name("q")).sendKeys("Selenium");   // here we type selenium in google search box
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);   // here we press a enter key from a keyboard
		  
		  By elelocator = By.xpath("//h3//a[text()='WebDriver']");
		  
		  waitForElementPresent(driver, elelocator, 10).click();   // calling a method with 3 arguments, this methdo return a element and perform a click operation on that element 
		  
		}
	
	
	// here we write a generic method of explicit wait for every element.
	
	// It is simple java method, take 3 arguments one is driver instance, second is locator of element for which we have to wait and waiting time 
	
	// This method call for multiple elements, this method finally returning a element
	
	
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout)
	{		
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
		
		
	}
	
	
	
	
	
	
	
	
	

}
