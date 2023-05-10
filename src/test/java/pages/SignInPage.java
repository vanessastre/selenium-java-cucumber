package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    // -------------------------------------------------------- Elements --------------------------------------------------------

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(id = "send2")
    WebElement signInBtn;

    @FindBy(xpath = "//span[contains(text(), 'Forgot Your Password?')]")
    WebElement forgotPasswordTextLink;

    // -------------------------------------------------------- Methods ---------------------------------------------------------

    public void inputEmailAddress(String emailAddress) {
        typeElement(emailField, emailAddress);
    }

    public void inputPassword(String password) {
        typeElement(passwordField, password);
    }

    public void clickSignIn() {
        clickElement(signInBtn);
    }

    public void clickForgotPassword() {
        clickElement(forgotPasswordTextLink);
    }

}
