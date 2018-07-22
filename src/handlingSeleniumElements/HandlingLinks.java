package handlingSeleniumElements;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {
	
	WebDriver driver = new ChromeDriver(); //Make global

	@Test
	public void testingWebelementExample() {
		

		driver.manage().window().maximize();

		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");

		//driver.findElement(By.linkText("About US")).click();
		clickOnLink("About US");
	}
	
	public void clickOnLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

}
