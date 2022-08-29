package SDET_QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {


		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.selenium.dev/ecosystem/");
		 
		 
		 // 1. finding a how many number of rows in table
		 
		int rows = driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr")).size();
		System.out.println("Total number of rows in a table : "+rows);   // 7
		
		//2.  finding a how many number of columns in a table
		
		int cols =driver.findElements(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//thead//tr//th")).size();
		System.out.println("Total number of columns in a table : "+cols);   // 3
		
		
		
		
		
		//3. Retrieve the specific row and column value
		
		WebElement value1 = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr//p//a[contains(text(),'hs-webdriver')]"));	
		System.out.println(value1.getText());		// hs-webdriver
		
		WebElement value2 = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr[2]//td[1]"));	
		System.out.println(value2.getText());	  // haskell 	
		
		
		
	/*	
		//4.  Retrieving the all the data from a table, here we retrieve all the rows and columns so for this we write here two looping statement
		
		// Here one loop represents the rows and second loop represents the column
		
		for(int i=1 ;i<=rows; i++ )          // This loop represents the increment of rows
		{
			for(int j=0; j<=cols; j++)   // This loop represents the increment of columns, for each row inner loop will read all the columns, represents no of columns in each row
			{
				// here we pass row and column no dynamically, we need to parameterize the row no and column no inside the xpath
				
				String data = driver.findElement(By.xpath("//div[@class='row justify-content-center p-5']//table[@class='table']//tbody//tr["+i+"]//td["+j+"]")).getText();	
				
				// above xpath statment not work properly so code not work properly due to xpath issue
				
				System.out.println(data);	 
				
				
			}
			
		}
		
		*/
		
		
		driver.quit();		

	}

}
