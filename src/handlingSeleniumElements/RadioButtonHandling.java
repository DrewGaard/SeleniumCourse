package handlingSeleniumElements;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonHandling {

	@Test
	public void testingWebelementExample() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");

		WebElement radiobutton = driver.findElement(By.id("sex-1"));

		radiobutton.click();

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//WebElement radiobutton1 = driver.findElement(By.id("sex-0"));

		//radiobutton1.click();
		
		selectRadioButton("Male", driver);
	}
	
	
	public void selectRadioButton(String radioButtonValue, WebDriver driver) {
		//Locate radio button group
		
		List<WebElement> listofRadiobutton = driver.findElements(By.xpath("//input[contains(@id,'sex')]"));
		
		for(WebElement element : listofRadiobutton) {
			if(element.getAttribute("value").equals(radioButtonValue)) {
				element.click();
			}
		}
	}
}
