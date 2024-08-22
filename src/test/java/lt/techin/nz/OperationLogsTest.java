package lt.techin.nz;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationLogsTest extends BaseTest{

    LoginPage loginPage;
    CalculatorPage calculatorPage;
    PerformedOperationsPage performedOperationsPage;
    String username = "testas1";
    String password = "testas";


//    Positive tests:

    @Tag("PositiveTest")
    @Test
    void testLogOfAddition() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);
        performedOperationsPage = new PerformedOperationsPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.enterInputFirstNumber(1);
        calculatorPage.enterInputSecondNumber(1);
        calculatorPage.clickOptionPlus();
        calculatorPage.clickButtonCalculate();
        calculatorPage.clickTabPerformedOperations();

        assertEquals("1+1=2", performedOperationsPage.getLogText(),"Log is not as expected");

        performedOperationsPage.clickLinkDelete();
    }
}
