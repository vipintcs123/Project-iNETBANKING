package Ecommerce.OnlineShopping;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AdminSmoke {
 
	WebDriver driver;
	
  @BeforeMethod
  public void launchBrowser() {
	  
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");  // instansiate chrome browser driver

        driver = new ChromeDriver();    // here we create a chrome browser driver in selenium web driver interface, it launches chrme driver with blank url
		
		driver.manage().window().maximize();     // maximize the browser window 
		
  }

  @AfterMethod
  public void closeBrowser() {
	  
	  driver.close();
  }
  
  
  
  @SuppressWarnings("deprecation")
@Test(priority=1)
  public void launchApplication() {
	  
	  driver.get("http://gcreddy.com/project/admin/login.php"); 
	  
	  String pageTitle = driver.getTitle();
	  
	  Assert.assertEquals(pageTitle, "osCommerce Online Merchant Administration Tool");
  }
  
  
  
    @SuppressWarnings("deprecation")
	@Test(priority=4)
    public void adminLogin()
    {
    	driver.get("http://gcreddy.com/project/admin/login.php");
    	driver.findElement(By.name("username")).sendKeys("admin");
    	driver.findElement(By.name("password")).sendKeys("admin@1234");
    	driver.findElement(By.id("tdb1")).click();
    	Assert.assertEquals(driver.getCurrentUrl(), "http://gcreddy.com/project/admin/index.php");
     	
    }
    
    
    
  
  
  
  
       
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
     @SuppressWarnings("deprecation")
	@Test(priority=2)
     public void verifyElements() {
    	 
    	 driver.get("http://gcreddy.com/project/admin/login.php");
    	 
    	 boolean displayStatus = driver.findElement(By.name("username")).isDisplayed();
    	 
    	 Assert.assertEquals(displayStatus, true);
    	 
    	 Assert.assertEquals(driver.findElement(By.name("password")).isDisplayed(), true);
    	 
    	 Assert.assertEquals(driver.findElement(By.id("tdb1")).isDisplayed(), true);
    	 
     }
     
     
     
     @SuppressWarnings("deprecation")
	@Test(priority=3)
     public void redirectfromAdmintoUser() throws InterruptedException
     {
    	 driver.get("http://gcreddy.com/project/admin/login.php");
    	 
    	 driver.findElement(By.linkText("Online Catalog")).click();
    	 
    	 Thread.sleep(3000);
    	 
    	 String url = driver.getCurrentUrl();
    	 
    	 Assert.assertEquals(url, "http://gcreddy.com/project/");
    	 
     }
     
     
       
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}
