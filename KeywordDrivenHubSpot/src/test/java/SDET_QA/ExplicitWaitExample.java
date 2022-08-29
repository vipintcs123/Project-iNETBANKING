package SDET_QA;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com/");
		  
		  driver.manage().window().maximize();
		  
		  WebDriverWait mywait = new WebDriverWait(driver,5);

		  // Explicit Wait
		  
		  driver.findElement(By.name("q")).sendKeys("Selenium");   // here we type selenium in google search box
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);   // here we press a enter key from a keyboard
		  
		  
   //  Here ExpectedConditions is a class. And we pass a locator of element for which we have to wait for a 5 seconds till the visibility of element condition.
		  
		  WebElement  element =  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3//a[text()='WebDriver']")));	
		  
		  element.click();   // If above condition true and element is located then we click on that element  		
		
	}

}
