package comcrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest()
	{
		
		super();   // here it call TestBase class constructor or parent class constructor so that my property will be initialized
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		
		
	}
	
	
	
	@Test(priority=1)   // Test Case 1
	public void loginPageTitleTest()
	{
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	
	
	
	
	
	@Test(priority=2)   // Test Case 2
	public void crmsubscribeLogoImageTest() throws InterruptedException
	{
		
	 boolean flag = loginPage.validateCRMImage();
	 Assert.assertTrue(flag);
	}
	
	
	
	
	
	
	
	
	@Test(priority=3)  // Test Case 3
	public void loginTest() throws InterruptedException
	{
		
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  // login method return HomePage class object so we take it in homePage reference
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
		
	}

}
