package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class innerIFrame {

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("http://demo.automationtesting.in/Frames.html");
		  
		  
          driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
          
          // here we get a outer iframe as a web element. Inside outer iframe, there are other inner iframes are present
          
          WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
          
          // Now we switch to the outer iframe
          
          driver.switchTo().frame(outerframe);    // here we passing frame as a web element, here we switch to outer iframe
          
          
       // here we got inner iframe as a web element
          
          WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));  
          
          // Now we switch to inner iFrame
          
          driver.switchTo().frame(innerFrame); 
          
          // Now we able to perform operation on element present inside inner iframe
          
          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vipin Shukla");	  

	}

}
