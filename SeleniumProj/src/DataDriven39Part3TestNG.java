
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven39Part3TestNG {

	WebDriver driver;
	
	
	
	@BeforeClass
   public void setup() throws InterruptedException 	
   {
		// Instantiate google chrome browser driver
		
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
			
			// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
			
		    driver = new ChromeDriver();    // launches the browser with blank URL
		    
		    Thread.sleep(3000);
		    
			
			driver.manage().window().maximize();     // maximize the browser window 
			
			
	 }
	
	
	
	
	
	@Test(dataProvider="LoginData")
	public void adminLogin(String uname, String pwd)
	{
		driver.get("http://gcreddy.com/project/admin/login.php");    // navigate to gcrshop admin interface
		
		driver.findElement(By.name("username")).sendKeys(uname);  
			
		driver.findElement(By.name("password")).sendKeys(pwd); 
			
			
		driver.findElement(By.id("tdb1")).click();   	// click "login" button
		

		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		
         if(ErrorMessage.contains("Error: Invalid administrator login attempt.")) {
			
			
			Assert.assertTrue(true);
		}
		
		else
			
		{
			Assert.assertTrue(false);
			
		}
		
		
	 
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	@DataProvider(name="LoginData")
	
	public String [][] getData()
	
	{                                          // Here first we are going to hardcode the data and provide this data to our test case
		String loginData[][] = {
				
				
				{"admin","admin@123"},
				{"admin","sggd@123"},
				{"admin","dhdy77"}
				
				
				
				
		};
		
		return loginData;
		
	}
	 
	
	
	  @AfterClass
	  public void tearDown()
	  {
		  driver.close();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	
	

}