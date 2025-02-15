package MouseAction;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
			
		  driver.switchTo().frame("iframeResult");

		 WebElement button= driver.findElement(By.xpath("//button[normalize-space()=\"Double-click me\"]"));
		 
		 Actions act=new Actions(driver);
		 
//		 act.doubleClick(button).perform(); or
		 org.openqa.selenium.interactions.Action dc=act.doubleClick(button).build();
		 dc.perform();
		 
		String a= driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		 System.out.println(a);
	}

}
