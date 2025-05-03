package testNG.ParellelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelClass1 {
@Test
	void method1() throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.close();
		
	}
}
