package SDET_QA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {



		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  
		  // getWindowHandle()  :-  If there is one window then we use getWindowHandle() method and it return a string which is window id
		  // getWindowHandles()  :- If there are multiple browser window then we use getWindowHandles() method and it return a list of string means it return a id of multiple browser windows
		
		  

		  // Here we use getWindowHandle()
		  
		 // String windowID = driver.getWindowHandle();  // return a ID of single browser window / parent window
		  // System.out.println(windowID);
		  
		  
		  
		  
		  
		  
		  
		  // Now here we use getWindowHandles()
		  
		  driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();   // it opened the another browser window / child window
		  
		  Set<String> windowsIDs = driver.getWindowHandles();   // return ID's of multiple browser windows, here 2 windows , So here we got id of parent and child window
	
		  
		/*
		  // 1. First method to retrieve the window id - iterator() method
		  
		  Iterator<String> it = windowsIDs.iterator();   // iterator() returns a iterator objects of string
		  
		 String parentWindowID =  it.next();   // Here we got first window id / Parent window id
		 
		 String childWindowID =  it.next();   // Here we got second window id / child window id
		 
		 System.out.println("Parent Window ID :" +parentWindowID);
		 
		 System.out.println("Child Window ID : "+childWindowID);
		 
		 */
		  
		  
		  
		  
		  
		  
		
		  /* 
		 
		  // 2. Second method to retrieve window id :- List/ArrayList
		  
		  List<String> windowIDsList = new ArrayList(windowsIDs);   // Here we convert Set<String> into a List
		  
		 String parentwindowID  = windowIDsList.get(0);  // here we got parent window id / first window id
		 
		 String childwindowID  = windowIDsList.get(1);  // here we got child window id / second window id
		 
	     System.out.println("Parent Window ID :" +parentwindowID);
		 
		 System.out.println("Child Window ID : "+childwindowID);
		 
		 
		 
		 
		 
		 	 // How to use window ID's for switching between browser windows
		 
		 driver.switchTo().window(parentwindowID);                                  // switch to the parent window
		 System.out.println("Parent window title : "+driver.getTitle());             // got title of parent window
		  
		 
		 
		 driver.switchTo().window(childwindowID);                               // switch to the child window
		 System.out.println("Child window title : "+driver.getTitle());         // got title of child window
		 
		 
		 */
		 
		 
		 
		 
		 // switching between windows using for each loop, here we got all window id and print the title of both windows one by one
		  
		  List<String> windowIDsList = new ArrayList(windowsIDs);   // Here we convert Set<String> into a List
		
		  /*
		  
		  for(String winid : windowIDsList)    // windowIDsList contains the all window ID's that is parent and child window id
		 {
			 String title = driver.switchTo().window(winid).getTitle();      // here whatever window id we got and then we switch to particular browser window easily and get the title of that window browser easily
			 System.out.println(title);
		 }
		 
		 */
		 
		//  driver.quit();
		  
		  
		  
		  
		
		  
		  
		  
		  // how to close browser window by choice, here we compare title, here parent window is closed and child window is still present
		  
		  for(String winid : windowIDsList)    // windowIDsList contains the all window ID's that is parent and child window id
			 {
				 String title = driver.switchTo().window(winid).getTitle();      // here whatever window id we got and then we switch to particular browser window easily and get the title of that window browser easily
				 if(title.equals("OrangeHRM"))    // compare title of parent window so here only parent window is closed, child window is still present
				 {
					 driver.close();
					 
				 }
			 }	 
	}

}
