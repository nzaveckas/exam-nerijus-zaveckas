package lt.techin.nz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement inputUsername;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(id = "passwordConfirm")
    WebElement inputPasswordConfirm;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement buttonSubmit;

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterPasswordConfirm(String password) {
        inputPasswordConfirm.sendKeys(password);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }
}
