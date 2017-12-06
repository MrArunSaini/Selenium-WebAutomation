package testNGXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest()
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("login successfull");
	}
	
	@AfterTest()
	
	public void logout()
	{
		driver.close();
		System.out.println("logout successfull");
	}
	
	@Test
  public void checkTitle() {
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("hi");
	}

}
