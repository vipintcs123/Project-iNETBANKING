package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {


 // instansiate chrome browser driver
		
	    System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();  // Here ChromeDriver is a class which implements web driver interface, launches chrome browser with blank url
		
		driver.manage().window().maximize();    // maximize the browser window
		
		driver.manage().deleteAllCookies();   // delete all the cookies and cache from a chrome and start a fresh browser
		
		// driver.get("https://www.ebay.com/");   // enter url
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);  // This is dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // This is also dynamic wait
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(4000);   // It is a static wait.
		
	
		
		// Handling rows in a web table.
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		int rowCount = rows.size();
		
		System.out.println("Total rows in a web table : " +rowCount);
		
		Thread.sleep(4000);
		
		
		
	
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		// Here xpath come in form pattern so we break the xpath, tr means means table row and td means table column.
		
		String beforeXpath = "//*[@id=\'customers\']/tbody/tr[";
		
		String afterXpath = "]/td[1]";
		
		
		for(int i=2; i<=rowCount; i++)
		{
			String actualXpath = beforeXpath+i+afterXpath;
			
			WebElement element = driver.findElement(By.xpath(actualXpath));
			
			System.out.println(element.getText());
			
			
			
			if(element.getText().equals("Island Trading"))    // to check where Island Trading is present in web table or not
			{
				Thread.sleep(4000);
				System.out.println("company name : "+ element.getText() + " is found" + "at position : "+(i-1));
				break;
				
			}
			
			
		}	
		
		
		System.out.println("*************************");
		
		
		
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		//*[@id="customers"]/tbody/tr[6]/td[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		// Here xpath come in form pattern so we break the xpath, tr means means table row and td means table column
		
		
		String afterXpathContact = "]/td[2]";
		
		for(int i=2; i<=rowCount; i++)
		{
			String actualXpath = beforeXpath+i+afterXpathContact;
			
			WebElement element = driver.findElement(By.xpath(actualXpath));
			
			System.out.println(element.getText());
		
			
		}	
		
		
		System.out.println("*************************");
		
		
		

		
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
		//*[@id="customers"]/tbody/tr[5]/td[3]
		
		
		// Here xpath come in form pattern so we break the xpath, tr means means table row and td means table column
		
		

		String afterXpathCountry = "]/td[3]";
		
		for(int i=2; i<=rowCount; i++)
		{
			String actualXpath = beforeXpath+i+afterXpathCountry;
			
			WebElement element = driver.findElement(By.xpath(actualXpath));
			
			System.out.println(element.getText());
		
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		// Handling web table columns 
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[1]/th[3]
		
		
		String colBeforeXpath = "//*[@id=\'customers\']/tbody/tr[1]/th[";
		String colAfterXpath = "]";
		
		Thread.sleep(3000);
		
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		
		int colCount = cols.size();
		
		System.out.println("Total number of columns are : " + colCount);
		
		System.out.println("Column values are : ");
		
		
		for(int i=1;i<=colCount; i++)
		{
			
			WebElement element = driver.findElement(By.xpath(colBeforeXpath+i+colAfterXpath));
			
			String colText = element.getText();
			
			System.out.println(colText);
			
		}
		
		
		
		
	}

}
