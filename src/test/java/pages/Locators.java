package pages;

import org.openqa.selenium.By;

public class Locators {
    public class home{
        public static By webTools= By.xpath("//*[@id='navigation']//a[contains(text(),'Web Tools')]");
        public static By bannedHosts= By.xpath("//*[@id='navigation']//a[contains(text(),'Banned Hosts')]");
        public static By listOfBannedHosts= By.xpath("//h2[contains(text(),'Banned Hosts')]");
    }

}
