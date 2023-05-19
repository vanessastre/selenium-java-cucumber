package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignInPage;
import utils.RunCucumberTest;

public class SignInStep {

    private WebDriver driver = RunCucumberTest.driver;
    private HomePage homePage = new HomePage(driver);
    private SignInPage signInPage = new SignInPage(driver);

    @When("User clicks on the sign in button")
    public void userClicksOnSignInButton() {
        homePage.clickSignIn();
    }

    @When("User enters {string} in the email field")
    public void userEntersEmailAddress(String email) {
        signInPage.inputEmailAddress(email);
    }

    @When("User enters {string} in the password field")
    public void userEntersPassword(String password) {
        signInPage.inputPassword(password);
    }

    @When("User clicks the Sign In button")
    public void userClicksSignInButton() {
        signInPage.clickSignIn();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        homePage.checkWelcomeMsg();
    }
    
}
