

package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class Steps extends BaseClass {
	
	@Before                        // this method will execute once before the scenario
	public void setup() throws IOException
	{
		

		// Logger configuration
		
	    logger = Logger.getLogger("nopCommerce");   // Added logger
		
		PropertyConfigurator.configure("log4j.properties");    // specify where my log4j.properties file available
		
		
		
		// Reading a config.properties file
		
		configProp = new Properties();
		FileInputStream configPropFile = new FileInputStream("config.properties");   // opening a file in input mode
		configProp.load(configPropFile);    //  loading a file using configProp
	
        
            String br  = configProp.getProperty("browser");     // getting a browser value  from config.properties file
         
        		//Launching browser
        
           		if (br.equals("firefox")) {
        			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));  // here firefox path value come from a config.properties file
        			driver = new FirefoxDriver();
        		}

        		
        		
        		else if (br.equals("chrome")) {
        			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath")); // here  chrome path value come from a config.properties file
        			driver = new ChromeDriver();
        		}
        		
        		
        		
        		else if (br.equals("edge")) {
        			System.setProperty("webdriver.edge.driver",configProp.getProperty("edgepath")); // here edge path value come from a config.properties file
        			driver = new EdgeDriver();
        		}
        
        
           logger.info("*********Launching browser ************");
           driver.manage().window().maximize();
        
	}
	
	
	
	
	
	
	
	// Login feature step-definitions
	

	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
        
		lp = new LoginPage(driver);
		
		
	}


	
	
	

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		
	    logger.info("*********Opening URL ************");
		driver.get(url);

	}

	
	
	
	
	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pwd) {
		
	    logger.info("*********Providing login details************");
        lp.setUserName(email);
        lp.setPassword(pwd);
		
	}
	
	
	
	
	

	@When("Click on Login")
	public void click_on_Login() {
		
		
	    logger.info("*********Started Login************");
		lp.clickLogin();


	}

	
	
	
	
	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful. "))
		{
			driver.close();
			
		    logger.info("*********Login Passed ************");
			Assert.assertTrue(false);  // here we make a test method failure
			
		}
		
		else
		{
		    logger.info("*********Login Filed ************");
			Assert.assertEquals(title, driver.getTitle());     // here title value come from a feature file
			
			
		}


	}
	
	
	
	
	

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		
	    logger.info("*********Click on logout link************");
		lp.clickLogout();
		Thread.sleep(3000);

	}

	
	
	
	
	@Then("close browser")
	public void close_browser() {

	    logger.info("*********closing browser ************");
		 driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 // Customers feature step-definitions.................
	
	
	
	
	
	@Then("User can view Dashboad")
	public void user_can_view_Dashboad() throws InterruptedException {

		addCust= new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
		Thread.sleep(4000);
	}
	
	

	

	@When("User click on customers Menu")
	public void user_click_on_customers_Menu() throws InterruptedException {

		Thread.sleep(3000);
		addCust.clickOnCustomersMenu();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}

	
	
	
	@When("click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws InterruptedException {
		
        Thread.sleep(2000);
		addCust.clickOnCustomersMenu();

		
	}
	
	
	

	@When("click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException{

		addCust.clickOnAddnew();
		Thread.sleep(2000);
	}

	
	
	
	
	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() {

		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
		
	}

	
	
	
	// below method is for adding a customer info
	
	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		
	    logger.info("*********Adding new customer ************");
	    logger.info("*********providing customer details ************");

		String email =  randomestring() + "@gmail.com";                           // here we call a radnomestring method for generating a random email id 
		
		addCust.setEmail(email);                                    // now we pass this email value to a email text box
		addCust.setPassword("test123");
		// Registered - default
		// The customer cannot be in both 'Guests' and 'Registered' customer roles
		// Add the customer to 'Guests' or 'Registered' customer role
		addCust.setCustomerRoles("Guest");
		Thread.sleep(3000);

		addCust.setManagerOfVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Pavan");
		addCust.setLastName("Kumar");
		addCust.setDob("7/05/1985"); // Format: D/MM/YYY
		addCust.setCompanyName("busyQA");
		addCust.setAdminContent("This is for testing.........");
				

		
	}

	
	
	
	@When("click on Save button")
	public void click_on_Save_button() throws InterruptedException {
		
		

	  logger.info("*********Saving a customer data************");
       addCust.clickOnSave();
       Thread.sleep(2000);
		
	}

	
	
	
	
	// below method is verifying that confirmation message is correct or not
	
	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {         // This msg value come from a Customer feature file as a parameter
		

		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().   
		contains("The new customer has been added successfully"));		
	}


	
	
	
	
	
	
	
	//  Steps for searching a customer using email id....................
	
	
	
	
	
	

	@When("Enter customer EMail")
	public void enter_customer_EMail() {
		
		logger.info("*********searching a customer by email id************");
		searchCust = new SearchCustomerPage(driver);
		searchCust.setEmail("victoria_victora@nopCommerce.com");   // to set email in textbox


	}






	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		
		searchCust.clickSearch();
		Thread.sleep(3000);


	}







	@Then("User should found Email in the Search table")
	public void user_should_found_Email_in_the_Search_table() {
			
         boolean status = searchCust.searchCustomerByEmail("victoria_victora@nopCommerce.com");   // to search that email is present in table or not
         Assert.assertEquals(true, status);
	
	}

		
		
	
	
	//steps for searching a customer by first name and last name
	
	
	
	
	@When("Enter customer FirstName")
	public void enter_customer_FirstName() {
		
		logger.info("*********searching a customer by name************");
		searchCust = new SearchCustomerPage(driver);
		searchCust.setFirstName("Victoria");
		
	}

	
	
	
	
	
	@When("Enter customer LastName")
	public void enter_customer_LastName() {

          searchCust.setLastName("Terces");
		
	}
	
	
	

	@Then("User should found Name in the Search table")
	public void user_should_found_Name_in_the_Search_table() {


		boolean status = searchCust.searchCustomerByName("Victoria Terces");
		Assert.assertEquals(true, status);
		
	}	
	
}


