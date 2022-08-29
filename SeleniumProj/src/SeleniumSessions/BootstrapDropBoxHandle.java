package SeleniumSessions;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


 // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait/global wait and it wait for every element ina webpage
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");   // enetr a url
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
		
		
		// Here below we get the list of all the labels which present inside the li tag
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
		
		System.out.println(list.size());    // here we size of all li
		
		/*
		
		 // Here we  select a particular option Angular from a bootstrap dropdown
		
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.println(list.get(i).getText());    // we get text of all labels which present in a bootstrap drop down
			
			if(list.get(i).getText().contains("Angular"))
			{
				list.get(i).click();                    // Here we click on a Angular label which present inside li tag
				break;
				
			}
						
		}
		
		*/
		
		
		
		// Now we are going to click/select on all the labels which are coming inside dropdown means here-
		// select all the checkboxes/options present in a bootstrap dropdown
		
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.println(list.get(i).getText()); 
			list.get(i).click();        
		}

	}

}
