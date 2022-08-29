package SDET_QA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("http://demo.nopcommerce.com/");
	    
        
        // Now we write a code for getting a Full Page Screenshot
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;   // here we do a typecasting
	    File src = ts.getScreenshotAs(OutputType.FILE);   // getScreenshotAs() method return a one file object so we take it in File instance, screenshot is of file type
	    
	    // above statement takes a screenshot and saves screenshot in my memory but exactly we don' t know the location so we copy that file at my own location
	    
	    File target = new File(".\\Screenshots\\homepage.png");    // here we create my own location and specify the location
	    
	    // Now we copy source file to a target file
	    
	     FileUtils.copyFile(src, target);      // this statement will copy the screenshot file at my target location
	     
	     
	     
	     
	     
	  
	     
	     
	     // Capture screenshot of section/portion of a web page
	    	  
	     // here first we take a xpath of section which we want to capture So here we take a section as a web element
		   
	        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	     
		    File src1 = section.getScreenshotAs(OutputType.FILE);   // getScreenshotAs() method return a one file object so we take it in File instance, here it return a screenshot of section of a page
		    
		    File target1 = new File(".\\Screenshots\\featuredproducts.png");    // here we create my own location and specify the location
		    
		    FileUtils.copyFile(src1, target1);      // this statement will copy the screenshot file at my target location
		     
		     
	     
	     
	      
	     
		    
		    
		    //Capture screenshot of specific element
		    
		    
	       // Here first we take a xpath of a specific web element
		    
		    WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	     
		    File src2 = ele.getScreenshotAs(OutputType.FILE);   // getScreenshotAs() method return a one file object so we take it in File instance, ehere it return a screenshot of section of a page
		    
		    File target2 = new File(".\\Screenshots\\logo.png");    // here we create my own location and specify the location
		    
		    FileUtils.copyFile(src2, target2);      // this statement will copy the screenshot file at my target location
		     
	}

}
