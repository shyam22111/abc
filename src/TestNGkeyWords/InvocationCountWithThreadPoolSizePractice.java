package TestNGkeyWords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSizePractice {
	// parallel exicution time saves 
	
	
	
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
	}
	
	@Test (invocationCount = 5,threadPoolSize = 5)
	public void m2() {
		System.out.println("Method m2");
	}
	
	@Test
	public void m3() {
		System.out.println("Method m3");
	}

}
