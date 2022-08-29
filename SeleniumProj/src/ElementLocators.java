import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Instantiate google chrome browser driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();  // creating chrome browser driver in web driver interface
		
         driver.get("https://www.gmail.com/");  // used for "cssSelector" locator
		
		//driver.get("https://www.google.com/");  // This is used for for className locator So i commented 1st line, used also for linkText Locator
	
		driver.manage().window().maximize();     // maximize the browser window 
		
		
	
		
		
		//Syntax 1 for using "id" locator:-
	
		//driver.findElement(By.id("identifierId")).sendKeys("india123");  // findElement used for recognizing the element and sendKeys used for performing action on the elements
		
		
		
		
		/*
		 * //Syntax 2 for using "id" locator:-
		 * 
		 * WebElement editBox = driver.findElement(By.id("identifierId"));
		 * editBox.sendKeys("India321"); Thread.sleep(3000);
		 * 
		 * String val = editBox.getAttribute("value"); System.out.println(val);
		 * editBox.clear();
		 */
		
		
		
		
		
		
		
		//Syntax 1 for using "name" locator:-
		
	//driver.findElement(By.name("identifier")).sendKeys("Hyderabad123");  // findElement used for recognizing the element and sendKeys used for performing action on the elements
		
		
		
		//Syntax for using "className" locator:-
		
		//driver.findElement(By.className("gb_f")).click();    // It will click Gmail link in google home page
		
	
		
		
		
		
	  //Syntax for using "tagName" locator:-
		
		//driver.findElement(By.tagName("input")).sendKeys("abcdxyz123"); // here we enter a value in editbox using tagName locator
		
		
		
		
		
		
		
		
		
		
		
		  //Syntax for using "linkText" locator, linkText applicable only for link elements
			
			//driver.findElement(By.linkText("Gmail")).click();  // It will click Gmail link in google home page
		
		
		
		
		
		
		
		
		 //Syntax for using "partialLinkText" locator, linkText applicable only for link elements, for this we use goole link given on above
		
	//	driver.findElement(By.partialLinkText("Gm")).click();  // It will also click Gmail link in google home page as above syntax
	
		
		
		
		
		
		
		
		
		
		 //Syntax for using "cssSelector" locator
		
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("abcdxyz123"); // for this we used gmail link given on above
		
		
		
		
		
		
		
		
		
		

		 //Syntax for using "xpath" locator or XML path
		
		// driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abcdxyz123"); // for this we used gmail link given on above
		
		
		
		
		
		
		
		

	}

}
