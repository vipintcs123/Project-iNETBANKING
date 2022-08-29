package SDET_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.opencart.com/admin/index.php");
		 
		 
		 
		 // Login to website
		 
		 WebElement userName =  driver.findElement(By.id("input-username"));
		 userName.clear();
		 userName.sendKeys("Demo");       // typing a username
		 
		 WebElement password = driver.findElement(By.id("input-password"));
		 password.clear();
		 password.sendKeys("Demo");        // typing a password
		 
		 
	     // Below we click on Sales -> Orders
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();        // click on Login
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();   // After Login click on Sales
		 
		 driver.findElement(By.xpath("//*[@id=\"collapse26\"]/li[1]/a")).click();   // click on Orders inside Sales
		 
		 
		 // 1.)  Finding a total number of pages in a table
		 
		 String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		 System.out.println(text);      // Showing 1 to 20 of 11398 (570 Pages)
		 
	   //This below method will return string so we convert it into number format so we use Integer.valueof()
		 
		 int total_pages = Integer.valueOf(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));   // Here we got value 570
		 System.out.println("Total number of pages "+total_pages);  // print a total no of pages
		 
		 
		 
		 // 2.)  Shows how many rows exists in each page
		 
		 // Now we count number of rows present in each and every page, These pages are dynamic nut now pages are 570
		 
		 // So for this we have to click on each and every page and then find no of rows in each and every page
		 
		 
		 for(int p=1; p<=5;p++)  // loop for click on each and every page , here we hard code 5 because there are more pages, but here we have to pass total_pagess
		 {
			 // In web table active element has a <span> tag and rest element have a <a> tag
			 
		  WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));  // Give the page no of current active page
		  
		  System.out.println("Active Page:" +active_page.getText());    // here we got active page number
		  
		  active_page.click();  // whenever we click on page then that page is active, now after clicking we find out below total rows in a clicked/active page
		  
		  
		  // Now we going to find total number of rows in a first page
		  
		  int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();   // here we got total no. of rows in active page
		
		  System.out.println("Number of rows :"+rows);   // get the no of rows in each active page
		  
		  
		  
		  
		  
		  // 3.) Read all the rows from each page before going to next page,  here we read all row data , here we read three columns customer name, orderID, status
		  
		  for(int r=1;r<=rows;r++)
		  {
			  
			String orderId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();  // Here we got order id
			String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();  // Here we got Customer name
			String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();  // Here we got status like pending 
			
			
			// here we get data where data of each row where status is pending
			
			if(status.equals("Pending"))
			{
				
			System.out.println(orderId+"       "+customerName+"         "+status);
			
			}
			
		  }
		  	  
		  
		  // In above statement we click on first page and got data/ rows of first page 
		  
		  // Now we have to click on all pages one by one and also capture the rows of each and every page
		  
		    String pageno = Integer.toString(p+1);
		  
		  driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();  // as soon as  this perform click action then that page is in active state
		  
		 		 
		 }
		 		 

	}

}
