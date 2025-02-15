package Selenium_Basic.seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class error_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        WebDriver driver = new ChromeDriver();

		        try {
		            // Open a webpage
		            driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		            // Try to find an element and click it
		            WebElement element = driver.findElement(By.id("someElementId"));
		            element.click();

		        } catch (NoSuchElementException e) {
		            System.out.println("Error: Element not found.");
		        } catch (TimeoutException e) {
		            System.out.println("Error: Timeout while waiting for element.");
		        } catch (StaleElementReferenceException e) {
		            System.out.println("Error: Element is no longer attached to the DOM.");
		        } catch (ElementNotInteractableException e) {
		            System.out.println("Error: Element not interactable (may be hidden or disabled).");
		        } catch (WebDriverException e) {
		            System.out.println("Error: WebDriver issue: " + e.getMessage());
		        } finally {
		            // Close the driver after the test
		            driver.quit();
		        }
		    }
		
		
		
	}


