package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitExample {

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  
		  	  
		  // Implicit Wait :- dynamic / global wait, applicable for all elements in a web page
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		  
		  driver.findElement(By.name("q")).sendKeys("Selenium");   // here we type selenium in google search box
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);   // here we press a enter key from a keyboard
		  
		  driver.findElement(By.xpath("//h3//a[text()='WebDriver']")).click();
		
	}

}
