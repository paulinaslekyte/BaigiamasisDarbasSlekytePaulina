package tests.zana;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import tests.BaseTest;

public class Login extends BaseTest {

    @BeforeMethod
    public void openUrl() {
        pages.zana.Login.open();
        pages.zana.Login.clickAcceptCookies();
    }

    @Test
    public void forgotPassword(){
        pages.zana.Login.clickForgotPassword();
        pages.zana.Login.typeEmail();
        pages.zana.Login.clickSendNewPassword();
        String message = pages.zana.Login.readStatusOfSentPassword();

        Assert.assertTrue(message.contains("miauroar@gmail.com"));
    }

    @Test
    public void loginWithValidData() {
        pages.zana.Login.typeExistingEmail();
        pages.zana.Login.typeExistingPassword();
        pages.zana.Login.clickLoginButton();
        String message = pages.zana.Login.readMessage();

        Assert.assertTrue(message.contains("Atsijungti"));

    }
}
