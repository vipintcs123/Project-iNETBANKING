package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;


public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//span[@class='user-display']")	
	WebElement userNameLabel;
	
	
	@FindBy(xpath="//a//span[contains(text(),'Contacts')]")	
	WebElement contactsLink;
	
	@FindBy(xpath="//div[@class='menu-item-wrapper']//button[@class='ui mini basic icon button']//i[@aria-hidden='true']")	
	WebElement newcontactLink;
	
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;

	
	// Now we make constructor for initializing a web elements/page objects
	
	public HomePage()
	{
		
	  PageFactory.initElements(driver, this);  // here we initialize the page objects/page objects	
		
	}
	
	
	
	//Now we defined action methods of HomePage
	
	public String verifyHomePageTitle()
	{
		
		return driver.getTitle();	
	}
	
	
	public boolean verifyCorrectUserName()
	{
		
		return userNameLabel.isDisplayed();
	}
	
	
	
	
   public ContactsPage clickOnContactsLink()
   {
	   contactsLink.click();   // After click on contact link it goes/landing to contacts page so after clicking next landing page is contacts page 
	   return new ContactsPage();  // so after clicking on contacts link this method return contacts page object so we change the return type
	   
   }
   
   
   
   
   public DealsPage clickOnDealsLink()
   {
	   dealsLink.click();  //  // After click on deals link it goes/landing to deals page so after clicking next landing page is deals page 
	   return new DealsPage();    // so after clicking on deals link this method return deals page object so we change the return type	   
   }
   
   
   
   
   public TaskPage clickTaskLink()
   {
	   taskLink.click();  //  // After click on task link it goes/landing to task page so after clicking next landing page is task page 
	   return new TaskPage();    // so after clicking on task link this method return task page object so we change the return type
	      
   }
   
   
   public void clickonNewContactLink()
   {
	   Actions action = new Actions(driver);
	   action.moveToElement(contactsLink).build().perform();
	   newcontactLink.click();
	   
   }
   
   
   
   
   
   
 

	 	
	
	
}
