package reuse;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import commands.ActionDriver;
import config.StartBrowser;
import or.HomePage;
import or.LoginPage;

public class BusinessFunctions {
	
	WebDriver driver;
	
	ActionDriver aDriver = new ActionDriver();
	
	
	public BusinessFunctions()
	{
		
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}


	
	public void login() throws IOException
	{
		  StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to Application");
		
		  aDriver.navigateToApplication("http://gcreddy.com/project/admin/login.php");
		  aDriver.type(LoginPage.txtUserName, "admin","UserName");
		  aDriver.type(LoginPage.txtPassword, "admin@123","Password");
		  aDriver.click(LoginPage.btnLogin,"LoginButton");
	}
	
	
	
	

	public void RedirectToUserInterface() throws IOException
	{
		 StartBrowser.childTest = StartBrowser.parentTest.createNode("Redirect To User Interface from Admin Interface");
		
		 aDriver.click(HomePage.lnktxt,"Online Catalog Link in Admin Interface");
	}
	
	
	
	
}

