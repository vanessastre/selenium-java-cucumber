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

}
