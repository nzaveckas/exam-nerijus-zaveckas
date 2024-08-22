package lt.techin.nz;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculationTest extends BaseTest{
    LoginPage loginPage;
    CalculatorPage calculatorPage;
    String username = "testas";
    String password = "testas";


//    Positive tests:

    @Tag("PositiveTest")
    @Test
    void testAddition() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(1);
        calculatorPage.enterInputSecondNumber(1);
        calculatorPage.clickOptionPlus();
        calculatorPage.clickButtonCalculate();

        assertTrue(driver.getPageSource().contains("1 +  1 = 2"), "Result is not as expected");
    }

    @Tag("PositiveTest")
    @Test
    void testSubtraction() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(1);
        calculatorPage.enterInputSecondNumber(1);
        calculatorPage.clickOptionMinus();
        calculatorPage.clickButtonCalculate();

        assertTrue(driver.getPageSource().contains("1 -  1 = 0"), "Result is not as expected");
    }

    @Tag("PositiveTest")
    @Test
    void testMultiplication() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(2);
        calculatorPage.enterInputSecondNumber(2);
        calculatorPage.clickOptionMultiplication();
        calculatorPage.clickButtonCalculate();

        assertTrue(driver.getPageSource().contains("2 *  2 = 4"), "Result is not as expected");
    }

    @Tag("PositiveTest")
    @Test
    void testDivision() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(4);
        calculatorPage.enterInputSecondNumber(2);
        calculatorPage.clickOptionDivision();
        calculatorPage.clickButtonCalculate();

        assertTrue(driver.getPageSource().contains("4 /  2 = 2"), "Result is not as expected");
    }

    //    Negative tests:

    @Test
    void testDivisionByZero() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(1);
        calculatorPage.enterInputSecondNumber(0);
        calculatorPage.clickOptionDivision();
        calculatorPage.clickButtonCalculate();

        assertTrue(driver.getPageSource().contains("There was an unexpected error (type=Internal Server Error, status=500)."), "Result is not as expected");
    }

}
