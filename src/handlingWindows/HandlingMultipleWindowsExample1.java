package handlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleWindowsExample1 {
	@Test
	public void test() {

		WebDriver driver = new ChromeDriver();

		// Check for frame in HTML Code
		// Check actions that need to enable the element where action is performed

		// First launch browser

		// Open URL
		driver.get("https://www.google.com/services/#?modal_active=none");
		
		System.out.println(driver.getTitle()); //Print out the title of the window

		
		Set<String> numberofWindowsCount = driver.getWindowHandles();
		
		System.out.println(numberofWindowsCount.size() + " windows are currently open."); //Print out the number of open windows
		
		WebElement startNowButton = driver.findElement(By.xpath("//*[@id=\'hero\']/div[1]/div/div[1]/p[2]/a"));

		startNowButton.click();
		
		numberofWindowsCount = driver.getWindowHandles();
		
		System.out.println(numberofWindowsCount.size() + " windows are currently open."); //Print out the number of open windows

		Iterator<String> it = numberofWindowsCount.iterator();
		
		
		String parent = it.next(); //Parent Window
		String child = it.next();
		String windowToUse = it.next();
		
		
		driver.switchTo().window(windowToUse);
		System.out.println(driver.getTitle()); //Print out the title of the window
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\'identifierId\']"));
		
		email.sendKeys("Test@gmail.com");
	}
}
