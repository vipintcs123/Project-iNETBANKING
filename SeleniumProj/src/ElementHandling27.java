import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementHandling27 {

	public static void main(String[] args) throws InterruptedException {


		// Instantiate google chrome browser driver
		
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
			
			// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
			
			WebDriver driver = new ChromeDriver();    // launches the browser with blank URL
			
			
			
			
			// Example 1 for handling browser
			
			
			/*
			 * driver.manage().window().maximize(); // maximize the browser window
			 * 
			 * driver.get("https://www.google.com/"); // navigate to a specified URL
			 * 
			 * 
			 * 
			 * // navigate to another URL
			 * 
			 * driver.get("http://gcreddy.com/project/admin/login.php"); 
			 * 
			 * 
			 * 
			 * 
			 * // navigate back to previous URL
			 * 
			 * driver.navigate().back();
			 * 
			 * 
			 * 
			 * // forward to next URL
			 * 
			 * driver.navigate().forward();
			 * 
			 * 
			 * 
			 * // Refresh the browser window
			 * 
			 * driver.navigate().refresh();
			 * 
			 * 
			 * 
			 * // Return browser title
			 * 
			 * String title = driver.getTitle(); System.out.println(title);
			 * 
			 * 
			 * 
			 * // Return browser current URL
			 * 
			 * String url = driver.getCurrentUrl(); System.out.println(url);
			 * 
			 * 
			 * 
			 * // Return browser window handle
			 * 
			 * String handle = driver.getWindowHandle(); System.out.println(handle);
			 * 
			 * 
			 * 
			 * // Return page source
			 * 
			 * String pageSource = driver.getPageSource();
			 * 
			 * 
			 * // close the focused browser window
			 * 
			 * driver.close();
			 * 
			 * 
			 */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// Example 2 for handling Edit Box using syntax 1
			
			// maximize the browser window 
			
		
			/*
			 * driver.manage().window().maximize(); 
			 * driver.get("http://gcreddy.com/project/admin/login.php");
			 * 
			 * 
			 * // check the displayed status of edit box, it return value as a boolean that
			 * is true or false
			 * 
			 * boolean displayStatus =
			 * driver.findElement(By.name("username")).isDisplayed();
			 * System.out.println(displayStatus); // true
			 * 
			 * 
			 * 
			 * 
			 * // check the enabled status of edit box, it return value as a boolean that is
			 * true or false
			 * 
			 * boolean enabledStatus = driver.findElement(By.name("username")).isEnabled();
			 * System.out.println(enabledStatus); // true
			 * 
			 * 
			 * 
			 * String Uname = "Farjana123";
			 * driver.findElement(By.name("username")).sendKeys(Uname);
			 * 
			 * Thread.sleep(3000);
			 * 
			 * 
			 * // here we return the value of edit box in val variable
			 * 
			 * String val = driver.findElement(By.name("username")).getAttribute("value");
			 * System.out.println(val);
			 * 
			 * 
			 * 
			 * // here we check value type of edit box
			 * 
			 * String elementvalueType =
			 * driver.findElement(By.name("username")).getAttribute("type");
			 * System.out.println(elementvalueType); // text, here value type of edit box is
			 * "text"
			 * 
			 * 
			 * elementvalueType =
			 * driver.findElement(By.name("password")).getAttribute("type");
			 * System.out.println(elementvalueType); // password , here value type of edit
			 * box is "password"
			 * 
			 * 
			 * Thread.sleep(3000);
			 * 
			 * 
			 * 
			 * // to clear the value in first edit box
			 * 
			 * driver.findElement(By.name("username")).clear();
			 * 
			 * 
			 */
	        
	        
	 
			
			
			
	   /*     
	     // Example 3 for handling Edit Box using syntax 2, here we identify the element once and conduct operarion multiple times one by one
			
			
			  driver.manage().window().maximize();
			  driver.get("http://gcreddy.com/project/admin/login.php");
			  
			  // Create web element for edit box
			  
			  WebElement editBox = driver.findElement(By.name("username"));
			  
			  boolean status = editBox.isDisplayed(); System.out.println(status); // true
			  
			  
			  status = editBox.isEnabled(); System.out.println(status); // true
			  
			  
			  
			  editBox.sendKeys("ABCD123"); 
			  Thread.sleep(3000);
			  
			  
			  
			  // here we got the value of edit box in val variable
			  
			  String val = editBox.getAttribute("value"); System.out.println(val); //  ABCD123
			 
			  
			  
			  
			  
			  
			  // here we got the value type which is entered already in editbox
			  
			  val = editBox.getAttribute("type"); System.out.println(val); // text
			  
			  
			  
			  // used to clear the editBox
			  
			  editBox.clear();
			  
			 */
			
			
			
			
	
			
			
			
			
			/*
			
			// Example for  Handling text area, error message and Pop up window
			
			driver.manage().window().maximize(); 
		    driver.get("http://www.gmail.com/");
		    
		   // Return text area
		    
		    String textArea = driver.findElement(By.xpath("//*[@id=\'headingSubtext\']/span")).getText();
		    System.out.println(textArea);
		    
		    
		    // here we find id from xpath and we also use here xpath 
		    
		  driver.findElement(By.id("identifierNext")).click();
		    
		    
		    
		    
		    // Return  error message which come during click on next button in email
		    
		    String errorMessage = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText();
		    System.out.println(errorMessage);
		    
		    */
		    
		    
		    
		    
			
			
			
			
		/*
			
		    // Handling pop up window
			
			driver.manage().window().maximize();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    driver.findElement(By.name("proceed")).click();
		    
		    
		    Alert popUp = driver.switchTo().alert(); // used to switch driver focus from web page to PopUp window and store the reference to popUp
			String errorMessage = popUp.getText();
			System.out.println(errorMessage);
			
			Thread.sleep(2000);
			
			popUp.accept();
			
			driver.findElement(By.id("login1")).sendKeys("India123");
			
			*/
			
			
			
			
			
			
			
			// From here lecture 28 started 
			
			/*
			
             // Handling links using first syntax
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
			
			System.out.println(linkPresent);   // true
			
			boolean linkStatus = driver.findElement(By.linkText("Gmail")).isEnabled();
			
			System.out.println(linkStatus);  // true
					
			
			String linkName = driver.findElement(By.linkText("Gmail")).getText();
			
			System.out.println(linkName);
			
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Gmail")).click();
			
			
			*/
			
			
			
			
			
			
	
			
			/*
			

            // Handling links using second syntax, same operation as above performed
			
			
            driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement gmailLink = driver.findElement(By.linkText("Gmail")); // here we recognize the element and store reference in gmailLink element
			
			boolean  linkStatus = gmailLink.isDisplayed();
			
			System.out.println(linkStatus);
			
			linkStatus = gmailLink.isEnabled();
			System.out.println(linkStatus);
			
			String linkName = gmailLink.getText();
			
			System.out.println(linkName);
			
			Thread.sleep(3000);
			
			gmailLink.click();
			
			
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			// Handling checkBox using first syntax
			
			
            driver.manage().window().maximize();
			
			driver.get("https://gcreddy.com/project/create_account.php");
			
			boolean status = driver.findElement(By.name("newsletter")).isDisplayed();
			
			System.out.println(status);  // true
			
            status = driver.findElement(By.name("newsletter")).isEnabled();
			
		    System.out.println(status);  // true
			
		    status = driver.findElement(By.name("newsletter")).isSelected();
				
		    System.out.println(status);  // false
		    
		    
		    driver.findElement(By.name("newsletter")).click();
		    
		    Thread.sleep(3000);
		    

		    status = driver.findElement(By.name("newsletter")).isSelected();
				
		    System.out.println(status);  // true
		    
		    */
			
			
			
			
			
			
			
			
			/*
			
			
			// Handling checkBox using second syntax
			
			driver.manage().window().maximize();
			
			driver.get("https://gcreddy.com/project/create_account.php");
			
			WebElement checkBox = driver.findElement(By.name("newsletter"));  // here we recognize the element and store reference in checkBox element
			
			System.out.println(checkBox.isDisplayed()); // true
			
			System.out.println(checkBox.isEnabled()); // true
			
			System.out.println(checkBox.isSelected());  // false
			
			checkBox.click();
			
			Thread.sleep(3000);
			
			System.out.println(checkBox.isSelected());  // true
			
			
			*/
			
			
			
			
			
			
			
			
			
			
			/*
			// Handling Radio Button using first syntax
			
			
            driver.manage().window().maximize();
			
			driver.get("https://gcreddy.com/project/create_account.php");
			
			boolean Status = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isDisplayed();
			
			System.out.println(Status); // true
			

			Status = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isEnabled();
			
			System.out.println(Status);  // true
			

		    Status = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isSelected();
			
			System.out.println(Status);  //false
			

	       driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
	       
	       Thread.sleep(2000);
			
	       Status = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isSelected();
			
		   System.out.println(Status);  //true
		   
		   
		   */
			
			
			
			
			
			
			
			
		/*	
			// Handling simple button or push button
			
			
            driver.manage().window().maximize();
			
			driver.get("https://www.gmail.com/");
			
			boolean status  = driver.findElement(By.id("identifierNext")).isDisplayed();
			
			System.out.println(status);
			
			status  = driver.findElement(By.id("identifierNext")).isEnabled();
				
			System.out.println(status);
			
			driver.findElement(By.id("identifierNext")).click();
			
			*/
			
			
			
			
			
			
			
			
		/*	
			
			
			// Handling Image, Image Button and Image Link
			

            driver.manage().window().maximize();
            
            driver.get("https://www.google.com/");
            
           // String imageName = driver.findElement(By.xpath("//*[@id=\"logo\"]")).getAttribute("alt");  //  here getAttribute("title") not work properly to get image title 
            
           // System.out.println(imageName);
            
            driver.navigate().to("https://gcreddy.com/project/login.php");
            
            driver.findElement(By.xpath("//*[@id=\"tdb1\"]/span[2]")).click();
            
            Thread.sleep(3000);
            
            driver.navigate().to("https://www.selenium.dev/about/");
            
            driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/a/img")).click();
            
            
            */
			
			
			
			
			
			
			
			
			
			
			
			/*
			 
			// Handling drop down box
			
			
			   driver.manage().window().maximize();
	            
	           driver.get("https://gcreddy.com/project/create_account.php");
	           
	          boolean status =  driver.findElement(By.name("country")).isDisplayed();
	          
	          System.out.println(status);  // true
	         
              status =  driver.findElement(By.name("country")).isEnabled();
	          
	          System.out.println(status);  // true
	          
	          
	  // In drop down box we have to expand and select an item, here we have to create select instance because there are multiple values
	  // dropdown is not a web element, here dropDown is a object of Select type
	         
	          
	          Select dropDown = new Select(driver.findElement(By.name("country")));  // dropDown is a object here, it is not element
	          
	          
	          //dropDown.selectByVisibleText("India");   // we also use selectByIndex for this, see below
	          
	          dropDown.selectByIndex(6);
	          
	 	 
	          // now here we create List Web element, for checking items count
	          
	          
	          List <WebElement>  x = dropDown.getOptions(); 
	          
	          System.out.println(x.size());     // here we got size of drop down
	          
	    */      
	 	      
	 	      
			
			
			
			
			
		/*	
			
			
			// From here lecture 29 started, Handling web table or HTML table , for code we have to see lecture 29 notes
			
			*/
			
			
			
			
			
			
			
			
			
			/*
			
			
			// Handling Frames, here we switch from top window to frame and operate element in 3rd frame
			
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			 
			
 // Here 3 frames in this page so we have to select third frame as per requirements , 2 ways to switch frame one is frame index and other is frame name
			 
			// driver.switchTo().frame(2);   // here we switch to 3rd frame by index
			 
			 driver.switchTo().frame("classFrame");  here we switch to 3rd frame by name
			 
			 driver.findElement(By.linkText("org.openqa.selenium")).click();
			 
			 */
			
			
			
			
		
			
			
			
		/*	
			
			
			// Here we switch from one frame to other frame, directly switch from one frame to other frame not allowed 
			//So we have to first come to top window and then switch from top window to other frame, here we use switch frame using index
			
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			 
		     driver.switchTo().frame(2);  // here we switch to 3rd frame by index
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.linkText("org.openqa.selenium")).click();  
			 
			 driver.switchTo().defaultContent();  // here we directly go to top window
			 
			 driver.switchTo().frame(0);   // here we switch to 1st frame by index
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
			 
			 driver.switchTo().defaultContent();
			 
			 driver.switchTo().frame(1);  // here we switch to 2nd frame by index
			 
			 Thread.sleep(4000);
			 
		     driver.findElement(By.linkText("CliCommand")).click();
		     
		     
		     */
			 
			 
			
			
			
			
		/*	
		
			// switch frame using frame name
			
			
			
			
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			 
		     driver.switchTo().frame("classFrame");  // here we switch to 3rd frame by frame name
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.linkText("org.openqa.selenium")).click();  
			 
			 driver.switchTo().defaultContent();  // here we directly go to top window
			 
			 driver.switchTo().frame("packageListFrame");   // here we switch to 1st frame by index
			 
			 Thread.sleep(4000);
			 
			 driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
			 
			 driver.switchTo().defaultContent();
			 
			 driver.switchTo().frame("packageFrame");  // here we switch to 2nd frame by index
			 
			 Thread.sleep(4000);
			 
		     driver.findElement(By.linkText("CliCommand")).click();  
		     		     
		     
			*/
			
			
			
			
			
			
			
			
			
			
			
			/*
			
			
			
			// Handling inline elements
			
			
			 driver.manage().window().maximize();
			  
			 driver.get("https://www.google.com/");
			 
			 Thread.sleep(3000);
			 
			 driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();		
			 
			 driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div > c-wiz > div > div > ul.LVal7b.u4RcUd > li:nth-child(4) > a > div.CgwTDb > span")).click();

			 
			 
			 // above line not working so we hace to to use xpath , cssSelector, etc for trouble sheet
			 
			 
			 
			 
			 */
			 		 
			
			
    
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	
	           
			
			
			
			
			
	 	      
	          
	          
	          
	          
	          
	         
			
			
			
			
			
			
            
            
            
           
			
			
			
			
			
			
			
			
			
			
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
       
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	    
		    
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
