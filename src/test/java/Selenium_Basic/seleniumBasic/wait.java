package Selenium_Basic.seleniumBasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.google.com");

	        // Create WebDriverWait instance with a wait time of 10 seconds
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	        // Wait for the element with ID "myElement" to be clickable
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='gLFyf']")));

	        // Perform actions on the element
	        element.click();
            element.sendKeys("hello");
	        // Rest of your test script
	        // ...

	        // Quit the driver
	        driver.quit();
	    }
}