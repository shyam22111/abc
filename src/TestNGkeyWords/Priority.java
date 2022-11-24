package TestNGkeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {
	@BeforeClass
	public void openBrowser() {
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is close");
	}
	
	@Test(priority = 3)
	public void m1() {
		System.out.println("Method m1");
	}
	
	@Test(priority = 2)
	public void m2() {
		System.out.println("Method m2");
	}
	
	@Test(priority = 1)
	public void m3() {
		System.out.println("Method m3");
	}

}
