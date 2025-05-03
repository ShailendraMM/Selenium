package testNG.POMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;

//1------------Constructor

 Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}

 
 //2-------------Locators
 
@FindBy(xpath ="//input[@placeholder='Username']") WebElement Userbox;
@FindBy(xpath="//input[@placeholder='Password']") WebElement Passbox;
@FindBy(xpath="//button[normalize-space()='Login']") WebElement submit;



//3------------ActionMethods

void setUsername(String User) {
	Userbox.sendKeys(User);
	}

void setPassword(String Pass) {
	Passbox.sendKeys(Pass);
    }

void clickSubmit(){
	submit.click();
    }
}
