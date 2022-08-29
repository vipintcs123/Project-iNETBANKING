package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
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
		
	}
	
	
	
	@Test(priority=2, groups="Logo")   // Test case 2
	public void googleLogoTest()
	{
		boolean b = driver.findElement(By.xpath("//*[@id='hplog']")).isDisplayed();
	
		
	}
	
	
	
	
	@Test(priority=3, groups="Link Test")  // Test case 3
	public void mailLinkTest()
	{
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	
	
	
	@Test(priority=4, groups="Test")  // Test case 4
	public void test1()
	{
		System.out.println("test1");
		
	}
	
	

	@Test(priority=5, groups="Test")  // Test case 5
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	
	

	@Test(priority=6, groups="Test")  // Test case 6
	public void test3()
	{
		System.out.println("test3");
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	


	

}
