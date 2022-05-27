package tests.zana;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ChooseShop extends BaseTest {
    @BeforeMethod
    public void openLink() {
        pages.zana.ChooseShop.open();
        pages.zana.ChooseShop.clickAcceptCookies();
    }

    @Test
    public void chooseVilniusShop() {
        pages.zana.ChooseShop.clickOnVilnius();
        String expectedEmail = pages.zana.ChooseShop.readEmail1();
        Assert.assertTrue(expectedEmail.contains("vilnius"));

        expectedEmail = pages.zana.ChooseShop.readEmail2();
        Assert.assertTrue(expectedEmail.contains("vilnius"));

        expectedEmail = pages.zana.ChooseShop.readEmail3();
        Assert.assertTrue(expectedEmail.contains("vilnius"));

        expectedEmail = pages.zana.ChooseShop.readEmail4();
        Assert.assertTrue(expectedEmail.contains("vilnius"));

        expectedEmail = pages.zana.ChooseShop.readEmail5();
        Assert.assertTrue(expectedEmail.contains("vilnius"));

    }
}
