package SDET_AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURLsIn2Tabs {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("http://demo.nopcommerce.com/");
        
        // driver.switchTo().newWindow(WindowType.TAB);  // used for opening a multiple urls in multiple tabs
        
         driver.switchTo().newWindow(WindowType.WINDOW);  // used for opening a multiple urls in multiple windows
        
          driver.get("https://www.opencart.com/");
	}

}
