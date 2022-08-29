package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		
		  // instansiate chrome browser driver
			
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");  // enter url
			
			driver.navigate().to("https://www.amazon.com");    // This line switch to google to amazon
			
			driver.navigate().back();     // To click the back button in browser, after this line, it goes to google page
			
			Thread.sleep(2000);
			
			driver.navigate().forward();    // After this line it again goes to next page means it goes to amazon page
			
			Thread.sleep(2000);
			
			driver.navigate().back();     // After this line it again come back to google page
			
			driver.navigate().refresh();   // If page is stuck somewhere then we use this command to refresh the page
					
	}

}
