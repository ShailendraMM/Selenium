package Selenium_Basic.seleniumBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 15");
		
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
       
		
		WebElement dropdownElement = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        WebElement sortByDropdown = driver.findElement(By.id("s-result-sort-select"));
        Select sortBySelect = new Select(sortByDropdown);
        sortBySelect.selectByVisibleText("Price: Low to High");
        
        
           Thread.sleep(5000)        ;
        
        
        WebElement dropdownElement1 = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
        WebElement sortByDropdown1 = driver.findElement(By.id("s-result-sort-select_2"));
        Select sortBySelect2 = new Select(sortByDropdown);
        sortBySelect.selectByVisibleText("Price: High to Low");
        driver.quit();

		
		
		
		
		}
	
		
	}


