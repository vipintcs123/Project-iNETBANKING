import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCase31UserLogin {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

    	// Instantiate google chrome browser driver

		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		// creating chrome browser driver in web driver interface. 
		
		WebDriver driver = new ChromeDriver();  // launches chrome browser window with blank url
	
	   driver.manage().window().maximize();
		
		
		
	
		
		
		
		
		
		
		/*
		
		
		// Test case 4 for positive testing for verifying Customer Login to gcr


		
		
		driver.get("https://gcreddy.com/project/");
		
		driver.findElement(By.linkText("login")).click();
		
		driver.findElement(By.name("email_address")).sendKeys("vipinshukla714@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Consult1230@");
		
		driver.findElement(By.id("tdb1")).click();
		
		// now we insert verification point
		
		if(driver.findElement(By.linkText("Log Off")).isDisplayed() == true)

        {
	    System.out.println("Customer Login is Successfull - Passed");
	
        }
		
		else
		 {
			  System.out.println("Customer Login is Unsuccessfull - Failed");
			
		 }
		 
		 
		 
		 
		 
		
		
		
		
		
	
		
		/*
		
		
	// Test case 4 for negative testing for verifying Customer Login to gcrShop User Interface, here we use exception handling code for negative testing
		
		
		
		driver.get("https://gcreddy.com/project/");
		
		driver.findElement(By.linkText("login")).click();
		
		driver.findElement(By.name("email_address")).sendKeys("vipinshukla714@gmail.com");
		
		
		
		driver.findElement(By.name("password")).sendKeys("Consult123@ki");
		
		driver.findElement(By.id("tdb1")).click();
		
		// now we insert verification point
		
		try {
		
		if(driver.findElement(By.linkText("Log Off")).isDisplayed() == true)

        {
	    System.out.println("Customer Login is Successfull - Passed");
	
        }
		
		
        }
		
		catch(NoSuchElementException exception1)
		
		 {
			  System.out.println("Customer Login is Unsuccessfull - Failed");
			
		 }
		
		
		*/
		
		
		
		
		

		
		
		
		//  Test case 5 for Verify user registration in a forum , for this we have to go to lecture 32 notes
		
		
		
		
		
		
		
		
 
		
		 /*
		
		
		//  Test Case 6 for Verify "Redirect" Functionality from Admin Interface to User Interface in gcrShop Application. see the lecture 32 notes for this also
		
		// below code for only one verification for complete go through notes of lecture 32
		
		
		
		  driver.get("http://gcreddy.com/project/admin/login.php");
		  
		  driver.findElement(By.linkText("Online Catalog")).click();
		  
		  Thread.sleep(3000);
		  
		  String url1 = driver.getCurrentUrl();
		  
		  System.out.println(url1);
		  
		  if(url1.equals("http://gcreddy.com/project/")) {
			  
			  
			  System.out.println("Verification 1 (Before Login) : Redirecting To User Interface from Admin - Passed");
			  
		  }
		  
		  else
		  {
			  System.out.println("Verification 1 (Before Login) : Not Redirecting To User Interface from Admin - Failed");
 
		  }
		  
		  
		  
		  */
		  
		  
		  
		
		  
		  
		  
		  
	
		
		
 	
		
		  
		// Test Case 7  for verifying Data Driven Testing for Admin Login in gcrShop Admin Interface by reading test data from a text file.
		
	
		
		FileReader file = new FileReader("E:\\Selenium by GC REDDY\\input.txt");     //  Opening the specified file in Read Mode
		
		BufferedReader br = new BufferedReader(file);      // Reading the data from a opened file
		
		int Count = 0;
		
		int Iteration=0;
		
		String line;
		
	  while ((line = br.readLine()) != null)
		{
		  
			Count = Count +1;
		
			
		
	  if(Count > 1)
		{
			
			Iteration = Iteration + 1;  
			String [] inputData  = line.split(",", 2);
		
	
		
		driver.get("http://gcreddy.com/project/admin/login.php");
		
		
		driver.findElement(By.name("username")).sendKeys(inputData[0]);
		
		driver.findElement(By.name("password")).sendKeys(inputData[1]);	
		
		driver.findElement(By.id("tdb1")).click();
		
		Thread.sleep(3000);
		
		 String url = driver.getCurrentUrl();
		 
		  if(url.contains("http://www.gcreddy.com//build3/admin/index.php"))
		  {
			  
			  System.out.println(Iteration +" Admin Login is Successful - Passed");
		  }
		  else
          {
			  
			  System.out.println(Iteration +" Admin Login is UnSuccessful - Failed");
		
          }
		 
		  }
		  }
	  
	  
	  
		  br.close();
		  file.close();

		
			  
}
	
}



  