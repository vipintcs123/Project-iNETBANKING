import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessageTestCase2Lec35 {

	public static void main(String[] args) {  // used for erroMessage , object repository for this class is defined in a class LoginPage35TestCase2
	
		
		// Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		
		// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
		
		WebDriver Susheela = new ChromeDriver();    // launches the browser with blank URL
		Susheela.manage().window().maximize();     // maximize the browser window 
	    
	    
	    
		LoginPage35TestCase2 Nathiya = new LoginPage35TestCase2(Susheela);  // here we pass a web driver instance
		
		Susheela.get("http://gcreddy.com/project/admin/login.php");
		
		Nathiya.typeUsername("abcdep");
		
		Nathiya.typePassword("admin@123h");
		
		Nathiya.clickLoginButton();
		
		
		
		
		
		String error = Nathiya.captureErrorMessage();
		
		if(error.contains("Error: Invalid administrator login attempt."))
		{
			
			System.out.println(" AdminLogin is UnSucessful and showing correct Error Message - Passed");
		}
		
		else
			
        {
			
			System.out.println(" AdminLogin is UnSucessful and Not showing correct Error Message - Failed");
		}
			
		
	}

}
