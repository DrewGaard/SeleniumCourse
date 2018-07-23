package handlingSeleniumElements;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	WebDriver driver = new ChromeDriver(); // Make global

	@Test
	public void testingWebelementExample() {

		driver.manage().window().maximize();

		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");

		//WebElement checkBox = driver.findElement(By.id("profession-1"));
		//checkBox.click();
		
		SelectingOrDeselectingCheckBox("Manual Tester");
		
		//Assert.assertTrue(checkBox.isSelected());
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//checkBox.click();
		
		//Assert.assertTrue(!checkBox.isSelected());

	}
	
	public void SelectingOrDeselectingCheckBox(String value) {

		List<WebElement> list = (List<WebElement>) driver.findElements(By.cssSelector("input[id*=profession]"));
		
		
		for(WebElement element : list) {
			if(element.getAttribute("value").equalsIgnoreCase(value)) {
				element.click();
				
				Assert.assertTrue(element.isSelected());
			}
		}
	}
}
