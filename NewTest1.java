package testNGXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest1 
{
	WebDriver driver;
	
	/*@BeforeClass()
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("login successfull");
	}
	
	@AfterClass()
	
	public void logout()
	{
		driver.close();
		System.out.println("logout successfull");
	}
*/	
	@Test
  public void checkTitle() {
		driver.get("https://www.gmail.com");
		Assert.assertEquals(driver.getTitle(), "Gmail");
  }
	
	
}
