package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver myDriver()

	{

		WebDriverManager.chromedriver().setup();
		WebDriver WD = new ChromeDriver();
		return WD;

	}
	
	
}
