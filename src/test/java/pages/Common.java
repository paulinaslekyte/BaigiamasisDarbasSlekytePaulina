package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Common {


    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
        return keys;
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }
    public static void waitForElementToVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void pressEnter(By locator) {
        WebElement element=getElement(locator);
        element.sendKeys(Keys.RETURN);

    }

}

