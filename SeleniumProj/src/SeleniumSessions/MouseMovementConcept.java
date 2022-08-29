package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		 // instansiate chrome browser driver
		
		   System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.get("https://corporate.spicejet.com/SpiceScreen.aspx");
	
		   Actions action = new Actions(driver);
		
           action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLinkLogin\"]"))).build().perform();
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[6]/a")).click();	  //clicking a SME Traveller Page option
	
	}

}
