
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverApiComm {

	public static void main(String[] args) throws InterruptedException {
		
		// Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // creating chrome browser driver in web driver interface
		

		driver.manage().window().maximize();     // maximize the browser window 
		
		// Example for getTitle() command of driver
		 
		/*
		 * driver.get("https://www.google.com/"); 
		 * String browserTitle = driver.getTitle();
		 
		 *  System.out.println(browserTitle);
		 */
		
		
		
		// Example for getCurrentURL command
		
	 // driver.get("https://www.google.com/");
	//  String browserURL = driver.getCurrentUrl();
	 // System.out.println(browserURL);
		
		
		
		
		
		 // Example for navigate().to() command
		
		// driver.navigate().to("https://in.yahoo.com/");
		//browserURL = driver.getCurrentUrl();
     //	System.out.println(browserURL);
		
		
		
		
		
		// Example for navigate().back() command
		
	 	//driver.navigate().back();
	 // browserURL = driver.getCurrentUrl();
	  //  System.out.println(browserURL);
	    
	    
	    
	    
	    
	 // Example for navigate().forward() command
		/*
		 * driver.get("https://www.google.com/");
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.navigate().to("http://gcreddy.com/project/admin/login.php/");
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.navigate().back(); System.out.println(driver.getCurrentUrl());
		 * 
		 * driver.navigate().forward(); System.out.println(driver.getCurrentUrl());
		 */
	 	
		
		
		
		
		
		
		// Example for navigate.refresh() command
		
		//driver.get("");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd123");  // here we make a own  xpath using syntax
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		
		
		
		
		
		
		
		// Example for close() and quit() command
		
		//driver.get("http://gcreddy.com/project/admin/login.php/");
		//Thread.sleep(3000);
		//driver.close();   // it closes only focused browser or first browser only
		// driver.quit();   // it closes all browser that is opened by selenium web driver
		
		
		
		
		
		
	// Example for findElement() command
		
		//driver.get("https://gcreddy.com/project/");
	  //  WebElement link = driver.findElement(By.linkText("create an account"));
		// link.click();
		// driver.findElement(By.name("newsletter")).click();   // used for check the checkbox named as label  Newsletter
		// Thread.sleep(3000);
		// driver.findElement(By.name("newsletter")).click();   //Again  used for uncheck the checkbox named as label  Newsletter
		
		
		
		
		
		
		
		
		// Example for sendKeys() command and clear() command
		
		//driver.get("http://gcreddy.com/project/admin/login.php/");
		
		//String val = "Tanzina";
		//driver.findElement(By.tagName("input")).sendKeys(val);
		//Thread.sleep(3000);
		//driver.findElement(By.tagName("input")).clear();  // used to clear value from a textbox
		
		
		
		
		
		
		
		
		
		
		
		// Example for click() command
		
		// It clicks an element like button,link, radio button, checkbox
		
		/*
		 * driver.get("https://www.google.com"); // used to click Gmail link in google
		 * home page driver.findElement(By.linkText("Gmail")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.get("http://gcreddy.com/project/admin/login.php/");
		 * driver.findElement(By.id("tdb1")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.navigate().to("https://gcreddy.com/project/create_account.php");
		 * driver.findElement(By.name("gender")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.name("newsletter")).click();
		 */
		
		
		
		 
		
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
