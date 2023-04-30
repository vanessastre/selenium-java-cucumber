package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class TestOne extends TestBase {

	@BeforeTest
	public void setUpPage() {
	}
	
	@Test
	public void testTC01() {
		HomePage homePage = new HomePage(driver);
		homePage.checkHomePage();
	}
}
