package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorConcept {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F#");
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Tom");
		
	

	}

}
