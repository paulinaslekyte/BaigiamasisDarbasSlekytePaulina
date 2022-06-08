package pages.zana;

import pages.Common;
import pages.Locators;

public class Cart {
    public static void open() {
        Common.openUrl("https://zana.lt/lekstes");
    }

    public static void clickAcceptCookies() {
        Common.clickElement(Locators.zana.Cart.cookiesEnable);
    }

    public static void addPlateToCart() {
        Common.clickElement(Locators.zana.Cart.addToCart);
    }

    public static void chooseFirstPlate() {
       Common.clickElement(Locators.zana.Cart.addPlate);
    }

    public static String readStatusMessage() {
       return Common.getElementText(Locators.zana.Cart.plateAddedMessage);
    }

    public static void continueShopping() {
        Common.clickElement(Locators.zana.Cart.continueShopping);
    }

    public static void clickOnCart() {
        Common.clickElement(Locators.zana.Cart.buttonCart);
    }

    public static String readCartMessage(){
        return Common.getElementText(Locators.zana.Cart.cartContains1Plate);
    }
}
