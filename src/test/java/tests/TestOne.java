package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SignUpPage;

public class TestOne extends TestBase {

	@BeforeTest
	public void setUpPage() {
	}
	
	@Test
	public void testTC01() {
		HomePage homePage = new HomePage(driver);
		homePage.checkHomePage();
		homePage.clickCreateAccount();

		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.inputFirstName("Rodolfo");
		signUpPage.inputLastName("Perez");
		signUpPage.inputEmailAddress("rodo@gmail.com");

	}
}
