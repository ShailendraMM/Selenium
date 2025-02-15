package Selenium_Basic.seleniumBasic;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java_basic.array;

public class demoopencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		int el=driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]")).size();
		int count=0;
		for(int i=1;i<=el;i++) {
			String s=driver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]/div["+i+"]/div/div[3]/div")).getText();
			if(s.equals("ESS")) {
				driver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]/div["+i+"]//div[@class=\"oxd-table-card-cell-checkbox\"]")).click();
				count++;
			}
			
		}
		System.out.println(count);
	}
}
