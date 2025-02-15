package testNG;

import org.testng.annotations.Test;

public class SignUp {

	@Test(groups = "regression")
	void signUpbymail() {
		System.out.println("Signup by mail");
	}

	@Test(groups = "regression")
	void SignUPbyfb() {
		System.out.println("Signup by facebook");
	}

	@Test(groups = "regression")
	void signUpbytwitter() {
		System.out.println("Signup by twitter");
	}

	}


