package steps;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;
import runner.RunCucumberTest;

public class SignUpSteps {

    private WebDriver driver = RunCucumberTest.driver;
    private HomePage homePage = new HomePage(driver);
    private SignUpPage signUpPage = new SignUpPage(driver);


    @Given("User is on the home page")
    public void userIsOnHomePage() {
        homePage.checkHomePage();
    }

    @When("User clicks on the Create Account button")
    public void userClicksOnTheCreateAccountButton() {
        homePage.clickCreateAccount();
    }

    @When("User inputs {string}, {string}, {string}, {string}, and {string}")
    public void userInputsInformation(String firstName, String lastName, String email, String password, String confirmPassword) {
        signUpPage.inputFirstName(firstName);
        signUpPage.inputLastName(lastName);
        signUpPage.inputEmailAddress(email);
        signUpPage.inputPassword(password);
        signUpPage.inputPasswordConfirmation(confirmPassword);
    }

    @When("User clicks on the Create Account button again")
    public void userClicksOnTheCreateAccountButtonAgain() {
        signUpPage.clickCreateAccount();
    }

    @Then("User should be redirected to the dashboard page")
    public void userShouldBeRedirectedToTheDashboardPage() {

    }
}
