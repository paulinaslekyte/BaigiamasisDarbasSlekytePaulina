package tests.zana;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import tests.BaseTest;

// Pries kiekviena dejau BethoreMethod, nes man testai pasileidzia tik tada, jei po testo naujai
// atsidariusia narsykle, isjungiu. Uztat reikia pries kiekviena testa det BethoreMethod, kad bendrai
// paleisti klases Home tris testus


public class Home extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.zana.Home.open();
        pages.zana.Home.acceptCookies();
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
        pages.zana.Home.typeTextAndPressEnter();
        String actualMessage = pages.zana.Home.foundPuodelisInAnyProductName();

        Assert.assertTrue(actualMessage.contains("puodelis"));
    }
}

