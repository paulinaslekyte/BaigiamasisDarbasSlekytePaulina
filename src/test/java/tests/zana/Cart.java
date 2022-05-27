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
    public void addToCart() {
        String expectedMessage = "Prekė sėkmingai pridėta į krepšelį";
        pages.zana.Cart.chooseFirstPlate();
        pages.zana.Cart.addPlateToCart();
        String actualMessage = pages.zana.Cart.readStatusMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
