package ChildBroGetWindoHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetWindoHandles {
	WebDriver driver;
	Set<String> Window;
	Iterator<String> itr;
	
	@Test
    public void handle() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		String url = "https://www.instagram.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Window = driver.getWindowHandles();
		itr = Window.iterator();
		String firstwindo = itr.next();
		System.out.println(firstwindo);
		
		WebElement TheCmp = driver.findElement(By.xpath("//a[@aria-label='Get it on Google Play']"));
		TheCmp.click();
		Window = driver.getWindowHandles();
		itr = Window.iterator();
		itr.next();
		String secndWindo = itr.next();
		System.out.println(secndWindo);
		driver.switchTo().window(secndWindo);
		
		WebElement GlassDoor = driver.findElement(By.xpath("//div[@class='KvNvKe'][3]//a"));
		GlassDoor.click();
		
		Window=driver.getWindowHandles();
		itr=Window.iterator();
		itr.next();
		itr.next();
		String ThirdWindo = itr.next();
		System.out.println(ThirdWindo);
		driver.switchTo().window(ThirdWindo);
		
		
		
		driver.switchTo().window(firstwindo);

		driver.close();
	
		
	}
	

}
