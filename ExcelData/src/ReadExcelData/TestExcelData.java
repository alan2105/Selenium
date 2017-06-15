package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelData {

	public static void main(String[] args) throws Exception {
		//Specify the path of the file
	 File src = new File ("D:/Testing/Selenium/testdata1.xlsx");
	 
	 //Load File 
	 FileInputStream fis = new FileInputStream(src);
	 //Load Work Book
	 XSSFWorkbook wb = new XSSFWorkbook (fis);
	 //Load Sheet and specify the sheet index - Here loading first sheet only
	 XSSFSheet sheet1 = wb.getSheetAt(0);
	 
	 //getRow() - which row want to read and getCell() - which column want to read
	 //getStringCellValue()- specify that we are reading data
	String data0 =  sheet1.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println("Data in Excel file: " +data0);
	 
	System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());
	 
	int rowcount = sheet1.getLastRowNum();
	System.out.println("Total number of rows:" +(rowcount+1));
	 
	for(int i=0;i<rowcount;i++)
	{
		String FirstRowData = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("List of data in 1st Row: " +FirstRowData );
	}

	}

}
