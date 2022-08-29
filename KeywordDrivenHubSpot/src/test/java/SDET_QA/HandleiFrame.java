package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleiFrame {

	public static void main(String[] args) throws InterruptedException {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		  
		  // Here we switch to first iframe and perform a click on element on that frame
		  
		  driver.switchTo().frame("packageListFrame");    // here we switch to the iframe, here we pass name, id or index of the page.
		  
		  driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		  
		  driver.switchTo().defaultContent();   // switch to the main-frame / main-page
		  
		  
		  Thread.sleep(3000);
		  
		  
		  // Here now we switch to second iframe and perform a click on element on that frame
		  
		  driver.switchTo().frame("packageFrame");   // here we switch to 2nd iframe by frame name
		  
		  driver.findElement(By.xpath("//a[normalize-space()='WebDriver']")).click();
		  
		  driver.switchTo().defaultContent();   // switch to the main-frame / main-page
		  
		  
		  Thread.sleep(3000);
		  
		  
		  
        // Here now we switch to third iframe and perform a click on element on that frame
		  
		  driver.switchTo().frame("classFrame");   // here we switch to 3rd iframe by frame name
		  
		  driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
		  
	}

}
