package steps;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;
import runner.RunCucumberTest;

public class SignUp {

    private WebDriver driver = RunCucumberTest.driver;
    private HomePage homePage = new HomePage(driver);
    private SignUpPage signUpPage = new SignUpPage(driver);


    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        homePage.checkHomePage();
    }

    @When("User clicks on the Create Account button")
    public void user_clicks_on_the_create_account_button() {
        homePage.clickCreateAccount();
    }

    @When("User inputs {string}, {string}, {string}, {string}, and {string}")
    public void user_inputs_information(String firstName, String lastName, String email, String password, String confirmPassword) {
        signUpPage.inputFirstName(firstName);
        signUpPage.inputLastName(lastName);
        signUpPage.inputEmailAddress(email);
        signUpPage.inputPassword(password);
        signUpPage.inputPasswordConfirmation(confirmPassword);
    }

    @When("User clicks on the Create Account button again")
    public void user_clicks_on_the_create_account_button_again() {
        signUpPage.clickCreateAccount();
    }

    @Then("User should be redirected to the dashboard page")
    public void user_should_be_redirected_to_the_dashboard_page() {

    }
}
