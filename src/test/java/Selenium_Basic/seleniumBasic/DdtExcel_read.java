package Selenium_Basic.seleniumBasic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdtExcel_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

try {
	FileInputStream File=new FileInputStream("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\ddtExcel.xlsx");

	XSSFWorkbook workbook=new XSSFWorkbook(File);
	XSSFSheet sheet=workbook.getSheet("sheet1");
     
	int row=sheet.getLastRowNum();
	int column=sheet.getRow(0).getLastCellNum();
	
	System.out.println("no of row="+row);
	System.out.println("no of column="+column);
	
    for(int i=1;i<=row;i++) {
	   for(int j=0;j< column;j++) {
		
		XSSFCell a=sheet.getRow(i).getCell(j);
		System.out.print(a.toString()+",");
	   }
	   System.out.println();
      } 
    }
	catch(Exception E) {
		E.printStackTrace();
    }	
  }
}
