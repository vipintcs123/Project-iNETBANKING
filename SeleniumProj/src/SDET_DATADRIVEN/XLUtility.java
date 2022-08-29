package SDET_DATADRIVEN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;   
	String path=null;
	
	XLUtility(String path)      // whenever we created a object of this class then we have to pass the location of excel file so this constructor will take the 
	                           // path of excel and assigned that path to a local variable named path
	{
		this.path=path;
	}
		
	public int getRowCount(String sheetName) throws IOException    // It will take sheet name as an argument and it return a row count/no. of rows in a sheet
	{
		fi=new FileInputStream(path);    // open a file in input/read mode
		workbook=new XSSFWorkbook(fi);   // get the workbook
		sheet=workbook.getSheet(sheetName);   // get the sheet based on sheet name
		int rowcount=sheet.getLastRowNum();   // get rowcount/no of rows
		workbook.close();
		fi.close();
		return rowcount;		
	}
	

	
	public int getCellCount(String sheetName,int rownum) throws IOException   // It take argument as sheet name and row number and then return a cell count
	{
		fi=new FileInputStream(path);    // open a file in input/read mode
		workbook=new XSSFWorkbook(fi);   // get the workbook
		sheet=workbook.getSheet(sheetName);   // get the sheet based on sheet name
		row=sheet.getRow(rownum);    // get particular row based on row num
		int cellcount=row.getLastCellNum();  // get the cell count 
		workbook.close();
		fi.close();
		return cellcount;
	}
	
	
	public String getCellData(String sheetName,int rownum,int colnum) throws IOException
	{                                        // It take sheet name, row number, column number as an argument then it will return cell data
		fi=new FileInputStream(path);  // open file in input stream mode
		workbook=new XSSFWorkbook(fi);   // get the workbook
		sheet=workbook.getSheet(sheetName);  // get the sheets
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		data = formatter.formatCellValue(cell);        //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)          // if data not present in cell then we got exception and handle that exception using catch block
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
	}
	
	
	
// in this method, we writing some value to the cell, it will take sheet name, rownum, colnum, data as an argument and then write that data into a cell
	
	public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
	{
		File xlfile=new File(path);    
		if(!xlfile.exists())    // If file not exists then create new file
		{
		workbook=new XSSFWorkbook();   
		fo=new FileOutputStream(path);
		workbook.write(fo);
		}
				
		fi=new FileInputStream(path);    // get the file 
		workbook=new XSSFWorkbook(fi);   // get the workbook
			
		if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
			workbook.createSheet(sheetName);
		
		sheet=workbook.getSheet(sheetName);  // get the sheet
					
		if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
				sheet.createRow(rownum);
		row=sheet.getRow(rownum);    // get the row
		
		cell=row.createCell(colnum);   // get the cell
		cell.setCellValue(data);    // inside the cell, we write/set a value
		fo=new FileOutputStream(path);   // open file in a output stream mode
		workbook.write(fo);		 // here write workbook in the file
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);   // open a file in input mode
		workbook=new XSSFWorkbook(fi);// get the workbook
		sheet=workbook.getSheet(sheetName);  // get the sheet
		
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
				
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		
		style=workbook.createCellStyle();
		
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
		
		cell.setCellStyle(style);		
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	
}