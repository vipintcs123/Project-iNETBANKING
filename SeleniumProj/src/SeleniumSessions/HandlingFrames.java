package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
	

		 // Here we Instansiate chrome browser driver
		
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface
			
			driver.manage().window().maximize();
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			driver.switchTo().frame(2);   // here we access by FrameName also but here we use by Frame Index
			
		   driver.findElement(By.xpath("//*[@id=\"i0\"]/th/a")).click();			
				

	}

}
