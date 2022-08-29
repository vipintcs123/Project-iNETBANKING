package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

  
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait/global wait and it wait for every element ina webpage
			
			driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");   // enetr a url
			
			driver.findElement(By.id("dropdownMenuButton")).click();  // clicking on a dropdown button
			
			List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));  // here we got list all options present in dropdown button

			System.out.println(list.size());   // Got total number of element present in a dropdown
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getText());   // Here we get a text of all option present in a dropdown
				
				if(list.get(i).getText().equals("Another action"))
				{
					
					list.get(i).click();    // here we click/select on a particular element of a dropdown
					
					break;
				}
				
			}
			
	}

}
