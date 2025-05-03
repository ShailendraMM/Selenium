package testNG.ParellelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
@Test
void intitalize(String browsername) {
	browsername.toLowerCase();

	if(browsername.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();	
         }
	if(browsername.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
         }
  }
@Test
void LandingPage() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@Test
void Login() {
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin@123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

}
}
