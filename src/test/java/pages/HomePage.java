package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    
    private static String URL = "https://magento.softwaretestingboard.com/";

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(URL);
    }
    
    // -------------------------------------------------------- Elements --------------------------------------------------------
    
	@FindBy(className = "logo")
    WebElement logo;
    

    @FindBy(xpath = "//span[contains(text(),'What')]")
    WebElement whatsNewCategory;

    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement womenCategory; 

    @FindBy(xpath = "//span[contains(text(),'Men')]")
    WebElement menCategory; 

    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement gearCategory; 

    @FindBy(xpath = "//span[contains(text(),'Training')]")
    WebElement trainingCategory; 

    @FindBy(xpath = "//span[contains(text(),'Sale')]")
    WebElement saleCategory; 
    
    // -------------------------------------------------------- Methods ---------------------------------------------------------

    // Check if the page is loaded by verifying if the logo is displayed
    public void checkHomePage() {
        isElementDisplayed(logo);
    }

    public void clickWhatsNew() {
        clickElement(whatsNewCategory);
    }

    public void clickWomen() {
        clickElement(womenCategory);
    }

    public void clickMen() {
        clickElement(menCategory);
    }

    public void clickGear() {
        clickElement(gearCategory);
    }

    public void clickTraining() {
        clickElement(trainingCategory);
    }

    public void clickSale() {
        clickElement(saleCategory);
    }

}
