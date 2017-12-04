package sanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseHovers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.carmax.com");
		
		Actions builder = new Actions(driver);
		
		WebElement element = driver.findElement(By.partialLinkText("SELL YOUR CAR"));
		
		builder.moveToElement(element).build().perform();
		Thread.sleep(3333);
		
		driver.findElement(By.linkText("Schedule an Appraisal")).click();
	
	
	}

}
