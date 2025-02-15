package Selenium_Basic.seleniumBasic;

import java.io.File;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blazedemo {
	
	static void ScreenShot(WebDriver driver,String a) {
		 TakesScreenshot sc=(TakesScreenshot)driver;
		 File Sourcefile=sc.getScreenshotAs(OutputType.FILE);
		 File TargetFile=new File("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\ScreenShots\\"+a+".png");
		 Sourcefile.renameTo(TargetFile);
	}
	
public static void main(String[] arg) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://blazedemo.com/");
	WebElement departurecountry= driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
	Select dprtrcntry=new Select(departurecountry);
	dprtrcntry.selectByVisibleText("Boston");
	
	WebElement destinationcountry= driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
	Select dstntncountry=new Select(destinationcountry);
	dstntncountry.selectByVisibleText("London");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	
  List <WebElement> price= driver.findElements(By.xpath("//table[@class=\"table\"]//tbody//td[6]"));
  System.out.println(price.size()); 
  String[] b=new String[5];
  for (int i=0;i<5;i++) {
	 String a= price.get(i).getText();
	 b[i]=a;
  }
   System.out.println(Arrays.toString(b));
     Arrays.sort(b);
   System.out.println(Arrays.toString(b));
   System.out.println(b[0]);
   
   for(int j=1;j<5;j++) {
 String p= driver.findElement(By.xpath("//table[@class=\"table\"]//tbody//tr["+j+"]//td[6]")).getText();
 if(p.equals(b[0])) {
	// driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+j+"]//input[@type='submit'])")).click();
	 driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+j+"]/td[1]//input")).click();
	 String a="sc10";
	String s="C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\ScreenShots\\"+a+".png)";
	System.out.println(s);
	 ScreenShot(driver, "sc10");
	 
	 break;
 }
   }
}
}
