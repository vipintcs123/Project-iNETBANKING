package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		
	  // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.get("https://www.ebay.com/");  // enter url
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));  
		
		// size of linkList
		
		System.out.println(linkList.size());   //  This line will give total count of links
		
		for(int i=0;i<linkList.size();i++)
		{
			
		String	linkText = linkList.get(i).getText();     // This line will give text of all links
		
		System.out.println(linkText);
			
		}	
		
		
	}

}
