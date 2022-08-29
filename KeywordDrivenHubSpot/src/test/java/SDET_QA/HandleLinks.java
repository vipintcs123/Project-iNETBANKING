package SDET_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
     	  driver.get("https://www.amazon.in/");

     	 
     	/*  1. To locate a link using linkText() and partiallinkText()
     	  //By using linkText()
     	  
         // driver.findElement(By.linkText("Today's Deals")).click();
     
     	 // By using partiallinkText()
     	  
          driver.findElement(By.partialLinkText("Today's")).click();
     	  
     	  */
     	  
     	  
     	  
     	  
     	  
     	  
     	  // 2. Find how many links are present in a web page and capture all the links
     	  
     	  
     	  List<WebElement> links = driver.findElements(By.tagName("a"));    // here each link is a web element, capture all the links and stored in a links variable
     	  
     	  System.out.println("No of links present : "+links.size());    // got number of links
     	  
     	  
     	  
     	  
     	  // Now we want to print all the links in a console window using normal for loop
     	  
     	/*  for(int i=0; i<=links.size(); i++)
     	  {
     		System.out.println(links.get(i).getText());      // here we got all the links in a console window
     		System.out.println(links.get(i).getAttribute("href"));            // here we get value of href attribute in a console window
     		  
     	  }
     	 
     	 */
     	  
     	  
     	  
     	// Now we want to print all the links in a console window using for each loop
     	  
     	  
     	  for(WebElement link : links)
     	  {
     		  
     		 System.out.println(link.getText());   // print the name of the link
     		 System.out.println(link.getAttribute("href"));   // here we get value of href attribute in a console window
     	  }              	  
     	  
	}

}
