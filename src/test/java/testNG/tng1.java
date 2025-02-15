package testNG;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.PriorityBlockingQueue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class tng1 {
	
@Test(priority=1 )
void login() {
	System.out.println("this is the login method");
}

@Test(priority=2 , dependsOnMethods = "login()")
void search() {
	System.out.println("this is the search method");
}

@Test(priority=3 , dependsOnMethods = "login()")
void advsearch() {
	System.out.println("this is the advsearch method");
}
@Test(priority=4)
void logout() {
	System.out.println("this is the logout method");
}
}
