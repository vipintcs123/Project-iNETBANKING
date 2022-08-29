package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {

	 public static WebDriver driver;
	 public static Properties prop;
	 public static EventFiringWebDriver e_driver;
	 public static WebEventListener eventListener;

	
	
	public TestBase()
	{
	
	     try
	     {
	    	 prop = new Properties();
	    	 FileInputStream ip = new FileInputStream("C:\\Users\\Vipin Shukla\\eclipse-workspace\\POMByNaveen\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	    	 
	    	 prop.load(ip);
	    	 
	     }
	     
	     catch(FileNotFoundException e)
	     {
	    	 e.printStackTrace();
	    	 
	     } catch(IOException e)
	     {
	    	 e.printStackTrace();
	    	 
	     }
		
	}
	
	
	
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");  
		
		if(browsername.equals("chrome"))
		{
		 
			  System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver.exe");  // instansiate chrome browser driver
				
		      driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface
			
		}
		
		else if(browsername.equals("firefox"))
		{
			 
			  System.setProperty("webdriver.gecko.driver","E:\\seleniumfiles\\chromedriver.exe");  // instansiate firefox browser driver
				
		      driver = new FirefoxDriver();  // Here FirefoxDriver is a class which implements web driver interface
			
		}
		
		
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now we create object of EventListenerHandler to register it with EvenetFiringWebDriver
		
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);  // here we take pageload time out value from a TestUtil.java class
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);  // here we take implicit wait value from a TestUtil.java class
		 
		 // pageload timeout and implicit wait always takes a long value so we define in TestUtil package both variable as a long
		 
		 driver.get(prop.getProperty("url"));   // read url from a config.properties file using prop object
		
	}
    
	
	
	
	
	
	
	
	
	
	
	

}
