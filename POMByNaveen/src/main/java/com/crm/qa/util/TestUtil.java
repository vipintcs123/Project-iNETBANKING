package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 10;
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Vipin Shukla\\eclipse-workspace\\POMByNaveen\\src\\main\\java\\com\\crm\\qa\\testdata\\pomnaveen.xlsx";
	

	public static Workbook book;
	public static Sheet sheet;
	public static JavascriptExecutor js;
	
	
	public void switchToFrame()
	{
		driver.switchTo().frame("main-panel");
		
	}
	
	
	// this method return 2d object array, sheet will iterate on the basis of rows and columns so e create 2 for loop , one loop for row and other loop for columns
	// and store the value in object array and then we return this object array
	public static Object[][] getTestData(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		
		FileInputStream file = null;
		
		
		try {
			
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			book = WorkbookFactory.create(file);
		}
		
		catch (InvalidFormatException e)
		{
			e.printStackTrace();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {   // for rows
			
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {   // for columns
				
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				
			
			}
		}
		
		return data;
	}
	
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	
	
	
	
}
