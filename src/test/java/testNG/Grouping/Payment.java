package testNG.Grouping;

import org.testng.annotations.Test;

public class Payment {
	
@Test(groups = {"regression","sanity"})
void rupee() {
	System.out.println("payment in rupee");
}

@Test(groups = {"regression","sanity"})
void dollers() {
	System.out.println("payment in dollers");
}
}
