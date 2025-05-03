package Selenium_Basic.seleniumBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DdtExcel_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    

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
