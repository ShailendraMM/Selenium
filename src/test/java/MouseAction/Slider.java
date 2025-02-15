package MouseAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement min=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\" and @style=\"left: 0%;\"] "));
		
		WebElement max=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\" and @style=\"left: 100%;\"]"));
		
		System.out.println("min "+min.getLocation());
		System.out.println("max "+max.getLocation());
	
		Actions act=new Actions(driver);
		act.dragAndDropBy(min, 41, 0).perform();
		act.dragAndDropBy(max, -144, 0).perform();
		
		System.out.println("min "+min.getLocation());
		System.out.println("max "+max.getLocation());
		
	}

}
