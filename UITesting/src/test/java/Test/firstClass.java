package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstClass extends BaseTest{

	
	WebDriver driver;
	@BeforeMethod
	public void InitWebDriver()
	
	{	
		driver=myDriver();
		
	}

	@Test
	public void testPass() {

		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		
		Assert.assertTrue(true, "This test will pass");
	}
	
	@AfterMethod
	public void CloseWD() {
		driver.close();
	}

	@Test
	public void testFail() {
		Assert.assertTrue(false, "This test will fail");
	}

	@Test
	public void testSkip() {
		throw new SkipException("This test is skipped");
	}

}
