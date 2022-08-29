package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDrop {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  
		  
		  // So for drag and drop we have to know the source and target element
		  
		  WebElement rome = driver.findElement(By.id("box6"));    // this is source element which we have to drag
		  
		  WebElement italy = driver.findElement(By.id("box106"));    // this is target element where we have to drop
		  
		  Actions act = new Actions(driver);
		  act.dragAndDrop(rome, italy).perform();
		  
		  

	}

}
