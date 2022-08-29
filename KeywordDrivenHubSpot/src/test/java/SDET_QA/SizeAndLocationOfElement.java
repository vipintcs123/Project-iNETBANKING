package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
       WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
       
        
       //Method 1. How to get Location of element, there are several ways see below :
       
       System.out.println("Location(x,y): "+ logo.getLocation());    // getLocation return a x,y coordinates of the elements
       System.out.println("Location(x): "+ logo.getLocation().getX());    //here we got only x coordinate of the elements
       System.out.println("Location(y): "+ logo.getLocation().getY());    //here we got only y coordinate of the elements
       
       
       
       
       // Method 2. How to get location of element
       
       
       System.out.println("Location(x): "+ logo.getRect().getX());    //here we got only x coordinate of the elements
       System.out.println("Location(y): "+ logo.getRect().getY());    //here we got only y coordinate of the elements
       
       
       
       
       
       
       
       // Method 1: How to get size (width and height of element)
       
       System.out.println("Size(Width,Height): "+ logo.getSize());   // getting a height and width of element
       System.out.println("Size(Width): "+ logo.getSize().getWidth());   // getting only a width of element
       System.out.println("Size(Height): "+ logo.getSize().getHeight());   // getting only a height of element
       
       
       
       
    // Method 2. How to get size of element
       
       System.out.println("Size(Height,Width): "+ logo.getRect().getDimension());   // getting a height and width of element
       System.out.println("Size(Width): "+ logo.getRect().getDimension().getWidth());   // getting only a width of element
       System.out.println("Size(Height): "+ logo.getRect().getDimension().getHeight());   // getting only a height of element
        

	}

}
