package lt.techin.nz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest{
    LoginPage loginPage;
    RegistrationPage registrationPage;
    String username = "testas"+(int)(Math.random()*100+1);
    String password = "testas";

    @Test
    void testPositiveRegistration() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

        loginPage.clickLinkCreateNewAccount();
        registrationPage.enterUsername(username);
        registrationPage.enterPassword(password);
        registrationPage.enterPasswordConfirm(password);
        registrationPage.clickButtonSubmit();

        assertEquals("http://localhost:8080/skaiciuotuvas", driver.getCurrentUrl(), "URL is not as expected");

    }

//    Negative tests:

    @Test
    void testRegistrationWithEmptyFields() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

        loginPage.clickLinkCreateNewAccount();
        registrationPage.enterUsername("");
        registrationPage.enterPassword("");
        registrationPage.enterPasswordConfirm("");
        registrationPage.clickButtonSubmit();

        assertEquals("Šį laukelį būtina užpildyti\n"+"Privaloma įvesti nuo 3 iki 32 simbolių", registrationPage.getErrorMessageForUsernameText(), "Error message is not as expected");
        assertEquals("Šį laukelį būtina užpildyti\n"+"Privaloma įvesti bent 3 simbolius", registrationPage.getErrorMessageForPasswordText(), "Error message is not as expected");
    }
}
