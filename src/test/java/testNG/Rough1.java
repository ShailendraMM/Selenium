package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Rough1 {
@Test
void method1() {
	System.out.println("method1");
}

@Test
void method2() {
	System.out.println("method2");
}

@Test
void method3() {
	String s="sunny";
	String x="abhi";
	SoftAssert sa=new SoftAssert();
//	Assert.assertEquals(s, x);
	
	sa.assertEquals(s, x);
	System.out.println("method3");
	sa.assertAll();
}

@Test ()
void method4() {
	System.out.println("method4");
}
}
