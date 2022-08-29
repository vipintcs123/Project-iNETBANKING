package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanldeJavascriptAlert {

	public static void main(String[] args) throws InterruptedException {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
 	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 	      
 	    
 	      /*
 	      
 	      // 1.  Alert window / java script alert with "Ok" button and with "Cancel" button
 	      
 	      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
 	      
 	      Thread.sleep(3000);
 	      
 	      driver.switchTo().alert().accept();   // to close the alert when "Ok" button is present in alert
 	      
 	       driver.switchTo().alert().dismiss();      // to close the alert when "cancel" button is present in alert
 	       
 	       
 	       */
 	      
 	      
 	      
 	      
 	      
 	      
 	      
 	      // Handle alert window with input box
 	      
 	      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
 	      Thread.sleep(3000);
 	      
 	      // now we capture a text from a alert and also we pass some value into a input box and then we close the alerts
 	      
 	      Alert alertWindow = driver.switchTo().alert();
 	      System.out.println("The message displayed on alert : "+ alertWindow.getText());   // capture text from a alert window
 	      
 	     alertWindow.sendKeys("Vipin Shukla");   // passing some text to a input box present in alert
 	     
 	     alertWindow.accept();   // click on "Ok" button of alert	      
	}

}
