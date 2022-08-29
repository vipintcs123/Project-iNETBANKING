package SDET_QA;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerCalendar {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		
		String year = "2022";
		String month = "Dec";
		String date = "30";
		
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();  // This line open the date picker
		
		while(true)
		{
			String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[] = monthYear.split(" ");  /// split method returns a 2 values month and year
			
			String mon = arr[0];     // Here at 0 index month value is stored
			String yr = arr[1];      // Here at 1 index year value is stored
			
			
			
			// If above month and year values are matching with expected month and year , then we break the loop and go to a date selection-
			
			// If month and year values are not matching then we click on arrow mark and capturing a value again till expected value not matches
			
			
				
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
	
				break;    // used to exit from while loop
			
			else
				
			driver.findElement(By.xpath("//button[normalize-space()='>']")).click();    // here we click on arrow
			
			
			
		}
			
			
			// Date Selection
			
			List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));   // here we got all dates
			
			for(WebElement ele : alldates)   /// here we capture each and every date in ele element
			{
				String dt = ele.getText();
				
				if(dt.equals(date))
				{
					ele.click();
					break;
					
				}
				
			}
			
		
			
			
		}
		

	}


