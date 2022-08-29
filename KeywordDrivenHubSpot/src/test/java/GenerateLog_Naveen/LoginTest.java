package GenerateLog_Naveen;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest {
	
	Logger log = Logger.getLogger(LoginTest.class); 
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{

		log.info("***********************starting test case execution**************************");
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
        
        log.info("Launching chrome browser");
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // This is also dynamic wait
		
		driver.get("https://crmpro.com/index.html");
		
		log.info("entering application url");
		
		log.warn("this is just a warning message");
		
		log.fatal("hey this is just fatal error message");
		
		log.debug("this is debug message");
	}
	
	
	
	
	
	@Test(priority=1)
	public void freeCrmTitleTest()
	
	{
		log.info("******************* Starting test case************************");
		log.info("******************* Free CRM Pro title test************************");
		String title = driver.getTitle();
		System.out.println(title);
		log.info("Login Page title is " +title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
		log.info("******************* Ending test case************************");
		log.info("******************* Free CRM Pro Title************************");
	}
	
	
	
	@Test(priority=2)
	public void freeCRMLogoTest()
	{
		log.info("******************* Starting test case************************");
		log.info("******************* Free CRM Pro logo test************************");
		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
		Assert.assertTrue(b);	
		
		log.info("******************* ending test case************************");
		log.info("******************* Free CRM Pro Title************************");
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		log.info("********************** browser is closed **********************************");
		
	}

}
