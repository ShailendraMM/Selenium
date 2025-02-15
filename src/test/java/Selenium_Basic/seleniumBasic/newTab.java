package Selenium_Basic.seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//Opening Window in new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://jqueryui.com/datepicker/");
		
		//Opening window in new browser
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https:google.com");	
	}

}
