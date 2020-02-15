package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.List;

public class ProductGridPage extends PageObject {

    @FindBy(css=".post-27 div:first-child img")
    private WebElementFacade firstProductImage;

    @FindBy(className = "orderby")
    private WebElementFacade topSortByDropdown;

    @FindBy(className = ".item-prod-wrap.wow:not(.sale)")
    private List<WebElementFacade> listOfProducts;


    public void clickOnFirstProduct(){
        clickOn(firstProductImage);
    }



    public void selectFromDropdown(String text) {
        topSortByDropdown.selectByVisibleText(text);
    }

    public boolean checkProductsPrices() {
        int priceCurrent;
        int priceNext;
        for (int i = 0; i <= listOfProducts.size() - 2; i++) {
            try {
                String priceI = listOfProducts.get(i)
                        .findBy(By.cssSelector(".item-prod-wrap.wow:not(.sale)"))
                        .getText().replace("lei", "").trim();
                priceCurrent = Integer.valueOf(priceI);

                String priceI2 = listOfProducts.get(i + 1)
                        .findBy(By.cssSelector(".item-prod-wrap.wow:not(.sale)"))
                        .getText().replace(",00 lei", "").trim();
                priceNext = Integer.valueOf(priceI2);

                System.out.println("INt de i : " + i);

                if (priceCurrent > priceNext) {
                    return false;
                }
            } catch (NoSuchElementException e) {
                continue;
            }
        }
        return true;
    }
}
