package handlingSeleniumElements;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class DropDownElementExample {
	
	WebDriver driver = new ChromeDriver(); //Make global

	@SuppressWarnings("deprecation")
	@Test
	public void testingWebelementExample() {
		
		driver.manage().window().maximize();

		driver.get("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html");
		
		
		//Locate the element
		WebElement dropdownElement = driver.findElement(By.id("continents"));
		
		
		//Convert WebElement into a Select instance
		Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByVisibleText("Europe");
		
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Europe");
		
		//Find number of options available in dropdown
		int numberofOptions = dropdown.getOptions().size();
		
		Assert.assertEquals(numberofOptions, 7); //Expecting 7 options available
		
		//System.out.println(numberofOptions + " options are available for selection.");
		
	}
}
