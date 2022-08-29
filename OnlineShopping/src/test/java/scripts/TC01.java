package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import commands.ActionDriver;
import config.StartBrowser;
import or.LoginPage;

public class TC01 extends StartBrowser {
	
  @Test
  public void testLogin() throws IOException {
	  
	  ActionDriver aDriver = new ActionDriver();
	
	  StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Application");
		
	  aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
	  aDriver.type(LoginPage.txtUserName, "admin","UserName");
	  aDriver.type(LoginPage.txtPassword, "admin@123","Password");
	  aDriver.click(LoginPage.btnLogin,"LoginButton");
	  
	  
	  
	  /*  
	  aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
      aDriver.type(LoginPage.txtUserName, "admin");
	  aDriver.type(LoginPage.txtPassword, "admin@123");
	  aDriver.click(LoginPage.btnLogin);
	  
	  */
	  
	  
	  
	  
  }
}


// when we run this test case then it go to StartBrowser in a method beforeClass() and then it launch my browser and then it come back to test case and execute 
 //whole test case command and again it go StartBrowser in a method afterclass() and quit the browser, for this we have to extend start browser