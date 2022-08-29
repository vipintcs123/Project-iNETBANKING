package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


	// instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
		
		driver.get("https://www.facebook.com");
		
		
		// Here we call a static method clickOn which is defined below the main method, Here we pass parameter here as per our defined method argument below
		
		clickOn(driver, driver.findElement(By.xpath("//button[@name='login']")), 20);    
		

	}
	
	
	
	// Here we create a object of WebDriverWait class , This class will take 2 parameters, one is what is driver and second parameter is
	// how much time we want to wait, and also say that ignore this particular exception until one expected condition that once element is clickable then
	// please click on it
	
	
	// Below method is static so for using this method we need not to create a object
	
	
	@SuppressWarnings("deprecation")
	public static void clickOn(WebDriver driver, WebElement locator, int timeout)   
	{
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
		.until(ExpectedConditions.elementToBeClickable(locator));
		
		locator.click();
		
		
	}
	
}
