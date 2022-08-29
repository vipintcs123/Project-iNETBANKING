package SeleniumSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	
	@Test(invocationCount=10)
	public void some()           // If we want to execute this method  10 times then we use invocationCount=10
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
	System.out.println("Sum is == "+c);
		
	}
	
	

}
