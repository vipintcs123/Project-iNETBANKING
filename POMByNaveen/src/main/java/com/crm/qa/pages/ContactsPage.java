package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	
	@FindBy(name="first_name")
	WebElement firstName;
	
	

	@FindBy(name="last_name")
	WebElement lastName;
	
	
	@FindBy(name="description")
	WebElement description;
	
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	
	
	public ContactsPage()
	{
		
      PageFactory.initElements(driver, this);   // initialize the page objects
		
	}

	
	
	public boolean verifyContactsLabel()
	{
		
		return contactsLabel.isDisplayed();
	}
	
	
	
	public void selectContactsByName(String name) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//preceding-sibling::td//input[@name='id']")).click();
		
	}
	 
	
	
	public void createNewContact(String ftName, String ltName, String desc)
	{
	
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		description.sendKeys(desc);
		saveBtn.click();
		
		 
		
	}
	
	
	
}
