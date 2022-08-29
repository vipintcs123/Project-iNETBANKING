import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AdminLockingSelenium34 {
	
	public static WebDriver driver;
	
	public static String ErrorMessage;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// Test Case 9: Write a Test Case for Admin Login Locking 	Functionality, see lecture 33 last page notes and lecture 34 starting notes 
		// because this test case cover in both lecture that is lecture 33 and lecture 34 also.
		// This test case code is wrong in lecture notes, and here is correct code given below.
	

	
		
		// Instantiate google chrome browser driver
		
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
			
			// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
			
	    
			
			
			
			
			FileReader file = new FileReader("E:\\Selenium by GC REDDY\\input.txt");    // opening the specified file in read mode
			
			BufferedReader br = new BufferedReader(file);   // Reading the data from a opened file
			
			
		int count = 0;
		
		int iteration = 0;
		
		String line;
		
		while((line = br.readLine()) != null)
		{
			
			count = count + 1;
			
			if(count > 1)  {
				
				iteration = iteration + 1;
				
				String [] inputData = line.split(",", 2);
				
				
				
     		
     	
				
				
	        driver = new ChromeDriver();    // launches the browser with blank URL
	       
			
			driver.get("http://gcreddy.com/project/admin/login.php");    // navigate to gcrshop admin interface
			
		   	driver.manage().window().maximize();     // maximize the browser window 
			
			
			driver.findElement(By.name("username")).sendKeys(inputData[0]);
			
			driver.findElement(By.name("password")).sendKeys(inputData[1]);	
			
			driver.findElement(By.id("tdb1")).click();
			
			Thread.sleep(3000);
			
			ErrorMessage = driver.findElement(By.className("messageStackError")).getText();
			
			
			if((iteration == 4)  &&  (ErrorMessage.contains("Error: The maximum number of login attempts has been reached. Please try again in 5 minutes.")))
			
			{
			System.out.println(iteration + " maximum number of login attempts has been reached - Passed");
			}
			
			else
				
			{
				System.out.println(iteration + " maximum number of login attempts are not over - Done");
			}
		
	

	}
			
	}
		

		 br.close();
		 
		 file.close();
		
		
		
	}

}
