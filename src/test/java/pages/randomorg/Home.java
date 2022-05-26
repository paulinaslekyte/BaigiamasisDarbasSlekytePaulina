package pages.randomorg;

import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;

public class Home {
    public static void open() {
        Common.openUrl("https://www.random.org/");
    }
    public static void clickWebTools() {
        Common.clickElement(Locators.randomorg.home.webTools);
    }
    public static void clickBannedHosts() {
        Common.clickElement(Locators.randomorg.home.bannedHosts);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.randomorg.home.listOfBannedHosts);
    }
}
