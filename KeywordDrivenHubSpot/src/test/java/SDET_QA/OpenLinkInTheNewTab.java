package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenLinkInTheNewTab {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://demo.nopcommerce.com/");
        
        // For opening a link in new tab we have to use Keys class, here we use combination of 2 keys
        
       String tab =  Keys.chord(Keys.CONTROL, Keys.ENTER);      //here we use combination of 2 keys control and enter, this method return a string type so we store it in string
        
       // above statement will return a string
        
        driver.findElement(By.linkText("Register")).sendKeys(tab);  // now Register page opened on a new tab
        
	}

}
