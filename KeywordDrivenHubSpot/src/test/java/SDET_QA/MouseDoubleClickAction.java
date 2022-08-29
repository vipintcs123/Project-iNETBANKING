package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClickAction {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		  
		  // Now we are going to perform double click action
		  
		  driver.switchTo().frame("iframeResult");  // this command will switch to the particular frame
		  
		  WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		  field1.clear();
		  field1.sendKeys("Welcome to selenium");
		  
		  // We are going to perform double click on Copy Text button
		  
		  WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		  
		 Actions act = new Actions(driver);
		 act.doubleClick(button).perform();
		  
		  

	}

}
