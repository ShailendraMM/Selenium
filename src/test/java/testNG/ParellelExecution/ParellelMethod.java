package testNG.ParellelExecution;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParellelMethod {

	@Test
	void webdriver() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https:/google.com");
	Thread.sleep(10000);
	driver.close();
	
	}
   
	@Test
	void yahoo() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https:/yahoo.com");
		Thread.sleep(10000);
		driver.close();
	}
	
}
