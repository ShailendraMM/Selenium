package Selenium_Basic.seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Java Program to Login to a specific Webpage
		// Using Selenium WebDriver and ChromeDriver

		// Importing package module to code fragmen

		// Importing required classes
		

		        // Path of chrome driver
		        // that will be local directory path passed
//		        System.setProperty(
//		            "webdriver.chrome.driver",
//		            "C:\\Users\\shailendra.mishra\\Downloads\\chromedriver-win64");
		
		        
		        WebDriver driver = new ChromeDriver();

		        // URL of the login website that is tested
		        driver.get("https://auth.geeksforgeeks.org/");

		        // Maximize window size of browser
		        driver.manage().window().maximize();

		        // Enter your login email id
		        driver.findElement(By.id("luser"))
		            .sendKeys("xyz@gmail.com");

		        // Enter your login password
		        driver.findElement(By.id("password"))
		            .sendKeys("xyz12345");

		        driver.findElement(By.className("signin-button"))
		            .click();
		    }
		}


	