package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeWindowPopUp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


    // instansiate chrome browser driver
		
	  System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
		
		driver.get("https://www.popupcheck.com/");
		
		driver.findElement(By.linkText("Jump to Test Now")).click();
		
		Set<String> handler = driver.getWindowHandles();    // we use string because window id come in form of string only , getWindowHandles() getting window 
		                                                      // id of both window that is parent and child window, getWindowHandles() return a set objects 
		
		Iterator<String> it = handler.iterator();    // iterator method returns a iterator objects, we use string because all id come in form of string only
		                                             // Iterator points to a set object
		
		String parentWindowId = it.next();   // here we got a parent window id
		
		System.out.println("parent window id:" + parentWindowId);
		
		String childWindowId = it.next();     // here we got a child window id
		
		System.out.println("childWindowId" + childWindowId);
		
		// Now we switch from parent window to child window using child window id
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window pop up title" + driver.getTitle());   // here we got a title of child window
		
		driver.close();    // it will close the specific browser pop up that is child pop up
		
		driver.switchTo().window(parentWindowId);  // Now we switch from child window to a parent window
		
		System.out.println("parent  window pop up title" + driver.getTitle());   // here we got a title of parent window
		
	}

}
