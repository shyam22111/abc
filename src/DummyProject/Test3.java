package DummyProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeClass(alwaysRun = true)
    public void BrowserOpen() {
		System.out.println("Browser Opened");
	}
	@AfterClass(alwaysRun = true)
    public void BrowserClose() {
		System.out.println("Browser is closed");
	}
	@Test(groups = "functional")
	public void OpenSettings() {
		System.out.println("OpenSettings sucessfully");
	}
	@Test (groups = "functional")
	public void openPrivacyAndPolicy() {
		System.out.println("openPrivacyAndPolicy sucessfully ");
	}
	
	@Test(groups = {"smoke","regression","functional"})
	public void Loggedout() {
		System.out.println("sucessfully logged out");
	}

}
