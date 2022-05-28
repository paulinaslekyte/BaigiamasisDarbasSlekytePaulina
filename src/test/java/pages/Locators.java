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

    public class zana {
        public class Home {
            public static By cookiesEnable = By.xpath("//a[@class='cb-enable']");
            public static By clickAboutUs = By.xpath("//*[@class='cms-page-link' and @href='https://zana.lt/turinys/about-us']");
            public static By titleAboutUs = By.xpath("//*[@class='news-inner__title']");
            public static By searchOption = By.xpath("//*[@id='search_query_top']");
            public static By searchResults = By.xpath("//*[@id='search']//div[@class='products__item-title']//h3[contains(text(),'puodelis Kykyoto Ph')]");
        }

        public class Login {
            public static By buttonForgotPassword = By.xpath("//*[@id='main']//a[@class='linkWithIcon']");
            public static By emailFieldForForgotPassword = By.xpath("//*[@class='mail' and @type='email' and @name='email']");
            public static By buttonSendNewPassword = By.xpath("//button[@type='submit']");
            public static By statusOfSentPassword = By.xpath("//*[@class='reminder-notification']");
            public static By emailInput = By.xpath("//input[@type='email']");
            public static By passwordInput = By.xpath("//input[@type='password']");
            public static By loginButton = By.xpath("//button[@class='btn green' and @type='submit' and @data-link-action='sign-in']");
            public static By cookiesEnable = By.xpath("//a[@class='cb-enable']");
            public static By logoutButton = By.xpath("//div[@class='logout-btnWrap']//a[@class='logoutButton']");

        }

        public class ChooseShop {
            public static By cookiesEnable = By.xpath("//a[@class='cb-enable']");
            public static By chooseVilnius = By.xpath("//*[@class='active' and @rel='tab1']/a[contains(text(),'Vilnius')]");
            public static By checkForVilnius1 = By.xpath("//*[@class='shopItem--data__mail']//a[contains(text(),'zana.vilnius@arkiete.lt')]");
            public static By checkForVilnius2 = By.xpath("//*[@class='shopItem--data__mail']//a[contains(text(),'zana.vilnius1@arkiete.lt')]");
            public static By checkForVilnius3 = By.xpath("//*[@class='shopItem--data__mail']//a[contains(text(),'zana.vilnius2@arkiete.lt')]");
            public static By checkForVilnius4 = By.xpath("//*[@class='shopItem--data__mail']//a[contains(text(),'vilnius@arkiete.lt')]");
            public static By checkForVilnius5 = By.xpath("//*[@class='shopItem--data__mail']//a[contains(text(),'zana.vilniusoutlet@arkiete.lt')]");
        }

        public class Cart{
            public static By cookiesEnable = By.xpath("//a[@class='cb-enable']");
            public static By addPlate= By.xpath("//a[@href='https://zana.lt/stalo-serviravimo-indai/lekste-zalsva-easy-life-drops-21cm' and @class='products__item-inner']");
            public static By addToCart= By.xpath("//*[@id='modalOpen']");
            public static By plateAddedMessage= By.xpath("//*[@class='statusMessage success']//p[contains(text(),'Prekė sėkmingai pridėta į krepšelį')]");
            public static By continueShopping = By.xpath("//*[@id='continue']");
            public static By buttonCart= By.xpath("//*[@id='_desktop_cart']");
            public static By cartContains1Plate= By.xpath("//*[@class='cart_total_items']");
        }
    }
}
