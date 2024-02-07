package model;

import org.openqa.selenium.By;

public class HomeWorkLocators {
    // GOOGLE
    private By GOOGLE_SEARCH = By.xpath(".//textarea [@jsname ='yZiJbe']"); //google search input field
    //private By MORE_BTN - I don't have this btn
    private By TOOLS_BTN = By.xpath(".//div[@class = 'nfSF8e']"); //google tools btn
    private By GEAR_BTN = By.xpath(".//span[@class = 'z1asCe E9hVAb']"); // google gear icon
    private By GOOGLE_ACCOUNT_BTN = By.xpath(".//div[@class = 'gb_g gb_bb gb_Zf gb_H']"); //google Account BTN
    private By SEARCH_RESULTS = By.id("result-stats"); //google search results
    private By DOTS_BTN = By.xpath(".//span[@jsname = 'Bil8Ae']"); //google 3 dots menu
    private By ABOUT_INFO = By.xpath(".//div[@class = 'osrp-blk']");//google about info box

    //AMAZON
    private By AMZON_HOME_BTN = By.id("nav-logo-sprites"); // amazon home button
    private By AMAZON_SEARCH = By.id("twotabsearchtextbox"); // amazon search input
    private By AMAZON_ACCOUNT_BTN = By.id("nav-link-accountList-nav-line-1"); //amazon account btn
    private By SHOPPING_BASKET = By.xpath(".//div[@id = 'nav-cart-count-container']"); //amazon shopping basket
    private By ALL_MENU_BTN = By.id("nav-hamburger-menu"); //amazon all menu btn
    private By CAROUSEL_BTN = By.xpath(".//*[@class= 'a-icon a-icon-next-rounded']"); //amazon carousel btn
    private By DEAL_OF_DAY = By.xpath(".//div[@class = 'a-cardui deal-of-the-day']"); // amazon deal of the day

    //BOOKING
    private By BOOKNG_HOME_BTN = By.xpath(".//*[@data-testid='header-booking-logo']"); //booking home btn
    private By CURRENCY_BTN = By.xpath(".//*[@data-testid= 'header-currency-picker-trigger']"); //booking currency btn
    private By NOTIFICATION_BELL = By.xpath(".//div[@class ='a6066ac361']"); //booking notification bell
    private By USER_LEVEL = By.xpath(".//div[@class ='abf093bdfe a6a383700c']"); //booking User level
    private By AIRPORT_TAXIS_BTN = By.id("airport_taxis"); //booking airport taxis btn
    private By NAME_BANNER = By.xpath(".//*[@data-testid='herobanner-title1']"); //booking banner with name
    private By DATE_SELECTION = By.xpath(".//*[@data-testid='searchbox-dates-container']"); //booking date selection
    private By BOOKING_SEARCH_BTN = By.xpath(".//div[@class = 'e22b782521 d12ff5f5bf']"); // booking search btn
    private By TRAVELLING_FOR_WORK = By.xpath(".//*[@class='aca0ade214 aaf30230d9 c2931f4182 d79e71457a bd597ff2d8']"); //booking "I'm travelling for work"
    // private By COVID_SUPPORT - I don't have this banner
    private By RECENT_SEARCHES_SECTION = By.xpath(".//*[@class= 'bui-title__text' ]"); //booking recent searches section

    //1A
    //private By BUSINESS_OFFERS_BTN - I don't have this banner
    private By PICKUP_POINTS_BTN = By.xpath(".//i[contains(@class, 'icon-location')]"); //1a pickup points
    private By LANGUAGE_SWITCHER = By.xpath(".//*[@class= 'site-top__menu-right-item language-switcher']"); //1a language switcher
    private By MAIN_LOGO = By.xpath(".//*[@class='main-logo']"); //1a main logo
    private By SEARCH_ICON = By.xpath(".//*[@class ='main-search-submit']"); // 1a search icon
    private By CART_ICON = By.xpath(".//*[@class='cart-block__icon icon-svg']"); //1a cart icon
    private By SMARTNET_BTN = By.xpath(".//*[@class='smart-net-banner__logo']"); //1a smartnet btn
    private By GIFT_BTN = By.xpath(".//*[@src='/assets/smart_net/banner-icon-gift-a5f4be14455f68215791cf2fca3f688264cd5286c14ddb485388185484dbc715.svg']"); //1a gift btn
    private By CATALOGUE_BURGER = By.xpath(".//*[@class='main-menu__handle']"); //1a catalogue burger icon







}
