package Selenium_Basic.seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//Select[@id=\"country\"]"));
		Select dd=new Select(dropdown);
		
		
//to print all the option
		List <WebElement>options =dd.getOptions();
		for (WebElement e:options) {
			System.out.println(e.getText());
		}
		
		//we can also use for loop System.out.println(options.get(i).getText());
		
//to select any option
	dd.selectByContainsVisibleText("India");
		
		
		
		
	}

}
