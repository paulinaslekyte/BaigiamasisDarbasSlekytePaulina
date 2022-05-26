package pages.zana;

import pages.Common;
import pages.Locators;

public class Login {
    public static void open() {
        Common.openUrl("https://zana.lt/prisijungimas?back=my-account");
    }
    public static void clickForgotPassword() {
        Common.clickElement(Locators.zana.login.buttonForgotPassword);
    }
    public static void typeEmail() {
        Common.sendKeysToElement(Locators.zana.login.emailFieldForForgotPassword,"miauroar@gmail.com");
    }
    public static void clickSendNewPassword() {
        Common.clickElement(Locators.zana.login.buttonSendNewPassword);

    }
    public static String readStatusOfSentPassword() {
        return Common.getElementText(Locators.zana.login.statusOfSentPassword);
    }
    public static void clickAcceptCookies() {
        Common.clickElement(Locators.zana.login.cookiesEnable);
    }

    public static void typeExistingEmail() {
        Common.sendKeysToElement(Locators.zana.login.emailInput, "miauroar@gmail.com");
    }

    public static void typeExistingPassword() {
        Common.sendKeysToElement(Locators.zana.login.passwordInput, "Testing123");
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.zana.login.loginButton);
    }
    public static String readMessage() {
        return Common.getElementText(Locators.zana.login.logoutButton);
    }

}
