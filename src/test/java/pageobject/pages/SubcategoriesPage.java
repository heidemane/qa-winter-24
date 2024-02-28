package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriesPage {
    private final By SUBCATEGORY_NAME = By.xpath(".//span[@class = 'cat-title']");
    private final By SUBCATEGORY_PAGE_TITLE = By.tagName("h1");
    private BaseFunc baseFunc;

    public SubcategoriesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSubcategory(String subcategoryName) {

        boolean isSubcategoryFound = false;
        for (WebElement we : baseFunc.findElements(SUBCATEGORY_NAME)) {
            if (we.getText().equals(subcategoryName)) {
                baseFunc.scrollToElement(we);
                isSubcategoryFound = true;
                baseFunc.hardClick(we);
                break;
            }
        }

        Assertions.assertTrue(isSubcategoryFound, "Can't find subcategory" + subcategoryName);

        baseFunc.waitForText(SUBCATEGORY_PAGE_TITLE, subcategoryName);
    }
}
