import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchTestingSelenium34 {
	
	//  Test Case 10 : Batch Test, here we write 3 test cases 
	
		public static WebDriver driver;
		
		public static String url3;
		
	
		
		// launch the browser
		
		public void launchBrowser() {
			
		
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		
		
		
		
		 
		// close browser
		
		
		
/*		
		public void closeBrowser() {
			
			driver.close();			
		}
		
		*/
		
		
		
		
		
		
		
		
		// Admin Login
		
		public void adminLogin(String Uname, String Pwd) {
			
			driver.get("http://gcreddy.com/project/admin/login.php");
			
			driver.findElement(By.name("username")).sendKeys(Uname);
			
			driver.findElement(By.name("password")).sendKeys(Pwd);
			
			driver.findElement(By.id("tdb1")).click();
			
		}
		
		
		
	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		BatchTestingSelenium34 obj = new BatchTestingSelenium34();
		
	
		
		
		// Test Case 1. Verify Admin Login
		
		
		obj.launchBrowser();
		
		obj.adminLogin("admin", "admin@123");
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://gcreddy.com/project/admin/index.php"))
		{
			System.out.println(" Test Case 1 : Admin Login Successful - Passed");
		}
		
		else
		{
			System.out.println(" Test Case 1 : Admin Login Unsuccessful - Failed");
		}
		
		
		
		// obj.closeBrowser();
		
		
		
		
		
		
		// Test Case 2 : Verify "Error Message" in Admin Login Functionality
		
		obj.launchBrowser();
		
		obj.adminLogin("abcdef", "xyz123");
		
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
		
		// System.out.println(ErrorMessage);
		
		if(ErrorMessage.contains("Error: Invalid administrator login attempt."))
		{
			System.out.println("Test Case 2 : Admin Login is Unsuccessful and showing correct ErrorMessage -  Passed");
		}
		
		else
		{
			System.out.println("Test Case 2 : Admin Login is Successful / Unsuccessful and not showing correct ErrorMessage -  Failed");
		}
		
		
		// obj.closeBrowser();
		
		
		
		
		
		
		
		
		
		
		// Test Case 3: Verify Redirect Functionality from Admin Interface to user Interface
		
		obj.launchBrowser();
		
		obj.adminLogin("admin", "admin@123");
		
		String url2 = driver.getCurrentUrl();
		
		
		
		if(url2.contains("http://gcreddy.com/project/admin/index.php"))
		{
			driver.findElement(By.linkText("Online Catalog"));
			
			Thread.sleep(3000);
			
			url3 = driver.getCurrentUrl();
		}
		
		try {
		
		if(url3.contains("https://gcreddy.com/project/"))
		{
			
			System.out.println("Test Case 3 : Redirecting from Admin to User Interface - Passed");
		}
		
		}

		
		catch(Exception exp)
	    {
			
			System.out.println("Test Case 3 : Not Redirecting from Admin to User Interface - Failed");
		}

		
		

		
		
		
		

		
		
		
		
		
		
          

	}

}
