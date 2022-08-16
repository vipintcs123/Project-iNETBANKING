package com.inetbanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	// Listener class used to generate extent reports.
	
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());  // time stamp
		String repName = "Test-Report-"+timeStamp+".html";
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);  // specify location of report
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("user", "vipin");
		
		
		htmlReporter.config().setDocumentTitle("InternetBanking Test Project");   // Title of Report
		htmlReporter.config().setReportName("Functional Test Automation Report");    // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);   // location of the chart
		htmlReporter.config().setTheme(Theme.DARK);    // set a theme of report
		
	}
	
	
	
	
	
	
	
	public void onTestSuccess(ITestResult tr)
	{
		logger = extent.createTest(tr.getName());  // create a new entry in the report
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));  // send the passed information to report
		
		
	}
	
	
	
	public void onTestFailure(ITestResult tr)
	{
		
		logger = extent.createTest(tr.getName());   // create new entry in the report
		logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));  // send the failed information to report
		
		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		
		
		// tr.getName means it take failed test case name with screenshot
		
		// below code for attach screenshot with report
		
		File f = new File(screenshotPath);
		
		if(f.exists())
		{
			try
			{
				logger.fail("ScreenShot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
				
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
				
			}
		}
		
		
	}
	

	  public void onTestSkipped(ITestResult tr)
	  {
		  
		  logger = extent.createTest(tr.getName());   // create a new entry in report
		  logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		  
		  
	  }
	   
	
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
		
	}
	
		
}
