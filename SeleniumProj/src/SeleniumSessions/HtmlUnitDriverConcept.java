package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

 

		// instansiate chrome browser driver
			
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	//        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		 
 // HtmlUnitDriver is not a part of selenium 3.0, To use this concept, we have to download HTMLUnitDriver jar file.
		    
		    
		    WebDriver driver = new HtmlUnitDriver();   // Here we launch a HtmlUnitDriver, Here HtmlUnit driver is class which implements web driver interface.
		    
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   // dynamic wait  
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // dynamic wait
			
			driver.get("https://ui.cogmento.com/");
			
			System.out.println("Before Login, titile is " + driver.getTitle());
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vipinshukla914@gmail.com");
			
			Thread.sleep(3000);
			
			driver.findElement(By.name("password")).sendKeys("Lawyer123@");  // In this password element, there is some xpath issue, So please check website.
			
			driver.findElement(By.linkText("Login")).click();
			
			System.out.println("After login title is " +driver.getTitle());
			
			
		
	}

}
