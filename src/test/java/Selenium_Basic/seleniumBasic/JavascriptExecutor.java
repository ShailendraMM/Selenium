package Selenium_Basic.seleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement box=driver.findElement(By.xpath("//input[@id='name']"));
		
//		box.sendKeys("hello");
		
		//SendKey on element
		org.openqa.selenium.JavascriptExecutor js= (org.openqa.selenium.JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','hello')",box);
			
		
		// clicking on element - alternate of click()
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);

       

	}
	

}
