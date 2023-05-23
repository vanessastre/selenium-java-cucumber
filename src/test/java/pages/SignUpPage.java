package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    // -------------------------------------------------------- Elements --------------------------------------------------------
    
	@FindBy(id = "firstname")
    WebElement firstNameField;

    @FindBy(id = "lastname")
    WebElement lastNameField;

    @FindBy(id = "email_address")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "password-confirmation")
    WebElement passwordConfirmationField;

    @FindBy(xpath = "//button[contains(@title,'Create an Account')]")
    WebElement createAccountBtn2;

    @FindBy(xpath = "//div[contains(text(),'Thank you for registering')]")
    WebElement thanksMsg;

    // -------------------------------------------------------- Methods ---------------------------------------------------------

    public void inputFirstName(String name) {
        typeElement(firstNameField, name);
    }

    public void inputLastName(String lastName) {
        typeElement(lastNameField, lastName);
    }

    public void inputEmailAddress(String emailAddress) {
        typeElement(emailField, emailAddress);
    }

    public void inputPassword(String password) {
        typeElement(passwordField, password);
    }

    public void inputPasswordConfirmation(String password) {
        typeElement(passwordConfirmationField, password);
    }

    public void clickCreateAccountBtn() {
        clickElement(createAccountBtn2);
    }

    public void checkThanksMsg() {
        isElementDisplayed(thanksMsg);
    }

}
