package extentReports_sdet;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReport {
	
	
	// This code not run properly due to some configuration issue.

	ExtentReports extent;    // specify the location of the rep
	ExtentTest test;       //what details should be populated in the report
	
	 
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/MyOwnReport.html", true);  // path where report is stored
		extent.addSystemInfo("Host Name", "Local Host");
		extent.addSystemInfo("Environment","QA");
		extent.addSystemInfo("User Name","Pavan");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));  // to tell where my extent-config.xml file
		
		
	}
	
	
	
	@Test
	public void demoReportPass()       // Report for passing scenario
	{
		test = extent.startTest("demoReportPass"); // send this message to report
		Assert.assertTrue(true);    // send true message to report
		test.log(LogStatus.PASS, "Assert Pass as condition is True");
		
	}
	
	
	

	@Test
	public void demoReportFail()      // Report for failing scenario
	{
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(false);         // here we make intentionally fail this test case
		test.log(LogStatus.FAIL, "Assert Pass as condition is False");
		
	}
	
	
	
	@AfterMethod
	public void getResult(ITestResult result)     // This method automatically get the result, if test case failed then it send entire failure information to report
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());   // getThrowable() gives the log files, it send failure report/log files to the report
			
		}
		
		extent.endTest(test);
		
	}
	
	
	@AfterTest
	public void endReport()
	{
		
		extent.flush();      // to clear the memory
	}
		
}
