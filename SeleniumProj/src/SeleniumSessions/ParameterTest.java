package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env, String browser, String url, String emailId)
	
	{
		if(browser.equals("chrome"))        // we take browser value here from testng2.xml file
		{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		}
		
		
		else  if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe"); 
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Please provide valid browser");
			
		}
			
		driver.manage().window().maximize();
		driver.get(url);          // we take url here from testng2.xml file
		
		driver.findElement(By.xpath("//input[@id='login-username']")).clear(); 
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId); // we take email Id here from testng2.xml file
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

    }
	
	
}
