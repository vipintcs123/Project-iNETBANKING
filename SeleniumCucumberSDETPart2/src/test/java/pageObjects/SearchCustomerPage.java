package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {
	
	public WebDriver ldriver;
	
	WaitHelper waithelper;
	
	
	
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new WaitHelper(ldriver);
		
	}

	
	
	// identification of element
	
	
	@FindBy(how = How.ID, using = "SearchEmail")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "SearchFirstName")
	@CacheLookup
	WebElement txtFirstName;

	@FindBy(how = How.ID, using = "SearchLastName")
	@CacheLookup
	WebElement txtLastName;

	@FindBy(how = How.ID, using = "search-customers")
	@CacheLookup
	WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//table[@role='grid']")
	@CacheLookup
	WebElement tblSearchResults;

	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']")
	WebElement table;

	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;

	@FindBy(how = How.XPATH, using = "//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tableColumns;
	
	
	
	// Defined a action method for every element
	
	
	
	public void setEmail(String email)
	{
		waithelper.WaitForElement(txtEmail,30);   // this command will wait upto maximum 30 seconds until element should be visible
		txtEmail.clear();
		txtEmail.sendKeys(email);
			
	}
	
	
	
	
	public void setFirstName(String fname) {   
		
		waithelper.WaitForElement(txtFirstName,30);      // this command will wait upto maximum 30 seconds until element should be visible
		txtFirstName.clear();
		txtFirstName.sendKeys(fname);   
	}

	
	
	
	public void setLastName(String lname) {
		
		waithelper.WaitForElement(txtLastName,30);      // this command will wait upto maximum 30 seconds until element should be visible
		txtLastName.clear();
		txtLastName.sendKeys(lname);
	}

	
	
	
	public void clickSearch() {
		btnSearch.click();

	}

	
	
	
	public int getNoOfRows() {          // gives all the rows in a table
		return (tableRows.size());
	}

	
	
	
	
	public int getNoOfColumns() {             // gives all the columns in a column
		return (tableColumns.size());
	}
	
	
	
	
	
	

	public boolean searchCustomerByEmail(String email) {            // here we get a mail passed by a user from a test case
		boolean flag = false;

		for (int i = 1; i <= getNoOfRows(); i++) {
			String emailid = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[2]"))
					.getText();

					
			
			System.out.println(emailid);

			if (emailid.equals(email)) {
				flag = true;
				break;
			}
		}

		return flag;

	}
	
	
	
	
	
	
	
	

	public boolean searchCustomerByName(String Name) {          // here we get first name and last name passed by user from a test case
		
		boolean flag = false;

		for (int i = 1; i <= getNoOfRows(); i++) {
			String name = table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[3]"))
					.getText();          // here in name , there is first name and last name is coming so we split

			
			// here below we separating a first name and last name
			
			String names[] = name.split(" ");    // here we split first name and last name on the basis of space, now it become 2 strings 
			
			// now in names there are 2 strings, one is first name and second one is last name
			
			if (names[0].equals("Victoria") && names[1].equals("Terces")) {   // here we compare first name and last name from a table 
				flag = true;
				break;
			}
		}

		return flag;

	}	

}
