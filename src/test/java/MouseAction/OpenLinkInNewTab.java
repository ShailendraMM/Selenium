package MouseAction;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	WebElement regLink=	driver.findElement(By.xpath("//a[normalize-space()=\"Register\"]"));
	
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	
	Set<String>Ids=driver.getWindowHandles();
	
	List<String> wid=new ArrayList(Ids);
	driver.switchTo().window(wid.get(1));
	System.out.println(driver.getTitle());
	
	
	
	
	}
}
