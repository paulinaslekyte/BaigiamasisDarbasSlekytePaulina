package tests.randomorg;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Home extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.randomorg.Home.open();
    }

    @Test
    public void openBannedHostsPage() {
        String expectedMessage = "List of Banned Hosts";
        pages.randomorg.Home.clickWebTools();
        pages.randomorg.Home.clickBannedHosts();
        pages.randomorg.Home.open();
        String actualMessage= pages.randomorg.Home.readMessage();


        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
