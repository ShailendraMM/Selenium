package testNG.POMFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logintest {

	WebDriver driver;
@BeforeClass	
void setup() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
       }
	
@Test(dataProvider = "dp")
void testLogin(String usr,String pass) {
	Loginpage lp=new Loginpage(driver);
	lp.setUsername(usr);
	lp.setPassword(pass);
	lp.clickSubmit();
	System.out.println(driver.getTitle());
      }
@AfterClass
void tearDown() {
	driver.quit();
}

@DataProvider(name="dp")
Object[][] data(){
	Object[][] TestData= {{"ram","ram@123"},
			              {"admin","admin@123"}};
	return TestData;
}
}
