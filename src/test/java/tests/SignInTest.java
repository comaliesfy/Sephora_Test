package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.SignInPage;

import static com.codeborne.selenide.Selenide.open;
import static helpers.CsvFileReader.userMail;
import static helpers.CsvFileReader.userPassword;

public class SignInTest {
    SignInPage sip = new SignInPage();

    @Before
    public void start() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 3000;
        open("https://www.sephora.com/");
    }

    @Test
    public void siginInTest() {
        sip.openSignInForm();
        sip.fillUsername(userMail);
        sip.fillPassword(userPassword);
        sip.SignIn();
    }
}
