package SeleniumSessions;

import org.testng.annotations.Test;

public class TestNGFeatures {

	
	@Test
	public void loginTest()
	{
		
		System.out.println("Login test");
		
	}
	
	
	
	@Test(dependsOnMethods="loginTest")     // This home page test depends upon login test, if login test case failed then home page test will be ignored/skipped
	public void HomePageTest()
	{
		
		System.out.println("Home Page test");
		
	}
	
	
	
	@Test(dependsOnMethods="loginTest")  // This search  page test depends upon login test, if login test case failed then search page test will be ignored/skipped
	public void SearchPageTest()
	{
		
		System.out.println("Search test");
		
	}
	
	
	
	@Test(dependsOnMethods="loginTest")  // This search  page test depends upon login test, if login test case failed then search page test will be ignored/skipped
	public void RegistrationPageTest()
	{
		
		System.out.println("Reg test");
		
	}
	
		
}
