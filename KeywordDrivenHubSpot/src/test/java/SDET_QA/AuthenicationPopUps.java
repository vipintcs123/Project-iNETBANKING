package SDET_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenicationPopUps {

	public static void main(String[] args) {




		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	     //  driver.get("https://the-internet.herokuapp.com/basic_auth");
	      
	      
	      
	      // Syntax: https://user:password@url
	      // https://admin:admin@the-internet.herokuapp.com/basic_auth
	      
		  
		  
		  // Here beow we handle authentication pop up
	      // here when we run below statement then login/ authenticate and sign up easily with username and password easily
		  
		  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");     // here we pass url with username and password  
	}

}
