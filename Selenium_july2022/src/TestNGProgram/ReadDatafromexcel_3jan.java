package TestNGProgram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDatafromexcel_3jan {
        @Test
		public void ReadExcel() throws IOException {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\emp.xlsx");
			
	         XSSFWorkbook workbook = new  XSSFWorkbook(fis);
	         
	    //   XSSFSheet sheet = workbook.getSheet("Sheet1");           //or//
	         XSSFSheet sheet = workbook.getSheetAt(0);
	         
	         System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	         
	         
	         System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	        
		}

	

	}


