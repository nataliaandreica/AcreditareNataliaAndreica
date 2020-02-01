package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductGridPage extends PageObject {

    @FindBy(css=".post-27 div:first-child img")
    private WebElementFacade firstProductImage;

    public void clickOnFirstProduct(){
        clickOn(firstProductImage);
    }

}
