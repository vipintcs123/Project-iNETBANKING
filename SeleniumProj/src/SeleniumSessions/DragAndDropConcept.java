package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		 // instansiate chrome browser driver
		
		    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.get("https://jqueryui.com/droppable/");
			
			driver.switchTo().frame(0);         // here we switch from top window to a first frame
			
			Actions action = new Actions(driver);
			
			action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
			.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
			.release()
			.build()
			.perform();

	}

}
