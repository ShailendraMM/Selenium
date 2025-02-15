package Selenium_Basic.seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DatePicker2 {
	

	public static void main(String[] args) {
		String dd="22";
		String mm="Jul";
		String yyyy="2026";
		
		WebDriver driver=new ChromeDriver();
		   driver.get("https://testautomationpractice.blogspot.com/");
		   driver.findElement(By.xpath("//input[@id=\"txtDate\"]")).click();
		   
		   WebElement year= driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		   Select yr=new Select(year);
		   yr.selectByValue(yyyy);	
		
		  WebElement month= driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		   Select mnth=new Select(month);
		  
		   mnth.selectByVisibleText(mm);		   
		   List<WebElement>date=  driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
		   for(WebElement d:date) {
			 if(d.getText().equals(dd)) {
				 d.click();
			 
		 }
	}
		   
		  

	}

}
