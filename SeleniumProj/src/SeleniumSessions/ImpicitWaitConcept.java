package SeleniumSessions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWaitConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		 // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.get("https://www.ebay.com/");   // enter url
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait
	}

}
