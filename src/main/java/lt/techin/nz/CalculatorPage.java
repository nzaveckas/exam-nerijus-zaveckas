package lt.techin.nz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage{
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Skaičiuotuvas']")
    WebElement tabCalculator;

    @FindBy(xpath = "//*[text()='Atliktos operacijos']")
    WebElement tabPerformedOperations;

    @FindBy(css = "[onclick]")
    WebElement linkLogout;

    @FindBy(id = "sk1")
    WebElement inputFirstNumber;

    @FindBy(id = "sk2")
    WebElement inputSecondNumber;

    @FindBy(name = "zenklas")
    WebElement buttonOperation;

    @FindBy(xpath = "//*[@value='+']")
    WebElement optionPlus;

    @FindBy(xpath = "//*[@value='-']")
    WebElement optionMinus;

    @FindBy(xpath = "//*[@value='*']")
    WebElement optionMultiplication;

    @FindBy(xpath = "//*[@value='/']")
    WebElement optionDivision;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement buttonCalculate;

    public void clickTabCalculator() {
        tabCalculator.click();
    }

    public void clickTabPerformedOperations() {
        tabPerformedOperations.click();
    }

    public void clickLinkLogout() {
        linkLogout.click();
    }

    public void enterInputFirstNumber(int firstNumber) {
        inputFirstNumber.clear();
        inputFirstNumber.sendKeys(Integer.toString(firstNumber));
    }

    public void enterInputSecondNumber(int secondNumber) {
        inputSecondNumber.clear();
        inputSecondNumber.sendKeys(Integer.toString(secondNumber));
    }

    public void clickButtonOperation() {
        buttonOperation.click();
    }

    public void clickOptionPlus() {
        optionPlus.click();
    }

    public void clickOptionMinus() {
        optionMinus.click();
    }

    public void clickOptionMultiplication() {
        optionMultiplication.click();
    }

    public void clickOptionDivision() {
        optionDivision.click();
    }

    public void clickButtonCalculate() {
        buttonCalculate.click();
    }
}
