package Selenium_Basic.seleniumBasic;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.XsbDumper;

public class ddtExcel_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		try {
//		FileOutputStream file=new FileOutputStream("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\ddtExcelOutput2.xlsx");
//        XSSFWorkbook workbook=new XSSFWorkbook();
//        XSSFSheet sheet=workbook.createSheet("Data");
//       
//        XSSFRow row0=sheet.createRow(0);
//        row0.createCell(1).setCellValue("abhi");
//        row0.createCell(2).setCellValue("1200");
//        
//        XSSFRow row1=sheet.createRow(1);
//        row1.createCell(1).setCellValue("anand");
//        row1.createCell(2).setCellValue("1300");
//	
//		workbook.write(file);
//		workbook.close();
//		file.close();
//		
//		System.out.println("File is creataed.....");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}
	
		
		FileOutputStream file=new FileOutputStream("C:\\\\Users\\\\shailendra.mishra\\\\eclipse-workspace\\\\seleniumBasic\\\\TestData\\ddtExcelOutput3.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		for (int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				sheet.createRow(i).createCell(j).setCellValue(i);
			}
		}
		XSSFRow row0=sheet.createRow(0);
		row0.createCell(1).setCellValue("hi");
		
	}

}
