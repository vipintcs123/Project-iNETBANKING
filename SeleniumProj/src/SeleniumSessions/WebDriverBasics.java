package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		// instansiate Firefox browser driver    
		
	     System.setProperty("webdriver.gecko.driver","E:\\seleniumfiles\\geckodriver.exe");  
	     
		 WebDriver driver = new FirefoxDriver();      //Here FireFoxDriver  is a class which implements web driver interface, launches firefox browser with blank url
		 
		 
		 
		    /*  launching a google chrome browser
		  
		  // instansiate chrome browser driver
			
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
				
		     driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url

			 */
		 
		 
		 
		 
		 
		 
		 
		 
		  /* Launching a microsoft edge driver 
		   
		System.setProperty("webdriver.edge.driver","E:\\seleniumfiles\\msedgedriver.exe");  
		     
	     WebDriver driver = new EdgeDriver();   //Here EdgeDriver  is a class which implements web driver interface, launches edge browser with blank url
	     
	      */
		 
		
		 driver.manage().window().maximize();   // Maximize the browser window
		 
		 driver.get("https:\\www.google.com");    // entering a url
		 
		 String title = driver.getTitle();   // getting a title
		 
		 System.out.println(title);
		 
		 	 
		 // validation point :
		 
		 if(title.equals("Google"))
		 {
			 
			 System.out.println("correct title");
		 }
		
		 else
			 
        {
			 
			 System.out.println("incorrect title");
		 }
		
		 
		 System.out.println(driver.getCurrentUrl());   // getting a current url
		 
	//	 System.out.println(driver.getPageSource());   //  getting a complete page source
		 
		 driver.quit();  // used to quit all the browsers
		

	}

}
