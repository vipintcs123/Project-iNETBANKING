package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver  driver;
		
		@BeforeMethod
		public void setUp()
		{
			
	 // instansiate chrome browser driver
			
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			driver.get("http://www.google.com/");
		}
		
		
		
		
		@Test(priority=1, groups="Title")  // Test case 1
		public void googleTitleTest()
		{
			
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google", "title is not matched");  // If Assertion is failed then only 3rd parameter will be printed
			
		}
		
		
		
		@Test(priority=2, groups="Logo")   // Test case 2
		public void googleLogoTest()
		{
			boolean b = driver.findElement(By.xpath("//*[@id='hplog']")).isDisplayed();
			Assert.assertTrue(b);       //  Here we also use Assert.assertEquals(b, true)
			
		}
		
		
		
				

		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	
	
}
