package keyboardAndMouseExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAtLocation {
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

		// Go to the frame where the elements to be utilized are located
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		// Find elements and perform actions
		WebElement draggableElement = driver.findElement(By.id("draggable"));

		// Drag and Drop
		
		actions.dragAndDropBy(draggableElement, 344, 171).perform();
	}
}
