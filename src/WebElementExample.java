import java.awt.Dimension;
import java.awt.Toolkit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver interface --> window interface
		
		//driver.manage().window().maximize();
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		int width = (int)tk.getScreenSize().getWidth();
		int height = (int)tk.getScreenSize().getHeight();
		
		//driver.manage().window().setSize(new Dimension(width, height));
		
		driver.get("http://www.google.com");

	}

}
