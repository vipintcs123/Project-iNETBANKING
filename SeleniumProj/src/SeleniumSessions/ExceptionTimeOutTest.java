package SeleniumSessions;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	/*@Test(invocationTimeOut=2, expectedExceptions=NumberFormatException.class)
	public void infiniteLoopTest()           // here we give maximum time to test case is 2 second, within 2 second it will be executed otherwise it will be terminated
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);            // This loop executed infinite time
			
		}
		
	}
	
	
	*/
	
	
	@Test(expectedExceptions=NumberFormatException.class) 
	public void test1()
	{
		String x = "100A";        // here we expect a number format expection
		Integer.parseInt(x);
		
	}
	
	

}
