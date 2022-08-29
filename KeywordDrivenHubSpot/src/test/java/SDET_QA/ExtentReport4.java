package SDET_QA;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport4 {
	
	
	public WebDriver driver;
	
	ExtentHtmlReporter htmlReporter;   // This class responsible for look and field of report and decides where e store our report
	
	ExtentReports extent;    // responsible for creating test cases , and we also add some extra information using this
	
	ExtentTest test;   // used to create a new entry in report
	
	
	// This method will do setup required for extent report
	
	@BeforeTest
	public void setExtent()
	{
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");  // here we give a complete path where store the extent report
		
		htmlReporter.config().setDocumentTitle("Automation Report");  // Title of the report
		htmlReporter.config().setReportName("Functional Report");  // Name of the report
		htmlReporter.config().setTheme(Theme.DARK);   // theme of report
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);    // attach a htmlReporter
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester Name", "Vipin");
		extent.setSystemInfo("Browser", "Chrome");
				
	}
	
	
		
	@AfterTest
	public void endReport()
	{
		
		extent.flush();   // This will flush the report
	}
	
	
	
	
@BeforeMethod
public void setup()
{
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.nopcommerce.com/");
	
}
	


	
// Now we are going to create a test case, Test Case 1

@Test          // Test Case 1
public void noCommerceTitleTest()           // here we verify title of website
{
	
	test = extent.createTest("noCommerceTitleTest");            // create an new entry in report and used to create a new test in extent report
	
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "nopCommerce demo store");
}
	




@Test                      // Test Case 2
public void noCommerceLogoTest()    // used for test a logo is present or not, Test case 2
{
	test = extent.createTest("noCommerceLogoTest");            // create an new entry in report and used to create a new test in report
	
	boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	Assert.assertTrue(status);
	
	
}
	



@Test                          // Test Case 3, here we also add sub nodes in test case, like below we login with some valid data and invalid data
public void noCommerceLoginTest()   //, Test Case 3
{
	
	test = extent.createTest("noCommerceLoginTest");            // create an new entry in report and used to create a new test in extent report
	
	 // this will create one more entry inside  noCommerceLoginTest test case / we say we can create sub node inside main node
	
	test.createNode("Login with valid input");  // This is another test entry, here one sub node created inside main node
	
	Assert.assertTrue(true);
	
	test.createNode("Login with Invalid input");   // This is another test entry, here we create second sub node inside main node
	
	Assert.assertTrue(true);  // so finally here we created 2 sub nodes inside main node
}

	






// If sometime test case pass or fail so for updating status of test (either pass or fail) in extent report we use tearDown Method
  
// here result variable contains status of test case either pass or fail, this method execute every time after completion of each test case



@AfterMethod
public void tearDown(ITestResult result) throws IOException 
{

 if (result.getStatus() == ITestResult.FAILURE)  // we send a fail status/log of a test case to a report using test object
	 
{
	 
  test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // result.getName() will take the name of a test case dynamically
  
  test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report, here we send the logs or failure messages to report
  
  String screenshotPath = ExtentReport4.getScreenshot(driver, result.getName());  // result.getName() give test case name and we give that name as a screenshot name
  
  test.addScreenCaptureFromPath(screenshotPath);  // adding screen shot of failure status of test case in report
  
  
 }
 
 
 
  else if (result.getStatus() == ITestResult.SKIP)  // we send a skip status/log of a test case to a report using test object
	  
 {  
	  
  test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName()); // result.getName() will take the name of a test case dynamically
  
 }
 
 
 

 else if (result.getStatus() == ITestResult.SUCCESS)      // we send a pass status/log of a test case to a report using test object
 {
	 
	 
  test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
  
 }

 driver.quit();
 
}




// Method for taking a screenshot of failed status of test case


public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException 

{
	
 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
 
 TakesScreenshot ts = (TakesScreenshot) driver;
 
 File source = ts.getScreenshotAs(OutputType.FILE);
 
 
 String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";  // give destination where we keep our screenshot
 
 File finalDestination = new File(destination);  
 
 FileUtils.copyFile(source, finalDestination);        // copy screenshot in destination location
 
 return destination;
 

}


}


