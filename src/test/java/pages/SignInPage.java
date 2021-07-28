package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignInPage {

    private final SelenideElement accountDrop = $x("//span[contains(text(),'Sign In')]");
    private final SelenideElement signInButton = $x("//button[@data-at='sign_in_menu']");
    private final SelenideElement signInHeader = $x("//h2[contains(text(),'Sign in to Sephora')]");
    private final SelenideElement username = $("#signin_username");
    private final SelenideElement password = $("#signin_password");
    private final SelenideElement singInButton = $x("//button[@data-at='sign_in_button']");
    private final SelenideElement singOutButton = $x("//button[@data-at='sign_out_button']");


    public void openSignInForm(){
        accountDrop.click();
        signInButton.click();
        Assert.assertTrue(signInHeader.isDisplayed());
    }
    public void fillUsername(String user){
        username.sendKeys(user);
    }
    public void fillPassword(String pass){
        password.sendKeys(pass);
    }
    public void SignIn(){
        singInButton.click();
        Assert.assertFalse(singOutButton.isDisplayed());
    }
}
