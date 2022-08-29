package config;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StartBrowser {
  
	public static WebDriver driver;
	
	ExtentHtmlReporter htmlreporter;
	
	public static  ExtentReports extent;
	
	public static ExtentTest parentTest;
	
	public static ExtentTest childTest;
	
	
	@BeforeTest
	public void report()
	{
		htmlreporter = new ExtentHtmlReporter("Reports/MyResult.html"); // This line will create automatically html file under "Report" folder
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlreporter);  // whenever we create a report then for each and every test should have method name, but method name difficult- 
		                                              // to write always So i can get method name dynamically
		
	}
	
	
	
	@BeforeMethod()
	public void method(Method method)        // this method give me test method name which are defined in TC01 and TC02 class like method testLogin_Logout()
	{
		parentTest = extent.createTest(method.getName());
	}
	
	
	
	
  @BeforeClass
  public void beforeClass() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  
  
  
  
 
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();  
	  extent.flush();   // if we do not use extent.flush() then it will never create a report, so we have to use this compulsory
	                     // extent.flush() is must used to close a report at end.
  }
  
  

}
