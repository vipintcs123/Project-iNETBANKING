package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
		

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://demo.opencart.com/");

		  
		  
		 WebElement desktopMenu =  driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));  // element on which we want to mouse hover, menu item
		 
		 WebElement macMenuItem =  driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));  //another element on which we want to mouse hover, sub-menu item
		 
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(desktopMenu).moveToElement(macMenuItem).click().perform();
		 
		
	}

}
