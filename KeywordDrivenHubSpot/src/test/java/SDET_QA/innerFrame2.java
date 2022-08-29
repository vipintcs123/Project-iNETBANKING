package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class innerFrame2 {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		  
		  
		  
		  // here first we go to outer iframe and then we got to the inner iframe
		  
		  driver.switchTo().frame("iframeResult");    // switch to the outer iframe
		  
		  driver.switchTo().frame(0);   // switch to the inner iframe means first iframe
		  
		  System.out.println("Text present insdie the inner iframe : "+ driver.findElement(By.xpath("//h1")).getText());     // capturing the text from a inner iframe
		  
		  driver.switchTo().parentFrame();  // Here we go to / switch to parent frame or outer frame
		  
	 	 String text =  driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to specify the size of the iframe:')]")).getText();  // we capture text from a parent frame
		 
		 System.out.println("Text present in outer ifrmae / parent iframe: "+ text);
		  	 
	}

}
