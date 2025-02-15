package MouseAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webflow.com/made-in-webflow/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropdownElement = driver.findElement(By.xpath("//div[@class='MuiBox-root mui-130f8nx']"));
		dropdownElement.click();
		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list mui-8or7hv']"));
		
		
		
		
		for (WebElement e : list1) {
			
			String s = e.getText();
			String s1 = "Spanish";
			System.out.print(e.getText().equals(s1));
			System.out.print(s);
			
			
			
		
//	if (s.equalsIgnoreCase(s1)) {
//				System.out.print(s);
//				e.click();
//				
//	}
			
		
		
		
		
		
		
////        WebElement sortByDropdown = driver.findElement(By.partialLinkText("HTML"));
//		
//		
//        Select sortBySelect = new Select(dropdownElement);
//        sortBySelect.selectByVisibleText("HTML");
        
	}

}}
