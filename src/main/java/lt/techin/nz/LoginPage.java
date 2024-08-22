package lt.techin.nz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Sukurti naują paskyrą']")
    WebElement linkCreateNewAccount;

    @FindBy(xpath = "//*[@name='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//*[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement buttonSubmit;

    public void clickLinkCreateNewAccount() {
        linkCreateNewAccount.click();
    }

    public void enterUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickButtonSubmit() {
        buttonSubmit.click();
    }
}
