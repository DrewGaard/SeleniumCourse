package handlingSeleniumElements;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextField {

	WebDriver driver = new ChromeDriver(); // Make global

	@Test
	public void testingWebelementExample() {

		driver.manage().window().maximize();

		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");
		
		//Identify webelement
		WebElement textField = driver.findElement(By.name("firstname"));
		
		textField.clear();
		textField.sendKeys("Drew");
		
		
	}

}
