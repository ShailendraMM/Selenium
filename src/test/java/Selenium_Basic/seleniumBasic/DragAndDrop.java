package Selenium_Basic.seleniumBasic;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop  {
	    
	public static void main(String arg[]) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//source-target drag and drop
		WebElement Source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement Targe=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(Source, Targe).perform();
		
		//slider
		WebElement min=driver.findElement(By.xpath("//div[@id=\"slider-range\"]/span[1]"));
		WebElement max=driver.findElement(By.xpath("//div[@id=\"slider-range\"]/span[2]"));
	
		System.out.println("min   "+min.getLocation());
		System.out.println("max   "+max.getLocation());
		
		act.dragAndDropBy(min, 50, 0).perform();
		act.dragAndDropBy(max, -50, 0).perform();
		
		System.out.println("min after change "+min.getLocation());
		System.out.println("max after change   "+max.getLocation());
	}
}