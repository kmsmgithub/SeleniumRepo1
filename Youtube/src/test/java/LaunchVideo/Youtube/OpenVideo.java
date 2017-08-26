package LaunchVideo.Youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenVideo {
	public WebDriver driver;
	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\Sruthi\\SeleniumDrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
  @Test
  public void OpenPage() {
	  driver.get("http://www.youtube.com");  
						 
			System.out.println("Title is -"+driver.getTitle());	  
  }
}
