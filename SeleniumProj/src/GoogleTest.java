import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FindFailed {

		   System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait/global wait and it wait for every element ina webpage
	
			driver.get("https://www.google.com/");  // enter url
			
			Screen s = new Screen();
			
			// click on a google serach image/button
			
		    Pattern searchBtnImg = new Pattern("capture_google.PNG");
		    s.wait(searchBtnImg,2000);
		    s.click();
		    
		    

	}

}
