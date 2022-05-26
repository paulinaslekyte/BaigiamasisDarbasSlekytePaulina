package pages.zana;

import pages.Common;
import pages.Locators;

public class Home {
    public static void open() {
        Common.openUrl("https://zana.lt/");
    }

    public static void clickAboutUs() {
        Common.clickElement(Locators.zana.Home.clickAboutUs);
    }

    public static String readMessageAboutUs() {
        return Common.getElementText(Locators.zana.Home.titleAboutUs);
    }

    public static void clickOnSearch() {
        Common.clickElement(Locators.zana.Home.searchOption);
    }

    public static void typeText() {
        Common.sendKeysToElement(Locators.zana.Home.searchOption, "puodelis");
    }

    public static void preesEnter() {
        Common.pressEnter(Locators.zana.Home.searchOption);
    }

    public static String foundPuodelisInAnyProductName() {
        return Common.getElementText(Locators.zana.Home.searchResults);
    }
}
