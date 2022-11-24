package AssertionsTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
	
     	WebElement Webele;
     	WebDriver driver;
	
		@Test(priority = 1)
		public void equals() {
		// 1) equals
		String S="hi";
		String S1="hi";
	   Assert.assertEquals(S, S1);
		}
		
		@Test(priority = 2)
		public void NotEquals(){
		String S="hi";
		String S1="hio";
		Assert.assertNotEquals(S, S1);
			
		}
		
		@Test(priority = 3)
		public void True() {
		// isEnabled, isDisplayes, isSelected
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			String url ="https://www.nextdirect.com/in/en";
			
			driver.get(url);
			 Webele = driver.findElement(By.xpath("//div[text()='brands']"));
			
			Assert.assertTrue(Webele.isDisplayed());
			Assert.assertTrue(Webele.isEnabled());
//			Assert.assertTrue(Webele.isSelected());
			
		
		}
		
		@Test(priority = 4)
		public void False() {
			Assert.assertFalse(Webele.isSelected());
			driver.close();
			
		}
		
		@Test(priority = 5)
		public void Null() {
		String s = null;
		Assert.assertNull(s);
			
		}
		
		@Test(priority = 6)
		public void  notNull() {
		String s2="Shyam";
		Assert.assertNotNull(s2);
			
		}
		
		
}
