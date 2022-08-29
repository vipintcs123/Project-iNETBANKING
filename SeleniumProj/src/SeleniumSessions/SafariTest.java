package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new SafariDriver();  //Safari Driver is a class which is implementing web drive interface
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

	}

}
