import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngTestsLec37 {
	
	WebDriver driver;
	
	
	
	// Test Case 1:
	
	@Test (priority = 1)
	
	public void launchBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	// Test Case 2:
	
    @Test (priority = 2)
	
	public void verifyTitle()
	
	{
        driver.get("https://www.google.com/");
		
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals(pageTitle, "Google");
      
		
	}
    
    
    
    
    
	
	// Test Case 3:
	
	@Test (priority = 3)
	
	public void closeBrowser()
	
	{
	
		 driver.close();
		
	}

	
	
	
	

}
