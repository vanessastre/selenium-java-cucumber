package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // -------------------------------------------------------- Elements --------------------------------------------------------
    
	@FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;
    
    // -------------------------------------------------------- Methods ---------------------------------------------------------

    public void inputName(String email) {
        typeElement(emailField, email);
    }

    public void inputPassword(String password) {
        typeElement(passwordField, password);
    }

}
