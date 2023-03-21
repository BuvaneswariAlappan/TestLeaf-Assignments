package week5.Day2.Week5Day2ClassWork;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingDataIntegrateWithExcelTestNG {
	
	
	public static String[][]  readData(String dataFile) throws IOException{
		XSSFWorkbook wb =  new XSSFWorkbook("./excelSheetData/"+dataFile+".xlsx");

		XSSFSheet sheet =  wb.getSheetAt(0);

		int rowNumCount = sheet.getLastRowNum();
		System.out.println("Total number of Rows Count: "+rowNumCount);

		short cellNumCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of Column Count: "+cellNumCount);
		
		//Convert into 2D Array
		 String[][] excelData = new String[rowNumCount][cellNumCount];

		 for(int i=1; i<=rowNumCount;i++) {
			 XSSFRow row = sheet.getRow(i);
			 
			 for(int j=0; j<cellNumCount;j++) {
				 XSSFCell cell = row.getCell(j);
				 excelData[i-1][j]=cell.getStringCellValue();
				 System.out.print("  "+excelData + "  " );				 
			 }
			 System.out.println();
		}
		 wb.close();
		 return excelData;

	}

	
}
