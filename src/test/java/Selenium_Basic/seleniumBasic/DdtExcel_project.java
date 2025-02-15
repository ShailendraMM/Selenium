package Selenium_Basic.seleniumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFConditionFilterData;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DdtExcel_project {

	static int getrow(String path,String sheet1) throws IOException {
		FileInputStream file=new FileInputStream(path);
		 XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet=wb.getSheet(sheet1);
			
			int row=sheet.getLastRowNum();
			wb.close();	
			file.close();

			return row;
		
	}
	
     static int cellcount(String path,String sheet1,int rowno) throws IOException {
    		FileInputStream file=new FileInputStream(path);
    		XSSFWorkbook wb=new XSSFWorkbook(file);
    		XSSFSheet sheet=wb.getSheet(sheet1);
    		XSSFRow row=sheet.getRow(rowno);
    		int cell=row.getLastCellNum();
    		wb.close();	
			file.close();
			
    		return cell;
		}
		
     static String getcell(String path,String sheet1,int rowno,int columnno) throws IOException {
    	FileInputStream file=new FileInputStream(path);
 		XSSFWorkbook wb=new XSSFWorkbook(file);
 		XSSFSheet sheet=wb.getSheet(sheet1);
 		XSSFRow row=sheet.getRow(rowno);
 		XSSFCell cell=row.getCell(columnno);
 		String data;
 		try{
 			DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell) ;   	    }
    	catch(Exception e) {
    		 data="";
    	    }
 		wb.close();	
		file.close();
 	    return data;
 	    
     }
     
     static void setcell(String path,String sheet1,int rowno,int columnno, String data) throws IOException {
         FileInputStream file=new FileInputStream(path);
  		XSSFWorkbook wb=new XSSFWorkbook(file);
  		XSSFSheet sheet=wb.getSheet(sheet1);
  		XSSFRow row=sheet.getRow(rowno);
  		XSSFCell cell=row.getCell(columnno);
  		
  		 cell=row.createCell(columnno);
  		
  		cell.setCellValue(data);
  		FileOutputStream fo=new FileOutputStream(path);
  		wb.write(fo);
  		wb.close();	
		file.close();
  		

     }
     
     
		public static void main(String[] args) throws Exception {
			
			
	        ChromeOptions co = new ChromeOptions();
	        co.addArguments("--disable-notifications");
	     //   co.addArguments("--incognito");

			WebDriver driver=new ChromeDriver(co);
			
			
			for(int i=1;i<6;i++) {
			
			driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
			WebElement principal=driver.findElement(By.xpath("//input[@id='principal']"));
			principal.sendKeys(getcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,0));
			WebElement Roi=driver.findElement(By.xpath("//input[@id='interest']"));
			Roi.sendKeys(getcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,1));
			WebElement tenure=driver.findElement(By.xpath("//input[@id='tenure']"));
					tenure.sendKeys(getcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,2));
			WebElement frequency=	driver.findElement(By.xpath("//select[@id='frequency']"));
			Select sc=new Select(frequency);
			sc.selectByVisibleText("Compounded Monthly");
			WebElement period=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select sc1=new Select(period);
			sc1.selectByVisibleText("year(s)");			
			Thread.sleep(5000);
			
              driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]")).click();
              driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]")).click();

             String a=  driver.findElement(By.xpath("//span[@class=\"gL_27\"]/strong")).getText();
             System.out.println(a);
             setcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,4,a);
             
               String expectd =  getcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,3);
               String actual =getcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,4);
               if(expectd.equals(actual)) {
                   setcell("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\Sbi_FD.xlsx","Sheet1",i,4,"PASS"); 
               }
               else {
            	   
               }
               
			
			
			
		
		}
		}
}


