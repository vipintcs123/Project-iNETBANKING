package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	 
	    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	    
	    // Here we move starting end slider or( minimum slider)
	    
	    WebElement min_slider = driver.findElement(By.xpath("//span[1]"));   // xpath of starting end of slider
	    
	    System.out.println("Location of min slider: "+min_slider.getLocation());   // (59,250) here we get a (x,y) coordinates of staring end of slider
	    
	    System.out.println("height and width of the element : "+min_slider.getSize());  // (21,21) we get size or height and width of starting end of slider
	    
	    
 //  For a slider, we have to drag the Slider so this is mouse action, So we have to use Actions class for Mouse Action. So we make a Action class object.
	    
	    
	    Actions act = new Actions(driver);
	    
 // here we use 100 for x axis because we move slider towards only x axis direction , we not want to move slider towards y axis so we use 0 for y axis
	    
	    act.dragAndDropBy(min_slider, 100, 0).perform();
	    
	    // After moving slider we again want to get size and (x,y) coordinates of slider
	    
        System.out.println("Location of min slider: "+min_slider.getLocation());   // (158,250) 
	    
	    System.out.println("height and width of the element : "+min_slider.getSize());  // (21,21) 
	    
	    
	    
	    // Now we try to move ending end slider (maximum slider) 
	    
	    WebElement max_Slider = driver.findElement(By.xpath("//span[2]"));
	    act.dragAndDropBy(max_Slider, -100 , 0).perform();        // here we reduce slider towards x axis so here we give a minus value
	    
	}

}
