package SeleniumSessions;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	// Output
	
	// @BeforeSuite-setup system property for chrome -- Priority 1
	// @BeforeTest-launch the browser  -- Priority 2
	// @BeforeClass-login to app -- Priority 3
	
	
	// @BeforeMethod-enter URL -- Priority 4
	// @Test--Google Title Test
	// @AfterMethod-logout from app
	
	// @BeforeMethod-enter URL
	// @Test--google logo test
	// @AfterMethod-logout from app
	
	// @BeforeMethod-enter URL
	// @Test--Search Test
	// @AfterMethod-logout from app
	
	// @AfterClass-close Browser
	// @AfterTest-delete all cookies
	

	
	
	
	
	// pre conditions annotation  --- starting with @Before annotation
	
	@BeforeSuite  // 1
	public void setup()
	{
		
		System.out.println("@BeforeSuite-setup system property for chrome");
		
	}
	
	
	
	@BeforeTest  // 2
	public void launchBrowser()
	{
		
	System.out.println("@BeforeTest-launch the browser");
		
	}
	
	
	

	@BeforeClass   // 3
	public void login()
	{

		System.out.println("@BeforeClass-login to app");

	}
	
	
	
	
	
	@BeforeMethod  // 4
	public void enterURL()
	{
		
		System.out.println("@BeforeMethod-enter URL");
		
	}
	
	

	
	
	
	
	
	
	
	
	// test case --- starting with @Test
	
	
	@Test  // 5
	public void googleTitleTest()
	{
		System.out.println("@Test--Google Title Test");           
		
	}
	
	

	@Test
	public void searchTest()
	{
		
		System.out.println("@Test--Search Test");  
		
		
	}

	
	
	@Test
	public void googlelogoTest()
	{
		
		System.out.println("@Test--google logo test");  
		
		
	}
	
	
	
	
	
	
	
	// post conditions -- starting with @After annotation
	
	
	@AfterMethod  // 6
	public void logOut()
	{
		System.out.println("@AfterMethod-logout from app");
		
	}
	
	
	
	@AfterTest()  //8
	public void deletAllCookies()
	{
		System.out.println("@AfterTest-delete all cookies");
		
	}
	
	
	@AfterClass() // 7
	public void closeBrowser()
	{
		System.out.println("@AfterClass-close Browser");
		
	}
	
	
	
	
	
	
	
}
