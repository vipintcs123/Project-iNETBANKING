import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectLec35TestCase2 {

	public static void main(String[] args) throws InterruptedException {  // used for RedirectFunctonality ,object repository for this class is defined in a class LoginPage35TestCase2
		
		
		
		// Instantiate google chrome browser driver
		
				System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
				
				
				// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
				
				WebDriver Virat = new ChromeDriver();    // launches the browser with blank URL
				Virat.manage().window().maximize();     // maximize the browser window 
				
				LoginPage35TestCase2 redirect = new LoginPage35TestCase2(Virat);  // here we pass a web driver instance
				
				Virat.get("http://gcreddy.com/project/admin/login.php");
				
				redirect.clickLink();    // here we also click Online Catalog link after admin login also but here we click Online Catalog link before admin login
				
			
				
				String url = Virat.getCurrentUrl();
				
				if(url.contains("http://gcreddy.com/project/"))
				{
					
					System.out.println("Page Redirecting from Admin to User Interface - Passed");
				}
				
				else
					
                {
					
					System.out.println("Page Not Redirecting from Admin to User Interface - Failed");
				}
				
					
			    		

	}

}
