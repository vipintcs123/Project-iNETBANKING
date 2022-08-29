package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		   
		    ChromeOptions options = new ChromeOptions();
		   
		    options.addArguments("window-size=1400,800");              // here we must have to give the window size otherwise it will open in small size as mobile window
			
		    options.addArguments("headless");           // Also give argument as headless means there is no head, means no browser launching
		    
	        WebDriver driver = new ChromeDriver(options);  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait/global wait and it wait for every element ina webpage
	
             driver.get("https://ui.cogmento.com/");  // enter url
             
             System.out.println("Login Page Title=" +driver.getTitle());
			 
             driver.findElement(By.name("email")).sendKeys("vipinshukla714@gmail.com");
             
             Thread.sleep(5000);
             
             driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lawyer123@");
             
             driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
             
             System.out.println("Home Page Title=" +driver.getTitle());
			
	}

}
