package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;


public class BaseClass {    
	
	
	  // here we write a common things which is required for every test case
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL =  readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password =  readconfig.getPassword();
	public static WebDriver driver;	
	public static Logger logger;
	
	
	// this setup() method will run before each and every test class where ever we extends this class
	 
	@Parameters("browser")   // it take browser value from testng.xml file
	@BeforeClass
	public void setup(String br)        // here we got br value from testng.xml file
	{
		
		
	    logger = Logger.getLogger("ebanking");    // here we pass the name of the project or name of the class.
		PropertyConfigurator.configure("Log4j.properties");
		

		if(br.equals("chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		}
		
		
		else if(br.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
		}
		
		
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readconfig.getEdgePath());
			
			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
		}
		
		
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseURL);
		
	}

	
	
	
	
	// below code for taking a screenshot, when test method failed then we call this method in test case.
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+ "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	
	
	
	
	// we have to pass email address unique every time  , So to overcome this here we are going to generate a random email id means 
	  // every time different email generated, here we generate dynamically because application not allows same email id every time
	// So we going to make user defined method for generate a random email id, see below :-
	
	
	public String randomestring()   // when we call this method , it give a random string 
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(5);   // here it generate 5 character random string
		return(generatedstring);
		
	}
	
	
	
	public String randomeNum()   // when we call this method , it give a random number 
	{
		String generatedstring2 = RandomStringUtils.randomNumeric(4);   // here it generate 5 character random number
		return  generatedstring2;
		
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
		
	}
}
