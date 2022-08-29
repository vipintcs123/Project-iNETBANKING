package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
	
	  WebDriver driver;
	
	@Test
	void logoTest() throws InterruptedException   // this test case used for verify logo in a given page.
	{

		  // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// Here we verify logo is present in page or not
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		
		Assert.assertTrue(logo.isDisplayed());    // If logo present then it return true otherwise it return false
		
		Thread.sleep(5000);
		
	}
	
	
	
	@Test
	void homePageTitle() throws InterruptedException        //  this test case used for verify the page title in a given page.
	{

		  // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
		
		Thread.sleep(5000);
		
	}
	
	
	
	  @AfterMethod
	  void tearDown()
	  {
		  driver.quit();
		  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
