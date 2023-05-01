package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public abstract class TestBase {
	
	public static WebDriver driver;

	@BeforeTest
	public abstract void setUpPage();

	@BeforeClass
	public void setUpDriver() {
		String browserName = System.getenv().getOrDefault("BROWSER", "chrome");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = getChromeDriver();
		} else {
			throw new UnsupportedOperationException("This TestBase only supports Chrome");
		}
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

	private ChromeDriver getChromeDriver() {
		String path = System.getProperty("user.dir");
		System.out.println(path); 
        String chromeDriverPath = path + "/src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		return new ChromeDriver();
	}
    
}