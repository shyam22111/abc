package DummyProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeClass(alwaysRun = true)
    public void BrowserOpen() {
		System.out.println("Browser Opened");
		
	}
	@AfterClass(alwaysRun = true)
    public void BrowserClose() {
		System.out.println("Browser is closed");
		
	}
	
	@Test(groups = "functional")
	public void FrindList() {
		System.out.println("sucessfully clicked on friendlist");
		
	}
	@Test(groups = "smoke")
	public void massages() {
		System.out.println("sucessfully clicked on massages");
		
	}
	@Test(groups = "functional")
	public void Notificaion() {
		System.out.println("sucessfully clicked on notification");
		
	}
}
