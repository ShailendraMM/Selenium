package testNG.Dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	WebDriver driver=new ChromeDriver();
	
	@Test(dataProvider = "LoginData")
		void login(String usr,String pass) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(usr);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	
	@DataProvider(name = "LoginData",indices = {0,1,2})
	Object[][]Data(){
		Object[][] TestData= {
				{"sa","sa@123"},
				{"amit","amit@123"},
				{"admin","admin123"} };
		return TestData;
	}
}
