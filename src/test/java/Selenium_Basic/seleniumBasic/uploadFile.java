package Selenium_Basic.seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

String file1="C:\\Users\\shailendra.mishra\\Downloads\\Day-37.txt";
String file2="C:\\Users\\shailendra.mishra\\Downloads\\Day-36.txt";
driver.findElement(By.xpath("//input[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);

}

}
