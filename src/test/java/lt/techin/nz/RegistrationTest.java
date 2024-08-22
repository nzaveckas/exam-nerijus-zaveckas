package lt.techin.nz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest{

    String username = "testas"+(int)(Math.random()*100+1);
    String password = "testas";

    @Test
    void testPositiveRegistration() {
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        loginPage.clickLinkCreateNewAccount();
        registrationPage.enterUsername(username);
        registrationPage.enterPassword(password);
        registrationPage.enterPasswordConfirm(password);
        registrationPage.clickButtonSubmit();
//        wait.until(d -> homePage.element2.isDisplayed());
        assertEquals("http://localhost:8080/skaiciuotuvas", driver.getCurrentUrl(), "URL is not as expected");

    }
}
