package Login_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



// Maven project



public class AsianUserSystem {

	
	WebDriver driver;
	
	
	@BeforeMethod                        // This method runs before every test method
	public void DriverLaunch()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();                 // instansiation of chrome browser driver
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);        // implicit wait / dynamic wait
	    
        driver.get("https://console.uat.asians.group/#/domain/list");    
		
	}
	
	
	// 1. Test Case scenario for login with valid  username and a valid password
	
	
	@Test
	public void loginTest1()
	{
		
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vipinshukla714@gmail.com");                    // entering a user name in text box
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Shukla123@");    // entering a password in text box
		driver.findElement(By.xpath("//*[@id=\"kc-login\"]")).click();           // clicking on a Sign In Button
		Assert.assertEquals("CDN console - high-speed, high-defense, high-speed CDN", driver.getTitle());    // verification point for validation of actual and expected result
		
		
   }
	
	
	
	
	

	// 2. Test Case scenario for login with valid  username and a Invalid password
	
	
	@Test
	public void loginTest2()
	{
		
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vipinshukla714@gmail.com");                    // entering a user name in text box
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("hdhdhhd678#");    // entering a password in text box
		driver.findElement(By.xpath("//*[@id=\"kc-login\"]")).click();           // clicking on a Sign In Button
	    
		 String text = driver.findElement(By.xpath("//*[@id=\"input-error\"]")).getText();
		 
		 Assert.assertEquals("Invalid username or password.", text);    // verification point for validation
		 
		
		
   }
	
	
	
	
	
	@AfterMethod                        // This method run after every test method
	public void closeBrowser()
	{
		
		driver.close();
		
	}
	
	
}
