package Selenium_Basic.seleniumBasic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SSLHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op=new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		op.addExtensions(new File("C:\\Users\\shailendra.mishra\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx"));
		WebDriver driver=new ChromeDriver(op);
	
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
