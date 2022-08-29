package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

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
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		// Here we get all the suggestions
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		System.out.println("Total number of suggestions in search box::: ==>" + list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());         // This print text of all the suggestions on console 
			
			if(list.get(i).getText().contains("testing tools"))   
			{
				
				list.get(i).click();       // Now we are going to select testing tools option
				break;                     // If 'testing tool' keyword found then it immediate terminate the for loop.
			}
			
		}
	}

}
