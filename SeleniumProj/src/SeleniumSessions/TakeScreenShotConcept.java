package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		  // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		 driver.get("https://www.google.com");
		
		
		// Take screenshot and store as a file format
		
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		 // Now copy the screenshot to desired location using copyFile method
		 
		 FileUtils.copyFile(src, new File("C:\\Users\\Vipin Shukla\\eclipse-workspace\\SeleniumProj\\src\\SeleniumSessions/google.png"));

	}

}
