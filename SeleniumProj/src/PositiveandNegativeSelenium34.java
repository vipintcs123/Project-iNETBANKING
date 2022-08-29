import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveandNegativeSelenium34 {
	
	// Test Case 11 :  Write a Test Case for Positive and Negative Testing for Admin Login Functionality, we also see lecture 34 notes for this.

	
	static String Username, Password;
	
	static int iteration = 0;

	public static void main(String[] args) {
		
		for(int i=1; i <= 2; i++)
		{
			iteration = iteration + 1;
			
			
		if(i==1)
		{
			
			Username = "admin";
			
			Password = "admin@123";
			
		}
		
		else if(i==2)
		{
            Username = "abcdef";
			
			Password = "xyz123";
			
			
		}
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://gcreddy.com/project/admin/login.php"); 
		
		driver.findElement(By.name("username")).sendKeys(Username);
		
		driver.findElement(By.name("password")).sendKeys(Password);	
		
		driver.findElement(By.id("tdb1")).click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://gcreddy.com/project/admin/index.php"))
		{
			System.out.println(iteration + " Admin Login is Successful - Passed");
		}
		
		
		else

			
			{
				System.out.println(iteration + " Admin Login is Unsuccessful - Failed");
			}
			
		
		}
		
		
		
		

		
	}

}
