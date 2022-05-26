package tests;
import org.testng.annotations.*;
import utils.Driver;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        Driver.setDriver();
    }

    @AfterMethod
    public void teardown() {
//        Driver.closeDriver();
    }
}

