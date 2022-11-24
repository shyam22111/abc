package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowser {
	WebDriver driver;
     
	 
	 @Parameters("Browser")
	 @Test(priority = 1)
	 public void CrossBro(String Browser) {
		 
		 if(Browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			  driver = new ChromeDriver();
		 } else if (Browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver", "C:\\chromedriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		} else {
			System.out.println("webdriver not fond");
		}
		 
		 driver.get("https://en-gb.facebook.com/login/");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	 @Test(priority = 2)
	 public void getCurrentUrl() {
		 Assert.assertEquals(driver.getCurrentUrl(), "https://en-gb.facebook.com/login/");
	 }
	 
	 @Test(priority = 3)
	 public void verifyPageTitle() {
		 Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
	 }
	 
	 @Test(priority = 4)
	 public void username() {
		 WebElement usernamefield = driver.findElement(By.xpath("//input[@id='email']"));
		 Assert.assertTrue(usernamefield.isDisplayed());
		 usernamefield.sendKeys("shyam");
	 }
	 
	 @Test(priority=5)
	 public void assword() {
		 WebElement passfield = driver.findElement(By.xpath("//input[@id='pass']"));
		 Assert.assertTrue(passfield.isDisplayed());
		 passfield.sendKeys("shyam@123");
	 }
	 
	@ Test(priority = 6)
	public void click() {
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		Assert.assertTrue(btn.isEnabled());
		btn.click();  
		driver.close();
	}
	

	
}
