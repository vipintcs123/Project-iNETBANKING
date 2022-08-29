import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyTitleLec36 {
	
	 WebDriver  driver;
	
	 @Test

	 public void verifyTitle()
	 {
	   // Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
	 // Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Google");
	

	}   // annotation bracket close
	

}  // class bracket close
	

