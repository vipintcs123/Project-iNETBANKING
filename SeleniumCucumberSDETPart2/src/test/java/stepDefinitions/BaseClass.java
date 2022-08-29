
package stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
	
    public  WebDriver driver;
	
	public LoginPage lp;
	
	public AddcustomerPage addCust;
	
	public SearchCustomerPage searchCust;
	
	 public static Logger logger;
	 
	 public Properties configProp;
	
	
	// below method is created for generating a random string for unique email id
	
	
	public static String randomestring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);   // this will create a random string of 5 characters
		return (generatedString1);
		
	}

}

