package scripts;

import java.io.IOException;

import org.testng.annotations.Test;
import config.StartBrowser;
import reuse.BusinessFunctions;

public class TC02 extends StartBrowser {
	
	
  @Test
  public void testLogin_Redirect() throws IOException {
	  
	  
	  BusinessFunctions bFunctions = new BusinessFunctions();
	  bFunctions.login();
	  bFunctions.RedirectToUserInterface();
	  
  }
}
