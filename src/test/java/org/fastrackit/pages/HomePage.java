package org.fastrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = ".menu a[href*=\"id=7\"]")
    private WebElementFacade accountLink;

    @FindBy(css= "#menu-item-66 a[href]")
    private WebElementFacade shopLink;

    @FindBy(css = ".fa-shopping-cart")
    private  WebElementFacade shoppingCartLink;

    @FindBy(css=".fa-search")
    private WebElementFacade searchButton;



    public void clickOnShopLink(){
        clickOn(shopLink);
    }

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickCart(){
        clickOn(shoppingCartLink);
    }


    public void clickSearchButton(){clickOn (searchButton);}
}





