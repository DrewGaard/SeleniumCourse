package handlingSeleniumElements;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementExample {
	
	@Test
	public void testingWebelementExample() {
		
		System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");
		
		driver.findElement(By.linkText("Home"));
	}
}
