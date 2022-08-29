package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturetooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://jqueryui.com/tooltip/");
        
        driver.switchTo().frame(0);   // here we switch to frame because tooltip present in a frame
        
        
        // capturing a tooltip of a web element
        
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
        String tooltiptext = inputbox.getAttribute("title");  // here we got the value of title which is equal to tooltip
        System.out.println(tooltiptext);
        

	}

}
