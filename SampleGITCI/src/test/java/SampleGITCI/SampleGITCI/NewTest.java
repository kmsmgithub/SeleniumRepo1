package SampleGITCI.SampleGITCI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\Sruthi\\SeleniumDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
  @Test
  public void OpenPage() {
	  driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		  
  }
}
