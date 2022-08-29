import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTC {

	public static void main(String[] args) throws InterruptedException {
		
		// Instantiate google chrome browser driver
	
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		
		// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
		
		WebDriver driver = new ChromeDriver();    // launches the browser with blank URL
		
		driver.manage().window().maximize();     // maximize the browser window 
		
		
		driver.get("http://gcreddy.com/project/admin/login.php");    // navigate to gcrshop admin interface
		
		
	 driver.findElement(By.name("username")).sendKeys("admin");  // Enter user name, here first recognise username  edit box and enter admin value in edit box 
		
	driver.findElement(By.name("password")).sendKeys("admin@123");   // enter "password"
	
	
	// Note :- Send keys used for enter data in text box where as click used for click the button
	
	
    driver.findElement(By.id("tdb1")).click();   	// click "login" button
    
    Thread.sleep(4000);
    
   // Capture the current URL 
    
    String url = driver.getCurrentUrl();   
    
   // System.out.println(url);
    
    
    if(url.equals("http://gcreddy.com/project/admin/login.php"))
    {
    
    System.out.println("Admin Login is Successful - Passed");
    
    }
    
    else
    	
    {
    	
        System.out.println("Admin Login is UnSuccessful - Failed");
    }
    
    driver.close();  // close the browser window
    
    
    
		
		
		
		
	}

}
