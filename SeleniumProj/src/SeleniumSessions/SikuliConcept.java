package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


// This code not work properly due to sikuli jar file issue


public class SikuliConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FindFailed {


		   System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
			
			driver.manage().window().maximize();    // maximize the browser window
			
			driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait/global wait and it wait for every element ina webpage
	
			driver.get("https://www.youtube.com/watch?v=qvE2miLMbNk");  // enter url
			
			
			// Now we create a object of Screen class coming from a Sikuli
			
			  Screen s = new Screen();
			
			  
			  // for clicking on  setting icon
			  
			    Pattern setingsImg = new Pattern("capture_setting.PNG");
			    s.wait(setingsImg,2000);
			    s.click();
			    s.click();
			    
			    
			    
			    // for clicking on Auto button/Img
			    
			    
				  
			    Pattern AutoImg = new Pattern("capture_auto.PNG");
			    s.wait(AutoImg,2000);
			    s.click();
			    s.click();
			    
			    
			    
			    // for clicking on 144p image/button
			    	  
			    Pattern Img144p = new Pattern("capture_144p.PNG");
			    s.wait(Img144p,2000);
			    s.click();
			    s.click();
			    
			    
			    
			    
			    
			    
			
			
			// For pause a icon in You tube video
			
			// now we create a Pattern class object
			
			Pattern pauseImg = new Pattern("capture_pause.PNG");  // here we defined pattern for a specific image
			
			s.wait(pauseImg,2000);    //wait for a particular element/image to be visible, here we wait for 2 seconds
			
			s.click();   // Now we click on a pause button in youtube video
			
		    s.click();  // sometimes we have to click 2 times in a youtube video
		    
		    
		    
		    
		    // For play icon 
		    
		    Pattern playImg = new Pattern("capture_play.PNG");
		    s.wait(playImg,2000);
		    s.click();
		    s.click();
		    
		    
		    
		    
	}
	

}
