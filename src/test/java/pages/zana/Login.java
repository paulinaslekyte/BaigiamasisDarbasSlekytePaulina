package pages.zana;

import pages.Common;
import pages.Locators;

public class Login {
    public static void open() {
        Common.openUrl("https://zana.lt/prisijungimas?back=my-account");
    }
    public static void clickForgotPassword() {
        Common.clickElement(Locators.zana.Login.buttonForgotPassword);
    }
    public static void typeEmail() {
        Common.sendKeysToElement(Locators.zana.Login.emailFieldForForgotPassword,"miauroar@gmail.com");
    }
    public static void clickSendNewPassword() {
        Common.clickElement(Locators.zana.Login.buttonSendNewPassword);

    }
    public static String readStatusOfSentPassword() {
        return Common.getElementText(Locators.zana.Login.statusOfSentPassword);
    }
    public static void clickAcceptCookies() {
        Common.clickElement(Locators.zana.Login.cookiesEnable);
    }

    public static void typeExistingEmail() {
        Common.sendKeysToElement(Locators.zana.Login.emailInput, "miauroar@gmail.com");
    }

    public static void typeExistingPassword() {
        Common.sendKeysToElement(Locators.zana.Login.passwordInput, "Testing123");
    }

    public static void clickLoginButton() {
        Common.clickElement(Locators.zana.Login.loginButton);
    }
    public static String readMessage() {
        return Common.getElementText(Locators.zana.Login.logoutButton);
    }

}
