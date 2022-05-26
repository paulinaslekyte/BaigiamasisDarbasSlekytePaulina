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
            public static By titleAboutUs = By.xpath("//*[@class='news-inner__title']");
            public static By searchOption = By.xpath("//*[@id='search_query_top']");
            public static By searchResults = By.xpath("//*[@id='search']//div[@class='products__item-title']//h3[contains(text(),'puodelis Kykyoto Ph')]");
        }
        public class login{
            public static By buttonForgotPassword = By.xpath("//*[@id='main']//a[@class='linkWithIcon']");
            public static By emailFieldForForgotPassword= By.xpath("//*[@class='mail' and @type='email' and @name='email']");
            public static By buttonSendNewPassword= By.xpath("//button[@type='submit']");
            public static By statusOfSentPassword= By.xpath("//*[@class='reminder-notification']");
            public static By emailInput=By.xpath("//input[@type='email']");
            public static By passwordInput=By.xpath("//input[@type='password']");
            public static By loginButton=By.xpath("//button[@class='btn green' and @type='submit' and @data-link-action='sign-in']");
            public static By cookiesEnable=By.xpath("//a[@class='cb-enable']");
            public static By logoutButton=By.xpath("//div[@class='logout-btnWrap']//a[@class='logoutButton']");

        }
    }
}