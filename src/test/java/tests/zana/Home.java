package tests.zana;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import tests.BaseTest;
import utils.TestListener;

public class Home extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.zana.Home.open();
    }

    @Test
    public void aboutUs() {
        String expectedMessage = "Apie mus";

        pages.zana.Home.clickAboutUs();
        String actualMessage = pages.zana.Home.readMessageAboutUs();

        Assert.assertEquals(actualMessage, expectedMessage);

    }


    @Test
    public void search() {
        pages.zana.Home.clickOnSearch();
        Common.sendKeysToElement(Locators.zana.home.searchOption, "puodelis");
        Common.pressEnter(Locators.zana.home.searchOption);
        String actualMessage = Common.getElementText(Locators.zana.home.searchResults);

        Assert.assertTrue(actualMessage.contains("puodelis"));
    }

    @Test
    public void getSubscription() {
        String message;
        message = Common.sendKeysToElement(Locators.zana.home.emailField, "miauroar@gmail.com");
        Common.clickElement(Locators.zana.home.confirmationButton);
        Common.clickElement(Locators.zana.home.pressGetNotifications);

        Assert.assertTrue(message.contains("@"));
    }
}
