package testNG.Grouping;

import org.testng.annotations.Test;

public class Signup {

	@Test(groups = "regression")
	void signUpbymail() {
		System.out.println("Grouping1...Signup by mail");
	}

	@Test(groups = "regression")
	void SignUPbyfb() {
		System.out.println("Grouping1...Signup by facebook");
	}

	@Test(groups = "regression")
	void signUpbytwitter() {
		System.out.println("Grouping1...Signup by twitter");
	}

	}


