package Selenium_Basic.seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownbootstap {
public static void main(String args[]) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@type=\"button\"][@class=\"multiselect dropdown-toggle btn btn-default\"]")).click();
	
	WebElement HTML=driver.findElement(By.xpath("//input[@value='HTML']"));
	WebElement Bootstrap=driver.findElement(By.xpath("//input[@value='Bootstrap']"));
	WebElement CSS=driver.findElement(By.xpath("//input[@value='CSS']"));

	boolean htmls=HTML.isSelected();
	boolean bootstraps=Bootstrap.isSelected();
	boolean csss=CSS.isSelected();
	
	if(htmls) {
		HTML.click();
		}
	if(!bootstraps) {
		Bootstrap.click();
	}
	if(csss) {
		CSS.click();
	}
//	
//	List<WebElement> options=driver.findElements(By.className("checkbox"));
//	System.out.println(options.size());
//	
//	for(WebElement op:options) {
//		System.out.println(op.getText());
//		
//	}
	
	WebElement Options=driver.findElement(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]"));
	
System.out.println(Options.getText());
}
}
