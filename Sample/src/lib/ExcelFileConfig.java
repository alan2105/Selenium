package lib;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelFileConfig(String excelpath) throws Exception
	{
		 try {
			File src = new File (excelpath);
			 //Load File 
			 FileInputStream fis = new FileInputStream(src);
			 //Load Work Book
			 wb = new XSSFWorkbook (fis);
		 	}
		 catch (Exception e) {
			 	
			 System.out.println(e.getMessage());
		 	}
		 wb.close();
	}
	public String getData(int sheetNumber,int row,int column)
	{
		//Load Sheet and specify the sheet index
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
		
	}
	
}

