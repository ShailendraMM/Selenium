package testNG.ParellelExecution;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import junit.framework.Assert;

public class Dataprovider {
WebDriver driver;
	
@BeforeClass	
@Parameters("browser")
void setup(String br) throws Exception {
	switch(br.toLowerCase()){
	case "chrome":driver=new ChromeDriver();break;
//	case "safari":driver=new SafariDriver();break;
	default: System.out.println("invalid browser");return;
	//brake will exit from switch return will exit from method
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

@Test(dataProvider = "dp")
void login(String usr, String pwd) {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(usr);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	boolean status=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
	if(status==true) {
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.xpath("//a[normalize-space()=\"Logout\"]")).click();
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
@AfterClass
void end() {
	driver.close();
}

@DataProvider(name="dp",indices = {0,1,2})
Object[][] data() {
	Object[][] data= {
			{"hi", "hello"},
			{"Admin","admin123"},
			{"sunny","sa@123"}
	                 };
			
		return data	;
			
}

}
