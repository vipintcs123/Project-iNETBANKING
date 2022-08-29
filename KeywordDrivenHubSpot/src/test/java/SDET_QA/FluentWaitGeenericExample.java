package SDET_QA;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitGeenericExample {
	
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
		  driver.get("https://www.google.com/");
		  
		  driver.manage().window().maximize();
		 

		  
  
		  driver.findElement(By.name("q")).sendKeys("Selenium");   // here we type selenium in google search box
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);   // here we press a enter key from a keyboard
		  
		  By elelocator = By.xpath("//h3//a[text()='WebDriver']");
		  
		  waitForElementWithFluentWait(driver, elelocator).click();   // call a method and method return a element and then perform click on that element,
		  
		  
			  
	}
	
	
	
	
	// Below method take 2 arguments one is driver instance and other is locator
	
	public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator)
	{
		
		  
		   Wait<WebDriver>  mywait = new FluentWait<WebDriver>(driver)
		  .withTimeout(30, TimeUnit.SECONDS)
		  .pollingEvery(5, TimeUnit.SECONDS)
		  .ignoring(Exception.class);
		   
		   
		   
		   WebElement element = mywait.until(new Function<WebDriver, WebElement>(){
				  
				 public WebElement apply(WebDriver driver) {
					  
				 return driver.findElement(locator);  
					  
				  }
						  
			});
		   
		   
		   return element;
		
		
	}
}
