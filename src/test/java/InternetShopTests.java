import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InternetShopTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"); //capslock because it is constant
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]/a");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl1--index')]");
    private final String SECTION = "Mēbeles";

    @Test
    public void productPresenceInCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://1a.lv");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        //find element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);

        //click on this element
        acceptBtn.click();

        //Find necessary section
        WebElement menuBlock = browser.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM);

        boolean isSectionFound = false;
        for (WebElement we : items) {
            if (we.getText().equals(SECTION)) {
                wait.until(ExpectedConditions.elementToBeClickable(we));
                isSectionFound = true;
                we.click();
                break;
            }
        }
        Assertions.assertTrue(isSectionFound, "Section not found!");
    }

    //@Test
//    public void workingWithLists() {
//        List<String> names = new ArrayList<>();
//        names.add("Dmitry");
//        names.add("Laura");
//        names.add("Vitalijs");
//        names.add("Inna");
//        names.add("Anna");

    //-------------------FOR (if some specific conditions, e.g. add sth, each 2nd record, start from 3 etc)----------------------------

    //    from       to    stp
    //for (int i = 0; i < 4; i++) {  //i - i + 1 => i++
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("The name number " + (i + 1) + " is: " + names.get(i));
//        }
//        //-------------------FOR EACH--------------------------
//        for (String name : names) {
//            System.out.println(name);
//        }

//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.get(2));
}
