package lt.techin.nz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PerformedOperationsPage extends BasePage{
    public PerformedOperationsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Skaičiuotuvas']")
    WebElement tabCalculator;

    @FindBy(xpath = "//*[text()='Atliktos operacijos']")
    WebElement tabPerformedOperations;

    @FindBy(css = "[onclick]")
    WebElement linkLogout;

    @FindBy(xpath = "//tr/td[1]")
    WebElement fieldFirstNumber;

    @FindBy(xpath = "//tr/td[2]")
    WebElement fieldOperator;

    @FindBy(xpath = "//tr/td[3]")
    WebElement fieldSecondNumber;

    @FindBy(xpath = "//tr/td[4]")
    WebElement fieldResult;

    @FindBy(xpath = "//*[text()='Keisti']")
    WebElement linkEdit;

    @FindBy(xpath = "//*[text()='Trinti']")
    WebElement linkDelete;

    @FindBy(xpath = "//*[text()='Rodyti']")
    WebElement linkShow;

    public String getLogText() {
        return fieldFirstNumber.getText()+fieldOperator.getText()+fieldSecondNumber.getText()+"="+fieldResult.getText();
    }

    public void clickLinkDelete() {
        linkDelete.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
