package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionMultipleKeys {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://text-compare.com/");
		  
		  WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));  // first input box
		  WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));  // second input box
		  
		  input1.sendKeys("welcome to selenium");
		  
		  Actions act = new Actions(driver);
		  
		  
		  // Now we perform CTRL + A to select the text from a input box which we are written
		  
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("A");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  
		  
		  
		// Now we perform CTRL + C to copy the text from a input box which we are written
		  
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("C");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  
		  
	// Now we perform/pressing Tab key to shift to the second input box
		  
		  act.sendKeys(Keys.TAB);
		  act.perform();
		  
		  
		  
			// Now we perform CTRL + V to paste the text from to a second input box
		  
		  
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("V");
		  act.keyUp(Keys.CONTROL);
		  act.perform();
		  
		  
		  
		  // compare text from input box 1 and input box 2
		  
		  if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		  {
			  
			  System.out.println("Text Copied successfully");
		  }
		  
		  else
		  {
			  
			  System.out.println("Text Not Copied ");
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		  
	}

}
