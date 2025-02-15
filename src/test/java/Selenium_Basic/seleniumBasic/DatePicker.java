package Selenium_Basic.seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	

	static void MonthYearSelector(WebDriver driver,String mnth,String yr){
		
		   driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		   while(true){
			   String a=(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText());

		   if(!a.contains(mnth+" "+yr)) {
			   driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			   System.out.println(a);
		         }
		   else {
			   break;
		   }
			 
		      }
	}
	static void dateselector(WebDriver driver,String a) {
	      List<WebElement> date= driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
	      for(WebElement d:date) {
	    	  System.out.println(d.getText());
	    	  if(d.getText().equals(a)) {
	    		  d.click();    	  }
	    	  
	      }
	}

	public static void main(String[] args) {
		
   WebDriver driver=new ChromeDriver();
   driver.get("https://jqueryui.com/datepicker/");
   driver.switchTo().frame(0);
   MonthYearSelector(driver, "November", "2022");
   dateselector(driver, "14");
   
   
	}
}
