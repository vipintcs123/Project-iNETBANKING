package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

	 // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		// driver.get("https://www.ebay.com/");   // enter url
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait
		
		driver.get("https://register.freecrm.com/register/");
		
		
		// 1. isDisplayed() method is applicable only for all the elements.
		
		boolean b1 = driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);    // true
		
		
		
		// 2. isEnabled() method is used to check whether the given element is enabled or disabled.
		
		
		boolean b2 = driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);    // true
		
		
		
		
		// 3. isSelected() method is used to check whether the given element is selected or not.
		// It applicable only for checkboxes,  dropdowns and radiobuttons.
		
		boolean b3 = driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3);     // false
		
		
		
		
		// Now we are going to select the checkbox then we click on that checkbox
		
		    driver.findElement(By.id("terms")).click();   // now check box is selected 
		    boolean b4 = driver.findElement(By.id("terms")).isSelected();   
			System.out.println(b4);     // true
			
			
			
			// Now deselct the checkbox so we click again on checkbox then it will deselect
			
			   driver.findElement(By.id("terms")).click();   // now check box is deselected 
			   boolean b5 = driver.findElement(By.id("terms")).isSelected();   
			   System.out.println(b5);     // false
				
		
		

	}

}
