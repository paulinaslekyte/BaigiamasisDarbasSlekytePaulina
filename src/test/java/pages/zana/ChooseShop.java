package pages.zana;

import pages.Common;
import pages.Locators;

public class ChooseShop {
    public static void open() {
        Common.openUrl("https://zana.lt/parduotuves");
    }
    public static void clickAcceptCookies() {
        Common.clickElement(Locators.zana.ChooseShop.cookiesEnable);
    }
    public static void clickOnVilnius() {
        Common.clickElement(Locators.zana.ChooseShop.chooseVilnius);
    }

    public static String readEmail1() {
       return Common.getElementText(Locators.zana.ChooseShop.checkForVilnius1);
    }

    public static String readEmail2() {
        return Common.getElementText(Locators.zana.ChooseShop.checkForVilnius2);
    }

    public static String readEmail3() {
    return Common.getElementText(Locators.zana.ChooseShop.checkForVilnius3);}

    public static String readEmail4() {
    return Common.getElementText(Locators.zana.ChooseShop.checkForVilnius4);}

    public static String readEmail5() {
    return Common.getElementText(Locators.zana.ChooseShop.checkForVilnius5);}

}
