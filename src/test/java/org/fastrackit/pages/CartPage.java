package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends PageObject {

    @FindBy(className = "remove")
    private List<WebElementFacade> removeButtons;

    public void removeProductsFromCart() {
        for (int i = 0; i < removeButtons.size(); i++) {
            removeButtons.get(i).click();
        }
        waitABit(5000);
    }


    @FindBy(css = ".checkout-button")
    private WebElementFacade proceedToCheckoutButton;

    public void clickProceedToCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }

}