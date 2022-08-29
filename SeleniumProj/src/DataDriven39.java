import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven39{
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		// Instantiate google chrome browser driver
		
			System.setProperty("webdriver.chrome.driver","E:\\seleniumfiles\\chromedriver_win32\\chromedriver.exe");
			
			
			// Create Chrome Browser driver, here we create a chrome browser driver in selenium web driver interface
			
			WebDriver driver = new ChromeDriver();    // launches the browser with blank URL  
			
			driver.manage().window().maximize();     // maximize the browser window 
			
			
			
		
		
	
		// Getting data from Excel Sheet
		
		FileInputStream f = new FileInputStream("E:\\ExcelFiles\\input.xlsx");
		
		
		// Get workbook instance for xls file
		
		XSSFWorkbook w = new XSSFWorkbook(f);
		
		
		// Get first sheet from the workbook
		
	    XSSFSheet s = w.getSheet("Sheet1");
	    
	    
	    // Get first row from the sheet
		
		int rows = s.getLastRowNum();    // get the number of rows
		
		int columns =   s.getRow(0).getLastCellNum();  // get the number of columns or give the no. of cell present in a row
		
		 
		
		
		
		// System.out.println(rows);
		
		// System.out.println(columns);
		
		
		
    for(int i=0;i<=rows;i++)  // used for increment the rows
	{
			
	XSSFRow	currentrow = s.getRow(i);         // focused on current row based on value of i, here we store entire row in a variable
	
	
    String uname = currentrow.getCell(0).getStringCellValue();      // here we know the no of columns so we do not use second for loop for columns but we can also use
	                                                              // if we do not know the no of columns then we use second for loop
	String pwd = currentrow.getCell(1).getStringCellValue();
	
	
	
	
	
	/*
	
	for(int j=0;j<columns;j++)     // used for increment the cell values on the each row
	{
		
	String value =	currentrow.getCell(j).toString();          // here we read a value from a cell
	
	System.out.println(value);
		
	}
	
	*/
	
	

	
	

	driver.get("http://gcreddy.com/project/admin/login.php");    // navigate to gcrshop admin interface
	
	driver.findElement(By.name("username")).sendKeys(uname);  
		
	driver.findElement(By.name("password")).sendKeys(pwd); 
		
		
	driver.findElement(By.id("tdb1")).click();   	// click "login" button
	
	String url = driver.getCurrentUrl();   
	
	  if(url.equals("http://gcreddy.com/project/admin/index.php"))
	    {
	    
	    System.out.println("Admin Login is Successful - Passed");
	    
	    }
	    
	    else
	    	
	    {
	    	
	        System.out.println("Admin Login is UnSuccessful - Failed");
	    }
		    

	
	
    	}		
		
	}	
	
}