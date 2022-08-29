package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {

	private static Object HttpURLConnection;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {


		 // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface
	       
	       
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.get("https://makemysushi.com/");  // we can use any website here and all the rest code are same for checking the broken link for any website
			
			
			
			
			
	/*	driver.get("https://ui.freecrm.com/");
	 	Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vipinshukla714@gmail.com");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Lawyer123@");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			
			
			
			
			*/
	
			
			
			
			// links -- <a>,  //a href<http://www.google.com>
			// images -- <img>   // img href <http://www.test.com>
			
			
			
			// here first we collect all the links and images together and then one by one fetch the property of href from links and images and then 
			// - we check href url is correct or not
			
			
			
			
			
			
			// 1. Get the list of all the links and images :
			
			List<WebElement> linksList = driver.findElements(By.tagName("a"));   // getting all the links because links are represented by <a> tag
			
			Thread.sleep(3000);
			linksList.addAll(driver.findElements(By.tagName("img")));           // here in same linkList, we add all the methods of different elements, now in linkLists all the <a> tags and all the <img> tags are available
			
			
			System.out.println("size of full  links and images ------>"+linksList.size());
			
		
			// Now in linksList some href are not available so we ignore that part because we have to test only broken links and if link is not available in href then we ignore that part
			
			Thread.sleep(3000);
			
			List<WebElement> activeLinks = new ArrayList<WebElement>();   // active links means they have href property
			
			Thread.sleep(3000);
			
			
			//2. Iterate linksList using or loop , exclude all the links or images which does not have any href attribute
			
			for(int i=0; i<linksList.size(); i++)
				
			{
				 System.out.println(linksList.get(i).getAttribute("href"));   // here we print all href property
				
				// below we exclude all the links or images which does not have any href attribute and also exclude href which contains javascript
				
				if(linksList.get(i).getAttribute("href") != null && !linksList.get(i).getAttribute("href").contains("javascript"));
				{
					
				   	activeLinks.add(linksList.get(i));   // here we all values contains href property
					
				}
				
				
			}
			
					
			// get the size/number of active links
			
			System.out.println("size of active links and images ------>"+activeLinks.size());
			
			
			
			// 3. check the href url with httpconnection api : here we use  httpconnection api to check that href is correct or not, I am not going click on that link
			// - we use httpconnection api present in java.net package
			
			for(int j=0; j<activeLinks.size();j++)
			{
				
				// Here we cast entire thing in Httpurlconnection and internally it will check href url is correct or not, 
				// Here URL is a class and we make object of URL class from a string representaion like activeLinks.get(j).getAttribute("href") is a string
				
				// here it returns a connection object and we store that object in connection
				
				HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
				
				connection.connect();  // here we connected to particular URL
				
			    String response = connection.getResponseMessage();  // If link is fine then it return ok and if link is not right then it not return ok, here we check link is fine or not
				
			    // Response code :
			    // 200 - Ok
			    // 404 - Not found
			    // 500 - internal error
			    // 400 - bad request
			    
				connection.disconnect();     // finally we disconnect the connection
				
				
				System.out.println(activeLinks.get(j).getAttribute("href") + "------>"+ response);
				
				
				
				
			}
	}

}
