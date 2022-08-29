package SDET_QA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLink {

	public static void main(String[] args) throws IOException {


		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
   	      driver.get("http://www.deadlinkcity.com/");
   	      
   	      
   	      // First we capture all the links present in a web page and then we will filter the broken links and non broken links
   	      
   	      List<WebElement> links = driver.findElements(By.tagName("a"));   // here we got all the links(broken or non broken links)
   	      
   	      int brokenLinks=0;
   	      
   	      
   	      for(WebElement element : links)
   	      {
   	    	  
   	    	  String url = element.getAttribute("href");   // here we got href attribute value
   	    	  
   	    // now we have to send that url through browser, once it hits the server , we get the some response, if response > 400 then that is broken link
   	    	  
   	    	  if(url==null || url.isEmpty())
   	    		  
   	    	  {
   	    		  
   	    		System.out.println("URL is empty");   
   	    		continue;
   	    		 
   	    	  }
   	    	  
   	    	  
   	    	 // now we send this url request using HttpURLConnection
   	    	  
   	    	  URL link = new URL(url);         // here url comes is in string format so we convert it in url/link format using URL class
   	    	  
   	    	  HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();   // here we establish a connection using link
   	    	  
   	        	httpconn.connect();   // connect the url to a server or sends the url to a server 
   	        	
   	        	if(httpconn.getResponseCode() >= 400)
   	        	{
   	        		
   	        		System.out.println(httpconn.getResponseCode()+url+ " is "+"Broken link");
   	        		brokenLinks++;
   	        		
   	        	}
   	        	
   	        		
   	        	else
   	        	{
   	        		
   	        		System.out.println(httpconn.getResponseCode()+url + " is "+"Valid/Normal link");
   	        		
   	        	}  	    	  
   	      }
   	      
   	     
   	      System.out.println("Total No of broken links :"+ brokenLinks);
   	      driver.quit();
   	      
   	      
   	      
   	}
	
	

}
