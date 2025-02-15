package Selenium_Basic.seleniumBasic;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rough  {
	    
	public static void main(String arg[]) throws InterruptedException {
	
 //      WebDriver driver=new ChromeDriver();
//		
//   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		
//driver.get("https://testautomationpractice.blogspot.com/");
//				
//		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
//		
//		System.out.println("Number of Links:"+ searchlinks.size());
//		
//		System.out.println("printing & clicking links................");
//		for(WebElement link:searchlinks)
//		{
//			System.out.println(link.getText());
//			link.click();
//		}
//		
//		//After opening all the pages, capture windowid's
//		Set<String> windowIds=driver.getWindowHandles();
//		
//		System.out.println("Switching to each browser window and getting the titles........"); 
//		for(String winid:windowIds)
//		{
//			String title=driver.switchTo().window(winid).getTitle();
//			System.out.println(title);
//		}
//		
//		driver.quit();
//	}
//                  WebDriver driver=new ChromeDriver();
//                  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                  //Normal alert with OK button
//                 driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Alert\"]")).click();
//                 Alert alert1=driver.switchTo().alert();
//                 alert1.accept();
//                 
//
//                 Thread.sleep(10000);
//                 //confirmation alert with OK, Cancel button;---accept()--OK, dismiss()---cancel
//                 driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Confirm\"]")).click();
//                 Alert alert2=driver.switchTo().alert();
//                 alert1.dismiss();
//                 
//                  Thread.sleep(10000);
//                 //Prompt alert with  
//                 driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
//                 Alert alert3=driver.switchTo().alert();
//                 System.out.println(alert3.getText()); 
//
//                 alert3.sendKeys("hello");
//                 alert3.accept();
//                Thread.sleep(5000);
//              String s= driver.findElement(By.xpath("//p[@id='result']")).getText();
//             System.out.println(s);
//                  
//                  WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
//                  
//                 Alert  myalert=mywait.until(ExpectedConditions.alertIsPresent());
//                 myalert.accept();
          
//         driver.get("https://testautomationpractice.blogspot.com/");
//         WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"country\"]"));
//         Select dd = new Select(dropdown);
//         dd.selectByVisibleText("France"); 
//         dd.selectByValue("canada");
//         dd.selectByIndex(3);
//        
//         List<WebElement> options=dd.getOptions();
//          
         //using nested for loop
//         for(WebElement x:options) {
//        	 System.out.println(x.getText());
//         }

//         //using for loop
//         for (int i=0;i<options.size();i++) {
//        	 System.out.println(options.get(i).getText());
//        	 
        	 
//        	 driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
//         driver.findElement(By.xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]")).click();
//        
//         //1-Select Single option
//         driver.findElement(By.xpath("//input[@value=\"Angular\"]")).click();
//         //2-capturing all the option and find size
//         List<WebElement> option=driver.findElements(By.className("checkbox"));
//        System.out.println(option.size());
//        
//        for(WebElement op:option) {
//        //3-capturing all the option
//        	 System.out.println(op.getText());
//         //4-selecting multiple option from drop down
//        	String value= op.getText();
//        	 if (value.equals("Python")||value.equals("MySQL")) {
//        		op.click();
//        	 }
//         }
//          driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
//          
//          WebElement dd=driver.findElement(By.xpath("//select[@name=\"country\"]"));
//          Select option=new Select(dd);
//          List<WebElement> op=option.getOptions();
//          
//          //a) count total number of options
//          System.out.println(op.size());
//          //b) print all the options 
//          for(WebElement x:op ) {
//        	  System.out.println(x.getText());
//          }
//          //c) select one option
//          option.selectByVisibleText("India");
//          
//          Thread.sleep(5000);
//          driver.close();
//          
//          driver.get("https://opensource-demo.orangehrmlive.com/");
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
//          driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
//          driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//          driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//         // Alert Alert1=driver.switchTo().alert();
//         // Alert1.accept();
//          
//          driver.findElement(By.xpath("//span[text()='PIM']")).click();
//          driver.findElement(By.xpath("//div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[7]/div/div[2]/div/div/div[@tabindex=\"0\"]")).click();
//          driver.findElement(By.xpath("//span[text()='Quality Assurance']")).click();
//          
//          driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//          
//          //printing no of row
//         List <WebElement> row= driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[1]"));
//           System.out.println(row.size());
//           
//          //printing no of column
//           List <WebElement> clmn= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
//           System.out.println(clmn.size());
//           
//
//          //print value of 2nd row, 3rd column
//          Thread.sleep(5000);
//         WebElement e= driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]"));
//         System.out.println(e.getText());
//         
//        //printing table data in tabular form  using for loop
//        for(int r=2;r<6;r++) {
//            for(int c=1;c<5;c++) {
//         WebElement b= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
//         System.out.print(b.getText()+"\t");
//         }
//            System.out.println();
//       }
//        
//        //print Mukesh courses
//        for(int i=2;i<6;i++) { 
//         String b= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[2]")).getText();
//         
//         if(b.equals("Mukesh")) {
//        	 String d= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[1]")).getText();
//        	 System.out.println(d);
//            }
//         }
	
//   int [] a= {0,1,1,0,1,0};
//   System.out.println(a.toString());
//   int c=0;
//   for(int i=0;i<a.length;i++) {
//	   for(int j=0;j<a.length;j++) {
//		   if(a[i]<a[j]) {
////			   c=a[i];
////			   a[i]=a[j];
////			   a[j]=c;
//			   a[i]=a[i]+a[j];
//			   a[j]=a[i]-a[j];
//			   a[i]=a[i]-a[j];
//			   
//		   }
//	   }
//   }
//   System.out.println(Arrays.toString(a));
//   
//   String b="shailendra";
//  char[] e= {'a','e','i','o','u'};
//  // char d;
//   for(int i=1;i<b.length();i++) {
//	   for(int j=0;j<e.length;j++) {
//		   if(b.charAt(i)==e[j])  {
//			  System.out.println(i);
//			   
//			   
//		   }
//	   }
//   }
   
		int a[]= {1,1,2,3,4,4,6,4};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i]+","+count);

		}
		
		}
      }