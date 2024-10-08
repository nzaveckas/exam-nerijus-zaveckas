package lt.techin.nz;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest{

    LoginPage loginPage;
    CalculatorPage calculatorPage;
    String username = "testas";
    String password = "testas";

//    Positive tests:

    @Tag("PositiveTest")
    @Test
    void testPositiveLogin() {
        loginPage = new LoginPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();

        assertEquals("http://localhost:8080/", driver.getCurrentUrl(), "URL is not as expected");
    }

    @Tag("PositiveTest")
    @Test
    void testPositiveLogout() {
        loginPage = new LoginPage(driver);
        calculatorPage = new CalculatorPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();
        calculatorPage.clickLinkLogout();

        assertEquals("http://localhost:8080/prisijungti?logout", driver.getCurrentUrl(), "URL is not as expected");
    }

//    Negative tests:

    @Test
    void testLoginWithEmptyFields() {
        loginPage = new LoginPage(driver);

        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickButtonLogin();

        assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.getErrorMessageText(), "Error message is not as expected");
    }

    @Test
    void testLoginWithEmptyUsername() {
        loginPage = new LoginPage(driver);

        loginPage.enterUsername("");
        loginPage.enterPassword(password);
        loginPage.clickButtonLogin();

        assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.getErrorMessageText(), "Error message is not as expected");
    }

    @Test
    void testLoginWithEmptyPassword() {
        loginPage = new LoginPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword("");
        loginPage.clickButtonLogin();

        assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.getErrorMessageText(), "Error message is not as expected");
    }

}
