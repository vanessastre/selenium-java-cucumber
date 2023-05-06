package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class TestOne extends TestBase {

	@BeforeTest
	public void setUpPage() {
	}
	
	@Test
	public void testTC01() {
		HomePage homePage = new HomePage(driver);
		homePage.checkHomePage();
		homePage.clickSignIn();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.inputName("roni_cost@example.com");
		loginPage.inputPassword("roni_cost3@example.com");

	}
}
