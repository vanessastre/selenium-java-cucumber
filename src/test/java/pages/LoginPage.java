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
    
    // -------------------------------------------------------- Methods ---------------------------------------------------------

    public void inputName(String email) {
        typeElement(emailField, email);
    }

}
