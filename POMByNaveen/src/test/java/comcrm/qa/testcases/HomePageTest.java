package comcrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;



public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest()
	{
		
		super();  // here base class constructor is called and my property will be initialized
	}
	
	
	// here  we want to go to home page so for this we have to login first then we go to home page

	@BeforeMethod
	public void setUp() throws InterruptedException    // when this method run then it call initialization method of TestBase class and my driver will be initialized and chrome will be launched
	                        // and then maximize the window and url is launched
	{
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  // login method return homepage class object so we take it in homepage reference
		
		
	}
	

	/*
	
	@Test(priority=1)   // Test Case 1
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM" ,"Home page title not matched");  // 3rd parameter display in report if assertion/test case is failed	
	}
	
	
	
	
	
	
	 @Test(priority=2)   // Test Case 2
	 public void verifyUserNameTest()
	 {

		 Assert.assertTrue(homePage.verifyCorrectUserName());
		 
	 }
	
	 */
	
	 @Test  //(priority=3)    // Test Case 3
	 public void verifyContactsLinkTest()
	 {
	
		 contactsPage = homePage.clickOnContactsLink();  // clickOnContacstLink returns a contacts Page object so we take it in contactsPage reference
		 
	 }
	 
	 
	 
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
}
