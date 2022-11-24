package DummyProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	
	@BeforeTest(alwaysRun = true)
	public void DBopen() {
		System.out.println("DB opened");
		
	}
	@AfterTest(alwaysRun = true)
	public void DBclose() {
		System.out.println("DB closed");
		
	}
	@BeforeClass(alwaysRun = true)
    public void BrowserOpen() {
		System.out.println("Browser Opened");
	}
	@AfterClass(alwaysRun = true)
    public void BrowserClose() {
		System.out.println("Browser is closed");
	}
	
	@Test(groups = {"smoke","functional","regression"})
    public void Login() {
		System.out.println("Application Logged in sucessful");
	}
	@Test(groups = "functional")
    public void HomepageClick() {
		System.out.println("Sucessfully clicked on homepage");
		
	}
    

}
