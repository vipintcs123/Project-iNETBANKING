package listener_sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test
	void loginByEmail()
	{
		System.out.println("Login By Email");
		Assert.assertEquals("pavan", "pavan");  // true
		
	}
	
	
	@Test
	void loginByFacebook()
	{
		System.out.println("Login By Email");
		Assert.assertEquals("pavan", "kumar");  // false
		
	}


}
