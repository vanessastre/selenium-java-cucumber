package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    
    private static String URL = "https://www.google.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
    
    // -------------------------------------------------------- Elements --------------------------------------------------------
    
	@FindBy(id = "hplogo")
    private WebElement logo;
    
    // -------------------------------------------------------- Methods ---------------------------------------------------------

    // Check if the page is loaded by verifying if the logo is displayed
    public void checkHomePage() {
        isElementDisplayed(logo);
    }

}
