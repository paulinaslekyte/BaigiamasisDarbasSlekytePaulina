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

    public static String resultOfSearch() {
        return Common.getElementText(Locators.zana.home.searchResults);
    }

    public static String readSearcMessage() {
        return Common.getElementText(Locators.zana.home.searchResults);
    }
}
