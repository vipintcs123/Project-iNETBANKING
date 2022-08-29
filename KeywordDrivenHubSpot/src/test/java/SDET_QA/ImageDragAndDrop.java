package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDragAndDrop {

	public static void main(String[] args) {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  
		  
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));  // switch to a particular frame
		  
		  WebElement item1 = driver.findElement(By.xpath("//li[1]"));  // this is source element
		  
		  WebElement item2 = driver.findElement(By.xpath("//li[2]"));  // this is also source element
		  
		  WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));  // this is target element
		  
		  Actions act = new Actions(driver);
		  
		  // move both the items into a trash/target element
		  
		  act.dragAndDrop(item1, trash).perform();
		  act.dragAndDrop(item2, trash).perform();
		  

	}

}
