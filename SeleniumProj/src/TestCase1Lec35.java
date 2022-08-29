import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Lec35 {

	public static void main(String[] args) {
 
		// Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		
		// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
		
		WebDriver Nathiya = new ChromeDriver();    // launches the browser with blank URL
		
	    Nathiya.manage().window().maximize();     // maximize the browser window 		 
		 
        		
		LoginPage35 login = new LoginPage35(Nathiya);
		
		Nathiya.get("http://gcreddy.com/project/admin/login.php");
		
		login.typeUsername("admin");
		login.typePassword("admin@123");
		login.clickLoginButton();
		
		String url = Nathiya.getCurrentUrl();
		
		if(url.contains("http://gcreddy.com/project/admin/index.php"))
		{
			
			System.out.println("Admin Login is Successful - Passed");
		}
		
		else
        {
			
			System.out.println("Admin Login is UnSuccessful - Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
