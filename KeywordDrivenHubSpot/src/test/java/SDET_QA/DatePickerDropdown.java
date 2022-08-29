package SDET_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDropdown {

	public static void main(String[] args) {




		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();   // This line will opens the datepicker
		
		
		// dropdown for month selection
		
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		
		month_drp.selectByVisibleText("Oct");
		
		// dropdown for year selection
		
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
				
		year_drp.selectByVisibleText("2018");
		
		
		
		
		
		// now we are going to select a date
		
		
		String date = "15";
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));   // This line returns all the dates
		
		// here we get each and every daye and cpmapre with expected date an dthen click on that date
		
		
		for(WebElement ele : allDates)   // here we take all the element one by one
		{
			String dt = ele.getText();
			
			if(dt.equals(date))
			{
				ele.click();
				
				break;        // if date matches with expected then we come out of loop using break
			}
			
		}
		
		

	}

}
