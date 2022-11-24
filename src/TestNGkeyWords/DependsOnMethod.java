package TestNGkeyWords;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	// Dipi and Priya 2 innova and 1 Ena Timepass 
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test
	public void m1() {
		System.out.println("Method m1");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "m1")
	public void m2() {
		System.out.println("Method m2");
	}
	
	@Test(dependsOnMethods = {"m2","m1"})
	public void m3() {
		System.out.println("Method m3");
	}

}
