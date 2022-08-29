package SDET_QA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://demo.nopcommerce.com/");
        
        
     //    Syntax :-
      //  JavascriptExecutor js = (JavascriptExecutor)driver;   // here we type cast web driver to a JavascriptExecutor
      //   js.executeScript(Script,args);
        
        
        
        // Drawing a border around an element and then takes a screenshot , we call a method drawBorder(),  here we draw a border around a logo
        
       WebElement logo =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
       JavaScriptUtil.drawBorder(logo, driver); 
       
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);   
       File trg = new File(".\\Screenshots\\logo2.png");
       FileUtils.copyFile(src, trg);
       
       
       
       
       
       
       // Getting a title of the web page using javascriptexecutor
       
       String title = JavaScriptUtil.geTitleByJS(driver);
       System.out.println(title);
       
       
       
       
       
       // to perform a click action using javascriptexecutor
       
       WebElement regLink = driver.findElement(By.linkText("Register"));
       JavaScriptUtil.clickElementByJS(regLink, driver);
       
       
       
       
       
       
       
       // To Generate an alert at runtime using javascriptexecutor
       
     //  JavaScriptUtil.generateAlert(driver, "This is my Alert...");  // here we pass a message which we want to come in alert window
       
       
       
       
       // Refreshing the page using javascriptexecutor
       
       JavaScriptUtil.refreshBrowserByJS(driver);
       
       
       
       
       // scrolling down a page using javascriptexecutor
       
      JavaScriptUtil.scrollPageDown(driver);
       
       
       // scrolling up a page using javascriptexecutor
       
       Thread.sleep(3000);
       
       JavaScriptUtil.scrollPageUp(driver);
       
       
       
       
       //  Zooming a page using javascriptexecutor
       
       JavaScriptUtil.zoomPageByJS(driver); 
       
       
       
       
       // Flashing/Highlight an element multiple times using javascriptexecutor
       
       WebElement logo1 =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
       JavaScriptUtil.flash(logo1, driver);
          

	}

}
