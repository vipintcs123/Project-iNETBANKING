import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestLec37Program2 {    // this code is for understanding the priority keyword use
	
	WebDriver driver;

	
	
	// Test Case 1 :
	
	
	@Test (priority=1)
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	// Test Case 2 :
	
	
		@Test(priority=5)
		
		public void closeBrowser()
		{
			
			driver.close();
		}
		
		
		
		
		
		
		// Test Case 3 :
		
		
		@Test (priority=2)
		
		public void verifyGoogletitle()
		{
			driver.get("https://www.google.com/");
				
			String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "Google");
		      
			
		}
		
		
		
		
		
		
		
		// Test Case 4 :
		
		
		@Test(priority=4)
		
		public void verifyGcreddyadmintitle()
		{
			driver.get("http://gcreddy.com/project/admin/login.php");
				
		    String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "osCommerce Online Merchant Administration Tool");
		      
			
		}
		
		
		
		
		
		// Test Case 4 :
		
		
		@Test (priority=3)
		
		public void verifyYahootitle() 
		{
			driver.get("https://in.search.yahoo.com/?fr2=inr");  
			
		    String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "Yahoo Search - Web Search");    // we also do negative testing by changing the expected result
			
		}
		
}
