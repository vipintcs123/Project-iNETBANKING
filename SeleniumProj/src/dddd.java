import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class dddd {

	public  static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		
	

		
		// Instantiate google chrome browser driver
		
		        System.setProperty("webdriver.chrome.silentOutput","true");
		
				System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver.exe");
				
				driver = new ChromeDriver();  // creating chrome browser driver in web driver interface
				

				driver.manage().window().maximize();     // maximize the browser window 
				
				
				driver.get("https://ui.cogmento.com/");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vipinshukla714@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Lawyer123@");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
				Thread.sleep(3000);
				Actions action = new Actions(driver);
				
				WebElement ele = driver.findElement(By.xpath("//a//span[contains(text(),'Contacts')]"));
			
				
				
				driver.findElement(By.name("first_name")).sendKeys("ashwani");
				driver.findElement(By.name("last_name")).sendKeys("Shuklaa");
				driver.findElement(By.name("description")).sendKeys("Aabc ddd sty hjf vjjg");
				
				
				WebElement ele1 = driver.findElement(By.xpath("//div[@class='menu-item-wrapper']//button[@class='ui mini basic icon button']//i[@aria-hidden='true']"));
				  action.moveToElement(ele).build().perform();
				  ele1.click();
					Thread.sleep(3000);
				  
				  driver.findElement(By.name("first_name")).sendKeys("ashwani");
					driver.findElement(By.name("last_name")).sendKeys("Shuklaa");
					driver.findElement(By.name("description")).sendKeys("Aabc ddd sty hjf vjjg");
					
					Thread.sleep(6000);
					
				driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
				
				
				

	}

}
