package solar;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class picking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://levissolaruat.vineretail.com/eRetailWeb/eRetailLogin.action?popup=true");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("5d26259e554c415");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
        WebElement frame1=driver.findElement(By.xpath("iframe[@id='childIFrame']"))	;
        
        driver.switchTo().frame(frame1);
        
		

	}

}
