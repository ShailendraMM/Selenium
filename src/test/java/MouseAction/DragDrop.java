package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		  driver.manage().window().maximize();
		  //swich to iframe
		  WebElement a=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		  driver.switchTo().frame(a);
		  
		  WebElement img1=driver.findElement(By.xpath("//h5[normalize-space()='High Tatras']"));
		  WebElement trace=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		  
		  Actions act=new Actions(driver);
		  act.dragAndDrop(img1, trace).perform();
			
	}

}
