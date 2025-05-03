package Selenium_Basic.seleniumBasic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
    TakesScreenshot Sc=(TakesScreenshot)driver;
    
//ScreenShot Full Page
    File SourceFile=Sc.getScreenshotAs(OutputType.FILE);
       //File TargetFile=new File("C:\\Users\\shailendra.mishra\\eclipse-workspace\\seleniumBasic\\ScreenShots\\sc2.png");
      //but this path will not work on other system
    File TargetFile=new File(System.getProperty("user.dir")+"\\screenshots\\sc7.png");
        SourceFile.renameTo(TargetFile);
        
//ScreenShot of selected area
        WebElement header=driver.findElement(By.xpath("//header[@id=\"top\"]"));
       // TakesScreenshot sc=(TakesScreenshot)driver;
        File SourceFile1= header.getScreenshotAs(OutputType.FILE);
        File TargetFile2=new File(System.getProperty("user.dir")+"\\screenshots\\sc9.png");
        SourceFile1.renameTo(TargetFile2);
        
    
	}

}
