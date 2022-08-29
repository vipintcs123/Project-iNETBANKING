package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		
		 // instansiate chrome browser driver
		
		   System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface
			
			driver.manage().window().maximize();
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.name("proceed")).click();
			
	        Alert alert = driver.switchTo().alert();   // This command used to switch from web page to alert/pop up.
	    	
	        String text = alert.getText();   // Here we get text which is present in alert
		  		  	  	
	  	  	if(text.equals("Please enter a valid user name"))
	  	  	{
	  	  	System.out.println("correct alert message");
	  	  		
	  	  	}
	  	  	
	  	  	else
	  	  	{
	  	  	System.out.println("incorrect alert message");
	  	  		
	  	  	}
	  	  		
	  	  	
	  	  	alert.accept();   // Here we click the "Ok" button of alert
	  	  	
	  	  	driver.close();
	  	  	
	  	  	// alert.dismiss();   // Here we click "cancel" button of alert
	  	  	
	  	  	 
	}

}
