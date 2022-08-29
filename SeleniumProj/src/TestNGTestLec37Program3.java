import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTestLec37Program3 {                // this code is for understanding the @BeforeMethod and @AfterMethod annotations
	
WebDriver driver;

	
	
	// Test Case 1 :
	
	
	@BeforeMethod
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	
		@AfterMethod
		
		public void closeBrowser()
		{
			
			driver.close();
		}
		
		
		
		
		
		
		// Test Case 1 :
		
		
		@Test (priority=1)
		
		public void verifyGoogletitle()
		{
			driver.get("https://www.google.com/");
				
			String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "Google");
		      
			
		}
		
		
		
		
		
		
		
		// Test Case 3 :
		
		
		@Test(priority=3)
		
		public void verifyGcreddyadmintitle()
		{
			driver.get("http://gcreddy.com/project/admin/login.php");
				
		    String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "osCommerce Online Merchant Administration Tool");
		      
			
		}
		
		
		
		
		
		// Test Case 2 :
		
		
		@Test (priority=2)
		
		public void verifyYahootitle() 
		{
			driver.get("https://in.search.yahoo.com/?fr2=inr");  
			
		    String pageTitle = driver.getTitle();
				
			Assert.assertEquals(pageTitle, "Yahoo Search - Web Search"); 
			
		}
		

}
