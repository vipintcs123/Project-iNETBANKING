package Flipkart;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStackFlipkart {
	
	public static WebDriver driver;
	
	public static String er1;
	public static String er2;
	public static String er3;
	
	// Javascript method for click an element
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);   // here we type cast web driver to a JavascriptExecutor
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
	
	// Javascript method for scroll page down
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);    // here we type cast web driver to a JavascriptExecutor
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");   // 0 is starting of a page and scrollheight means end of the page
		
	}
	

	
	
	public static void main(String[] args) throws InterruptedException {
 
		

		// Instantiate google chrome browser driver
		
			WebDriverManager.chromedriver().setup();
			
			
			// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface, ChromeDriver class implements selenium webdriver interface
			
		     driver = new ChromeDriver();    // launches the browser with blank URL  
			
			driver.manage().window().maximize();     // maximize the browser window 
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   // dynamic wait
			
			driver.get("https://www.flipkart.com/");
			
			
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iPhone 11");
			
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ENTER);
		
			WebElement min_slider = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']//div[@class='_3FdLqY']"));
			
		//	min_slider.getLocation();
			
			System.out.println("Location of the min_slider : "+ min_slider.getLocation());  // (17,331)
			
			System.out.println("Height and width of the min_slider : "+ min_slider.getSize());   // (13,13)
			
			
			
			// select 30000
			
			Select s = new Select(driver.findElement(By.xpath("//select[@class='_2YxCDZ']")));
			s.selectByValue("30000");
			
			
			// select 50000+
			Select s1 = new Select(driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']")));
			s1.selectByValue("Max");
			
			Thread.sleep(3000);
			
			// click on flipkart brand checkbox
	
			WebElement f = driver.findElement(By.xpath("//div[@title='APPLE']//div[@class='_24_Dny']"));
			clickElementByJS(f,driver);
			
			
			Thread.sleep(3000);
			
			
			// click on flipkart assured checkbox
			WebElement s3 = driver.findElement(By.xpath("//div[@class='_3U-Vxu']//img[@class='_3U-Vxu']"));
			
			clickElementByJS(s3,driver);
			
			Thread.sleep(3000);

			
			// scroll page down
			
			scrollPageDown(driver);
			
			Thread.sleep(3000);
			
			
			// take all search results from a web page in a ArrayList
			
		/*	List<WebElement> results1 = driver.findElements(By.xpath("//*[@class='_4rR01T']"));  // brand, model
			
			List<WebElement> results2 = driver.findElements(By.xpath("//*[@class='_30jeq3 _1_WHN1']"));   // price
			
			List<WebElement> results3 = driver.findElements(By.xpath("//*[@class='_1fQZEK']"));   // link  */
			
		
			
			
			List<WebElement> brand = driver.findElements(By.xpath("//*[@class='_4rR01T']"));
			
			for(WebElement s8 : brand)
			{
		
			er1= s8.getText();
			
		
				
			}
			
			
			
			List<WebElement> price = driver.findElements(By.xpath("//*[@class='_30jeq3 _1_WHN1']")); 
			 
			
			for(WebElement s8 : price)
			{
				
				 er2 = s8.getText();
			
			}
			
			
			List<WebElement> link = driver.findElements(By.xpath("//*[@class='_1fQZEK']")); 
			for(WebElement s8 : link)
			{
				
			    er3 = s8.getAttribute("href");
			    System.out.println("'"+er1+"'"+"'"+er2+"'"+"'"+er3+"'");
			}			

	}
	
	

}
