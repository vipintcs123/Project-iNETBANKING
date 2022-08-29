package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public WebDriver driver;
	
	
	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	// below method is for waiting for a specific element, before performing any action on element until that element must be visible on web page,-
	// i need to wait for sometime, we pass here element name as a parameter for which element we have to wait and also we have to pass waiting time as a parameter
	
	//  Explicit wait is a conditional wait based not on time base, But we also pass a maximum time.

	
	public void WaitForElement(WebElement element, long timeOutInSeconds)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));            // wait till element will be visible on the page
		
	}

}
