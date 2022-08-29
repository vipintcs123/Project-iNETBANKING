package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions

        (
	
      // If we want to run all feature files then features = ".//Features/"
        		  
     		  
       // if we want run two feature file then we add all feature file and separated by commas like see below :-
       //  features = {".//Features/Login.feature","Features/Customers.feature" }  	
        		
        		
		 features = ".//Features/Customers.feature",    // for feature file path, where my feature file is present
		 glue = "stepDefinitions",                  //  where steps are implemented for that we give a package name where steps are implemented
		 dryRun = false,                             // to check that every feature file step contains corresponding step-definition or not 
		 monochrome = true,                         // used to remove unnecessary character from a console window
		 plugin = {"pretty", "html:test-output"}     // pretty is used to give output in the console window very clearly  and html: test-output used to generate a report  
		 
	// 	 tags = {"@sanity"}     // here it run only sanity scenario from a feature file  
		 
  //   tags = {"@sanity,regression"}     // here it runs sanity and  regression scenario both from a feature file
		           			 	
		)






public class TestRun {

}

