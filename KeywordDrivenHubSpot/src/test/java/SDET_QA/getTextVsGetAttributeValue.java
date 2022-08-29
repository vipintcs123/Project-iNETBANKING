package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsGetAttributeValue {

	public static void main(String[] args) {

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://admin-demo.nopcommerce.com/login/");
		  
		  WebElement emailinputbox = driver.findElement(By.id("Email"));
		  
		 // emailinputbox.clear();   // we clear the text box
		 // emailinputbox.sendKeys("admin123@gmail.com");
		  
		  
		  
		  // Now we capture the text from a input box by using getAttribute

		  String value =  emailinputbox.getAttribute("value");        // here we use getAttribute and we grt the value of attribute
		  System.out.println("Result from getAttribute() method : "+value);
		
		  
		  
		  
		
		  
		  WebElement value1 = driver.findElement(By.xpath("//div[@class='title']//strong"));
		  String innerText =  value1.getText();                      // here we use getText
		  System.out.println("Result from getText() method : "+innerText);   // here we got inner text of element
		  
		  
		  
		  
		  
		  // For Login Button
		  
		  WebElement value2 = driver.findElement(By.xpath("//button[@type='submit']"));
		  String innerTextLoginBtn =  value2.getText();                      // here we use getText
		  System.out.println("Result from getText() method : "+innerTextLoginBtn);   // here we got inner text of element
		  
	}

}
