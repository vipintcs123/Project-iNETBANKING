/**
 * 
 */
package com.mytest.naveenoops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;



/**
 * @author Vipin Shukla
 *
 */
public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "HubSpot Login");
		
	}
	
	
	

	@Test(priority=2)
	public void verifyLoginPageHeaderTest()
	{
		
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account");
		
	}
	
	
	
	
	@Test(priority=3)
	public void doLoginTest()
	 
	{
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("vipinshukla714@gmail.com","Lawyer123@@");
		String headerHome = homepage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "User Guide");	
		
	}
	
	
	

}
