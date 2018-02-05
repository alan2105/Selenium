package handlingExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReadAndWrite {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("D:\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row = sh.getRow(1);
		XSSFCell cell = row.getCell(1);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wb.close();



}
}