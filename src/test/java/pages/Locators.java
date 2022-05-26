package pages;

import org.openqa.selenium.By;

public class Locators {
    public class randomorg {
        public class home {
            public static By webTools = By.xpath("//*[@id='navigation']//a[contains(text(),'Web Tools')]");
            public static By bannedHosts = By.xpath("//*[@id='navigation']//a[contains(text(),'Banned Hosts')]");
            public static By listOfBannedHosts = By.xpath("//h2[contains(text(),'Banned Hosts')]");
        }

    }

    public class zana{
        public class home {
            public static By clickAboutUs = By.xpath("//*[@class='cms-page-link' and @href='https://zana.lt/turinys/about-us']");
            public static By titleAboutUs= By.xpath("//*[@class='news-inner__title']");
            public static By searchOption= By.xpath("//*[@id='search_query_top']");
            public static By searchResults=By.xpath("//*[@id='search']//div[@class='products__item-title']//h3[contains(text(),'puodelis Kykyoto Ph')]");
        }
    }
}