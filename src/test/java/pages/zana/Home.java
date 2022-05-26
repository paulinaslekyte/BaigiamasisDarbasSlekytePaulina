package pages.zana;

import pages.Common;
import pages.Locators;

public class Home {
    public static void open() {
        Common.openUrl("https://zana.lt/");
    }

    public static void clickAboutUs() {
        Common.clickElement(Locators.zana.home.clickAboutUs);
    }

    public static String readMessageAboutUs() {
        return Common.getElementText(Locators.zana.home.titleAboutUs);
    }

    public static void clickOnSearch() {
        Common.clickElement(Locators.zana.home.searchOption);
    }

    public static void typeText() {
        Common.sendKeysToElement(Locators.zana.home.searchOption, "puodelis");
    }

    public static void preesEnter() {
        Common.pressEnter(Locators.zana.home.searchOption);
    }

    public static String foundPuodelisInAnyProductName() {
        return Common.getElementText(Locators.zana.home.searchResults);
    }
}
