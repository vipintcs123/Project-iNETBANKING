package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {


      // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
				
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait
		
		driver.get(" https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
				
		driver.findElement(By.name("firstname")).sendKeys("Vipin");
		
		driver.findElement(By.name("lastname")).sendKeys("Shukla");
		
		driver.findElement(By.name("Email")).sendKeys("vipinshukla711@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Lawyer1%2#&");
		

	  
	 
		WebElement registerBtn = driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]"));  // for register button
		
 // After calling below method register button is highlighted, After calling this method register button is highlighted, 
		            // flash is a static method so we call directly without creating an object 
		
		
	   flash(registerBtn,driver); 
		
		
		 //After calling below method border will be drawn around an Register button element, 
		//  below we call a drawBorder method to draw a border on register button
		
		
		drawBorder(registerBtn,driver); 
		
		
		// Take screenshot and store as a file format
		
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				 
		 // Now copy the screenshot to desired location using copyFile method
				 
		 FileUtils.copyFile(src, new File("C:\\Users\\Vipin Shukla\\eclipse-workspace\\SeleniumProj\\src\\SeleniumSessions/element.png"));
		 
		 
		 
		 
		 // To generate a javascript alert, if there is any bug/error during execution in form of alert or if we want to display any important method
		 // now we call a generateAlert() method to generate a alert regarding any bug or regarding important information
		 
		 // Here in below method, we pass a message and that message show me in form of alert
		 
		 
		// generateAlert(driver,"There is an issue with Login Button");  // we got that alert in the UI
		 
		 
		 
		 
		 // Here we call method clickEelementByJS,  for clicking button using javascriptexecutor
		 
		 // here we click on any element using javascriptexecutor, here we also pass element where we want to click
		 
		 
	    clickElementByJS(registerBtn, driver);
		 
		 
		 driver.navigate().refresh();    // refresh browser using selenium
		 
		 
		 // Below we are going to call a method for refresh the browser using javascriptexecutor
		 
		 
		 refreshBrowserByJS(driver);
		 
		 
		 
		 // We are going to call a getTitleByJS method for getting a title of a page using javascript executor
		 
		 
		 System.out.println(getTitleByJS(driver));
		 
		 
		 
		 // Here we call a method name getPageInnerText for getting a entire text of a page
		 
		 System.out.println(getPageInnerText(driver));
		 
		 
		 
		 // Here we call a method scrollPageDown for scrolling down using javascript executor
		 
		 scrollPageDown(driver);
		 
		 
		 
		 // Here we call a scrollIntoView method, here we scroll down till my desired element not come, so that desired element we pass here
		 
		 WebElement AdChoicelink = driver.findElement(By.linkText("AdChoice"));
		 
		 scrollIntoView(AdChoicelink, driver);
		 
		 
		 
		
	}

	
	
	
	
	
	   // executescript used to execute javascript code

	  // here to highlight a button we use JavaScriptexecutor method, Here we make a method named flash and changeColor method myself see below :-
	
	
	public static void flash(WebElement element, WebDriver driver)
	{
		// Here we cast/convert driver into a JavascriptExecutor, We store JavascriptExecutor object into js instance variable
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);  
		
		
		String bgcolor = element.getCssValue("backgroundColor");   // here we got a color of button from a web page. getCss will give background color of any element
		
		
		for(int i=0; i < 10; i++)       // here element flashes/highlighted 10 times so we use for loop 10 times, So Register button highlighted 10 times with green color
		{
		
			// flashing advantage is that we get to know at the time execution control is available to which element
			changeColor("rgb(0,200,0)", element, driver);  // This line for making a color red during flashing
			
			
			changeColor(bgcolor, element, driver);   // This line will change color of button as previous color
			
			
			// So we use colorchange method 2 times because first when colorchange method run then green after again calling it come as purple so we get flashing
			// - green-purple format again and again. So End user get that element is getting higlighted/flashed.
			
		}
		
		
	}
	
	
	
	
	 public static void changeColor(String color, WebElement element, WebDriver driver)
	
	 {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);   // Here we cast/convert driver into a JavascriptExecutor
		 
		 js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);  // executeScript method is used to execute Javascript code
		 
		 try {
			 
			 Thread.sleep(20);
		 }
		 catch(InterruptedException e) {
			 
			 
			 
		 }
		 
	 }
	 
	 
	 
	   // Suppose if there is some issue in any element then we capture make boreder around that element and take a screenshot of that element, see below
	 
	 // Here we write a method for making a border around an element and capturing a screenshot of that element, see below :-
	  
	 public static void drawBorder(WebElement element, WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);   // Here we cast/convert driver into a JavascriptExecutor
		 js.executeScript("arguments[0].style.border = '3px solid red'", element);
		 
	 }
	 
	 
	           
	 
	 
	 // Here we make a method during execution if there is any bug or we want to show any important information infront of manager then -
	 // we show these bugs or important information in the form of alert, here one alert is generate
	 
	 
	 public static void generateAlert(WebDriver driver, String message)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);   // Here we cast/convert driver into a JavascriptExecutor
		 js.executeScript("alert('"+message+"')");   // during calling we pass a message and we got that message in form of alert
		 
	 }
	 
	 
	 
	 
	 	 // Here we make a method clickElementByJS for clicking on button using javascript
	 
	 public static void clickElementByJS(WebElement element, WebDriver driver)
	 {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
		 js.executeScript("arguments[0].click();", element);  // This element we pass above, on that element we want to click.
		 
	 }
	 
	 
	 
	 
	 
	 // For refreshing the browser using JavaScriptExecutor
	 
	  public static void refreshBrowserByJS(WebDriver driver)
	  {
		  JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
		  js.executeScript("history.go(0)");   // here 0 means first history, it refreshes the browser
		  
	  }
	 
	 
	  
	  
	  // get a page title using javascript executor, here we make getTitleByJS method, this method return a title in string format
	  
	  public static String getTitleByJS(WebDriver driver)
	  {
			 JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
			 String title = js.executeScript("return document.title;").toString();
			 return title;
		  
	  }
	 
	 
	  
	  
	// Here we create a method name getPageInnerText() for getting a entire text of a page. There is no predefined method in selenium for getting a entire text
	 
	 // This method return a string
	  
	  
	  
	  public static String getPageInnerText(WebDriver driver)
	  {
		  JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
		  String pageText =  js.executeScript("return document.documentElement.innerText;").toString();
		  return pageText;     // This method also return a string
	  }
	  
	 
	 
	 
	 // Now we are going to create a method name scrollPageDown  for scrolling down using javascriptexecutor
	  
	  
	  public static void scrollPageDown(WebDriver driver)
	  {
		  JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
		  
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  }
	  
	 
	  
	  
	  
	  // Here we make a method scrollIntoView, suppose if we want that scroll down till my desired link is not come , like fb scroll doen till post not come as we want
	  
	  
	  public static void scrollIntoView(WebElement element, WebDriver driver) {
		  
		  JavascriptExecutor js = ((JavascriptExecutor) driver);     // Here we cast/convert driver into a JavascriptExecutor
		  js.executeScript("arguments[0].scrollIntoView(true);", element) ; 
		  
  // Above line means scroll till element not visible as we want. we give that element as above during calling this method
		  
	  }
	

}
