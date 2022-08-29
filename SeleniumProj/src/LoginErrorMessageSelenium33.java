import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginErrorMessageSelenium33 {
	
	static String ErrorMessage ;

	public static void main(String[] args) throws InterruptedException {
		
		// Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		
		// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
		
		WebDriver driver = new ChromeDriver();    // launches the browser with blank URL
		
		driver.manage().window().maximize();     // maximize the browser window 
		
		
		
		
/*
		
		
	// 	Test Case 8 for Verifying Admin Login, Error Message in gcrshop Admin Interface, see lecture 33 notes also for this but here also all code is given below. 

		
		
		driver.get("http://gcreddy.com/project/admin/login.php");    // navigate to gcrshop admin interface
		
		
		driver.findElement(By.name("username")).sendKeys("admin1");
		
		driver.findElement(By.name("password")).sendKeys("admin@123");	
		
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		if(!url.contains("http://gcreddy.com/project/admin/login.php"));
		{
		 ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
			
			//System.out.println(ErrorMessage);
			
  		}
		
		
		if(url.contains("http://gcreddy.com/project/admin/index.php"))
		{
			System.out.println("Admin Login is Successful - Passed");
		}
		
		else if(ErrorMessage.contains("Error: Invalid administrator login attempt."))
		{
			System.out.println("Admin Login UnSuccessful, but showing correct Error Message - Passed");
		}
		 
		
		else
		{
			System.out.println("Admin Login is Unsuccessful and Not showing correct ErrorMessage - Failed");
			
		}
		
		
		
		*/
		
		
		
		
		
		
		
         
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		 

	}

}
