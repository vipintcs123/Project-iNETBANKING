

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWritingTestCases30 {

	public static void main(String[] args) throws InterruptedException {

		
		// Instantiate Chrome browser driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
		
		// Create chrome browser driver in web driver interface
		
		WebDriver driver = new ChromeDriver();  // It launches the chrome browser with blank URL
	
	
		
		
		
		
		
		/*
		
		// First test case for positive Testing for verifying internal and external link
		
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		driver.findElement(By.linkText("Create account")).click();
		
		Thread.sleep(2000);
		
		String url1 = driver.getCurrentUrl();
		
		System.out.println(url1);
		
		if(url1.contains("wikipedia.org"))
		{
			
		  System.out.println("1st Verification: " + "It is an Internal Link  -  Passed");
			
		}
		
		
		else
			
		{
			
			  System.out.println("1st Verification: " + "It is an External Link  -  Failed");
	
			
		}
		
		
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("selenium.dev")).click();
		
		Thread.sleep(2000);
		
       String url2 = driver.getCurrentUrl();
		
       System.out.println(url2);
		
      if(!url2.contains("wikipedia.org"))
		{
			
			  System.out.println("2nd Verification: " + "It is an External Link  -  Passed");
				
		}
			
			
	  else
				
		{
				
			 System.out.println("2nd Verification: " + "It is an Internal Link  -  Failed");
		
				
		}

	
	*/
		
		
	
		
		
		
		
		
	/*	
		
		 // First test case for negative Testing for above same test case  , for verifying internal and external link
		
		
		
        driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		driver.findElement(By.linkText("Create account")).click();
		
		Thread.sleep(2000);
		
		String url1 = driver.getCurrentUrl();
		
		System.out.println(url1);
		
		if(url1.contains("icicibank.com"))
		{
			
		  System.out.println("1st Verification: " + "It is an Internal Link  -  Passed");
			
		}
		
		
		else
			
		{
			
			  System.out.println("1st Verification: " + "It is an External Link  -  Failed");
	
			
		}
		
		
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("selenium.dev")).click();
		
		Thread.sleep(2000);
		
       String url2 = driver.getCurrentUrl();
		
       System.out.println(url2);
		
      if(url2.contains("wikipedia.org"))
		{
			
			  System.out.println("2nd Verification: " + "It is an External Link  -  Passed");
				
		}
			
			
	  else
				
		{
				
			 System.out.println("2nd Verification: " + "It is an Internal Link  -  Failed");
		
				
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		// 2nd test case for positive testing for verifying element existence
		
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.google.com/");
	     
	     boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
	     
	     if(linkPresent == true)
	     {
	    	 
	    	 System.out.println("Gmail Link Exists - Passed");
	    	 
	     }
	     
	     else
         {
	    	 
	    	 System.out.println("Gmail Link is Not Exists - Failed");
	    	 
	     }
	     
	     
	     
	     */
		
		
		
		
		
		
		
		
		
		/*
		
		// 2nd test case for negative testing for verifying element existence
		
		
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.google.com/");
	     
	     
	     try
	     
	     {
	     boolean linkPresent = driver.findElement(By.linkText("Yahoo")).isDisplayed();
	     
	     if(linkPresent == true)
	     {
	    	 
	    	 System.out.println("Gmail Link Exists - Passed");
	    	 
	     }
	     
	     }
	     
	     
	     catch(NoSuchElementException  exception1)
         {
	    	 
	    	 System.out.println("Gmail Link is Not Exists - Failed");
	    	 
	     }
	     
	     
	     */
	    	 
		
		
		
		
		
	
		
		
		
		/*
		
		
		//   3rd test case for positive testing for verifying  Customer Registration in gcrShop web portal user interface 
	
		
		
         driver.manage().window().maximize();
	     
	     driver.get("http://gcreddy.com/project/index.php");
	     
	     driver.findElement(By.linkText("create an account")).click();
	     
	  
	     
	     driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
	     
	     driver.findElement(By.name("firstname")).sendKeys("Abcde");
	     
	     driver.findElement(By.name("lastname")).sendKeys("xyz");
	     
	     driver.findElement(By.id("dob")).sendKeys("12/04/1998");
	     
	     driver.findElement(By.name("email_address")).sendKeys("vipin197@gmail.com");
	     
	     driver.findElement(By.name("street_address")).sendKeys("Village Malika");
	     
	     driver.findElement(By.name("postcode")).sendKeys("242405");
	     
	     driver.findElement(By.name("city")).sendKeys("Shahjahanpur");
	     
	     driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
	     

        // for drop down we have to create Select instance
	     
	     
	     Select dropDown =  new Select (driver.findElement(By.name("country")));
	     
	     dropDown.selectByVisibleText("India");
	     
	     
	     driver.findElement(By.name("telephone")).sendKeys("8052648004");
	     
	   
	     
	     driver.findElement(By.name("password")).sendKeys("abcd123");
	     
	     
	     
	     
	     driver.findElement(By.name("confirmation")).sendKeys("abcd123");
	     
	     
	     
	     driver.findElement(By.id("tdb4")).click();
	     
	     String confirmationMessage = driver.findElement(By.tagName("h1")).getText();
	     
	    // System.out.println(confirmationMessage);
	     
	     
	     
	     if(confirmationMessage.equals("Your Account Has Been Created!"))
	     {
	    	 System.out.println("Customer Registration is SuccessFul - Passed");
	     }
	     
	     
     	else
	    	 
	     {
	    	 System.out.println("Customer Registration is UnsuccessFul - Failed");
	     }
	     
	     
	     
	     */
		
		
		
		
		
		
		
		/*
		
		

		//   3rd test case for negative testing for verifying  Customer Registration in gcrShop web portal user interface, here we myself incorrect password for negative testing 
	// here we use exception handling code for negative testing scenario
		
		
         driver.manage().window().maximize();
	     
	     driver.get("http://gcreddy.com/project/index.php");
	     
	     driver.findElement(By.linkText("create an account")).click();
	     
	  
	     
	     driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
	     
	     driver.findElement(By.name("firstname")).sendKeys("Abcde");
	     
	     driver.findElement(By.name("lastname")).sendKeys("xyz");
	     
	     driver.findElement(By.id("dob")).sendKeys("12/04/1998");
	     
	     driver.findElement(By.name("email_address")).sendKeys("vipin777@gmail.com");
	     
	     driver.findElement(By.name("street_address")).sendKeys("Village Malika");
	     
	     driver.findElement(By.name("postcode")).sendKeys("242405");
	     
	     driver.findElement(By.name("city")).sendKeys("Shahjahanpur");
	     
	     driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
	     

        // for drop down we have to create Select instance
	     
	     
	     Select dropDown =  new Select (driver.findElement(By.name("country")));
	     
	     dropDown.selectByVisibleText("India");
	     
	     
	     driver.findElement(By.name("telephone")).sendKeys("8052648004");
	     
	     try{
	     
	     driver.findElement(By.name("password")).sendKeys("abcd123");
	     
	     
	     
	     
	     driver.findElement(By.name("confirmation")).sendKeys("abcd1235");
	     
	     
	     
	     driver.findElement(By.id("tdb4")).click();
	     
	     String confirmationMessage = driver.findElement(By.tagName("h1")).getText();
	     
	    // System.out.println(confirmationMessage);
	     
	     
	     
	     if(confirmationMessage.equals("Your Account Has Been Created!"))
	     {
	    	 System.out.println("Customer Registration is SuccessFul - Passed");
	     }
	     
	     }
	     catch(UnhandledAlertException exception1)
	    	 
	     {
	    	 System.out.println("Customer Registration is UnsuccessFul - Failed");
	     }
	     
	     
	     
	     */
		
		
		
		
		
		
		
		
		
	     
	     


	     


	     
	     
	     
	     
	     
	     
	     
		
		
		
		
		
	    	 
	    	 
	    	 
	     
	     
		
		
		
		
		
		
		
		
		
		
		
	

      
      
      
      
      
      
      
	}
		
		
}


