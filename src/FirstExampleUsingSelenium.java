import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExampleUsingSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Drew\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		System.out.println("Creating a gitignore file and adding to it.");
	}

}
