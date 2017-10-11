package ReadExcelData;

import lib.ExcelFileConfig;

public class TestReadExceldata {

	public static void main(String[] args) throws Exception {
		ExcelFileConfig excel = new ExcelFileConfig("D:/QA Documents/Selenium/testdata1.xlsx");
		
		System.out.println(excel.getData(1, 0, 1));

	}

}
