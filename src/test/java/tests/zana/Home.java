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
}

//    @Test
//    public void search() {
//        String expectedMessage = "Puodelis";
//        pages.zana.Home.clickOnSearch();
//        Common.sendKeysToElement(Locators.zana.home.searchOption, "Puodelis");
//        Common.pressEnter(Locators.zana.home.searchOption);
//        String message = Common.getElementText(Locators.zana.home.searchResults);
//
//        Assert.assertEquals(message,expectedMessage);
//    }
//}
