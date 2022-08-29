package commands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;

import config.StartBrowser;

public class ActionDriver {

	WebDriver driver;
	
	public ActionDriver()    
	{
		driver = StartBrowser.driver;
	}
	
	
	
	// below we are written a customized commands
	
	public void navigateToApplication(String url) {
		try {
		
		driver.get(url);
		
		StartBrowser.childTest.pass("Successfully navigated to : "+url);
		
		} 
		catch(Exception e) {
			
			StartBrowser.childTest.fail("Unable to navigate to: " +url);
		}
	}
	
	
	
	public void click(By locator, String elementName) throws IOException
	{
		try {
		driver.findElement(locator).click();
		StartBrowser.childTest.pass("Successfully clicked on : "+elementName);
		
		}
		
		catch(Exception e)
		{
			
			StartBrowser.childTest.fail("Unable to click on : "+elementName , MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
		
		
	}
	
	
	
	
	public void type(By locator, String text, String elementName) throws IOException
	{
		try
		{
		driver.findElement(locator).sendKeys(text);
		StartBrowser.childTest.pass("Successfully typed in : "+elementName +" With data : "+text);
		}
		
		catch(Exception e)
		{
			StartBrowser.childTest.fail("Unable to type in : "+elementName + "With data :  "+text, MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(e);  
			throw e;
			
		}
		
	}
	
	
	
	
	public String screenShot() {        // here we capture a screenshot in a Base 64 and returning into a string format, base64 is type of format
		
		return ((TakesScreenshot) driver) .getScreenshotAs(OutputType.BASE64) ;   // base 64 means bit and byte format like 01011
		
	}
	
	
}
