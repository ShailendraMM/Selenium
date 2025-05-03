package Selenium_Basic.seleniumBasic;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try{
		
	    FileInputStream file=new FileInputStream("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\TestData\\ddtExcel.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(file);
		XSSFSheet sheet=wk.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		System.out.println(row);
		int column=sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=row;i++) {
		
				XSSFCell user=sheet.getRow(i).getCell(0);
				XSSFCell password=sheet.getRow(i).getCell(1);

				driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(user.toString());
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password.toString());
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				
				System.out.println(user.toString());
				
		          	
		        }
	     	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
