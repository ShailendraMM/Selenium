package testNG;

import org.testng.annotations.Test;

public class Login {
	
@Test(groups = "sanity")
void loginbymail() {
	System.out.println("log in by mail");
}

@Test(groups = "sanity")
void loginbyfb() {
	System.out.println("log in by facebook");
}

@Test(groups = "sanity")
void loginbytwitter() {
	System.out.println("log in by twitter");
}

}
