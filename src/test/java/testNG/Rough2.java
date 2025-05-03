package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rough2 {
@BeforeTest
	void method1() {
		System.out.println("2.method1");
	}
@Test(priority = 2,dependsOnMethods = "method1",groups = {"sanity","regrassion"})
	void method2() {
		System.out.println("2.method2");
	}
@AfterTest
	void method3() {
		System.out.println("2.method3");
	}
@Test
void method4() {
	System.out.println("2.mthod4");
}
}
