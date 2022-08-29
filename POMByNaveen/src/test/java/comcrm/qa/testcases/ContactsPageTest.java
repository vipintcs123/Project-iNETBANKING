package comcrm.qa.testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;


public class ContactsPageTest extends TestBase {
		
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	String sheetName = "contacts";
	
	
	public ContactsPageTest()
	{
		
		super();   // here it call TestBase class constructor or parent class constructor so that my property will be initialized
	}
	
	
	
	
	
	// here  we want to go to home page so for this we have to login first then we go to home page and then go to contacts page

		@BeforeMethod
		public void setUp() throws InterruptedException    // when this method run then it call initialization method of TestBase class and my driver will be initialized and chrome will be launched
		                                                  // and then maximize the window and url is launched
		{
			initialization();
			contactsPage = new ContactsPage();
			loginPage = new LoginPage();
		    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  // login method return homepage class object so we take it in homepage reference
			contactsPage = homePage.clickOnContactsLink();
		    
			
		}
	
		
		
		
		
		
		
	
		@Test(priority=1)
		public void verifyContactsPageLabelTest()
		{
			Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contact label is missing on the contact page");
			
		}
		
		
	
		@Test(priority=2)
		public void selectSingleContactsTest() throws InterruptedException
		{
			Thread.sleep(4000);
			contactsPage.selectContactsByName("ravi k kmm");   // used to click on ravi k kmm checkbox in contacts page
			
		}
		
		
		@Test(priority=3)
		public void selectMultipleContactsTest() throws InterruptedException
		{
			Thread.sleep(4000);
			contactsPage.selectContactsByName("Mahi Shyam");   // used to click on Mahi Shyam checkbox in contacts page
			
		}
		
		
	
		@DataProvider       // used to provide test data to a test case and return a 2d array So DataProvider used to fetch the data from a excel sheet
		public Object[][] getCRMTestData() throws InvalidFormatException
		{
			
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
			
		}
		
		
		
		@Test(priority=4, dataProvider="getCRMTestData")
		public void validateCreateNewContact(String firstName, String lastName, String desc)
		{
			
			homePage.clickonNewContactLink();
			contactsPage.createNewContact(firstName, lastName, desc);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			
		}

}
