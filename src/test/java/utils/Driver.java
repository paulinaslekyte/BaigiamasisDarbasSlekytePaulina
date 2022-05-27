package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Constants;

public class Driver {
    private static ThreadLocal<WebDriver> driver= new ThreadLocal<>();

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("disable-blink-features=AutomationControlled");
//        options.addArguments("enable-automation");
//        options.addArguments("--no-sandbox");
        options.addArguments("start-maximized");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-browser-side-navigation");
//        options.addArguments("--remote-debugging-port=9222");
//        options.addArguments("--disable-gpu");
//        options.addArguments("headless");
        driver.set(new ChromeDriver(options));
        driver.get().manage().timeouts().implicitlyWait(Constants.TIMEOUT);

    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().quit();
        driver.remove();
    }
}
