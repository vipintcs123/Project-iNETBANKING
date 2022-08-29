package SeleniumSessions;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		
		// here we write a code for read a properties file So for read this file we have to create a object of properties class, This class is found in java
		
		
		Properties prop = new Properties();
			
		// In FileInputStream, we pass a location of config.properties file, FileInputStream class will create a input stream/connection between java code and config.properties file
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Vipin Shukla\\eclipse-workspace\\SeleniumProj\\src\\SeleniumSessions\\config.properties");
		
		// No we are going to load this file
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));   // here we access all the data of config.properties file using prop object.
		
		System.out.println(prop.getProperty("age")); 
		
		String url = prop.getProperty("URL");  // getProperty() returns a string value so we keep url value in string, Here we get a value of "URL" key 
		
		System.out.println(url);   
		
		String browserName = prop.getProperty("browser");    // Here we get a value of "browser" key
		
		System.out.println(browserName);  
		
		
		
		
		 if(browserName.equals("chrome"))
		 {
		  // instansiate chrome browser driver
			
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
				
		     driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url

			 
		 }
		 
		 
		 else if(browserName.equals("FF"))
		 {
	         // instansiate Firefox browser driver    
				
		     System.setProperty("webdriver.gecko.driver","E:\\seleniumfiles\\geckodriver.exe");  
		     
			 driver = new FirefoxDriver();   // launches a Firefox driver with blank url, It create firefox browser driver in webdriver interface
			 
		 }
		 
		 
		 else if(browserName.equals("Edge"))
		 {
			 
	         // instansiate edge browser driver    
				
			 System.setProperty("webdriver.edge.driver","E:\\seleniumfiles\\msedgedriver.exe");    
		     
			 driver = new EdgeDriver();   // launches a Firefox driver with blank url, It create firefox browser driver in webdriver interface
		 }
		
		 
		 // Here we read data and xpath both from a config.properties file
		 
		 
		  driver.get(url);             // Here above we get url from config.properties file using prop object so we pass here url
		
		  driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		  
		  driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		  
		  driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		    
	}

}
