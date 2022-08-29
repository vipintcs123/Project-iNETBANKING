package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
	
	
	WebDriver driver;
	
	@Test
	void LoginTest() throws InterruptedException
	{
  // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
	    Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	    
	    Thread.sleep(3000);
		
	}
	
	
	
	@AfterMethod
	void tearDown()
	{
		
		driver.quit();
	}

}
