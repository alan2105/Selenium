package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelWriteData {

	public static void main(String[] args){ try {
		//Specify the path of the file
	 File src = new File ("D:/QA Documents/Selenium/testdata1.xlsx");
	 
	 //Load File 
	 FileInputStream fis = new FileInputStream(src);
	 //Load Work Book
	 XSSFWorkbook wb = new XSSFWorkbook (fis);
	 //Load Sheet and specify the sheet index - Here loading first sheet only
	 XSSFSheet sheet1 = wb.getSheetAt(0);
	 
	sheet1.getRow(0).createCell(2).setCellValue("Vzone Test");
	sheet1.getRow(1).createCell(2).setCellValue("pass");
	
	FileOutputStream fos = new FileOutputStream(src);
	wb.write(fos);
	
	fos.close();
	wb.close();

	} 
	catch (Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}


