package Selenium_Basic.seleniumBasic;

import java.io.IOException;
import java.lang.module.FindException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		int brokenLink=0;
		try {
			for(WebElement link:links) {
			String hrefvalue=link.getAttribute("href");
			
			if(hrefvalue==null  || hrefvalue.isEmpty()) {
				System.out.println("this link not possible to check-->"+hrefvalue);
				
			}
			URL linkurl=new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			conn.connect();
			
			int respnseode=conn.getResponseCode();
			
			
			if(respnseode>=400) {
				System.out.println("brokrn link--->"+hrefvalue);
				brokenLink++;
			}
		   }
		}
		 catch(Exception e) {
			
		}
		System.out.println("no of total broken link-->"+ brokenLink);
	}

}
