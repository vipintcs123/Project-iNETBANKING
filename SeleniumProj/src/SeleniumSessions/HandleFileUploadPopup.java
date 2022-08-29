package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
	
		 // Here we Instansiate chrome browser driver
		
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface
			
			driver.manage().window().maximize();
			
			driver.get("https://html.com/input-type-file/");
			
			
			// Here write a code for uploading a file
			
			driver.findElement(By.id("fileupload")).sendKeys("E:\\Selenium By NAVEEN AUTOMATION LABS\\inputdata.xlsx");
			

	}

}
