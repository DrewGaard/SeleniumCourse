package keyboardAndMouseExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionUsingSendKeysClass {
	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();

		// Call actions class
		Actions actions = new Actions(driver);

		// Check for frame in HTML Code
		// Check actions that need to enable the element where action is performed

		// First launch browser

		// Open URL
		driver.get("https://jqueryui.com/draggable/");

		//Select everything on the page
		actions.sendKeys(Keys.chord(Keys.CONTROL,"a")).perform();
	}
}
