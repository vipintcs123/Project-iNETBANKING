package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		      features = "C://Users//Vipin Shukla//eclipse-workspace//SeleniumCucumber_SDET//Features//OrangeHRM.feature",   // here we defined a path of feature file
		      glue = "stepDefinitions"     // here we defined only a name of the package of step-definition file
		
		
		
		)


public class TestRunner {
	
}
