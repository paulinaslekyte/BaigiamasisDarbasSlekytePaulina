package tests.zana;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cart extends BaseTest {
    @BeforeMethod
    public void openLink() {
        pages.zana.Cart.open();
        pages.zana.Cart.clickAcceptCookies();
    }

    @Test
    public void addToCartAndCheck() {
        String expectedMessage = "Prekė sėkmingai pridėta į krepšelį";
        pages.zana.Cart.chooseFirstPlate();
        pages.zana.Cart.addPlateToCart();
        String actualMessage = pages.zana.Cart.readStatusMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

        pages.zana.Cart.continueShopping();
        pages.zana.Cart.clickOnCart();
        expectedMessage = "1 prekė";
        actualMessage = pages.zana.Cart.readCartMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
