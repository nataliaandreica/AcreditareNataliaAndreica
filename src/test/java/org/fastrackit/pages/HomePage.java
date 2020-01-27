package org.fastrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = ".menu a[href*=\"id=7\"]")
    private WebElementFacade accountLink;


    // @FindBy(css = "a[title = 'Log In']")
    // private WebElementFacade loginLink;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    // public void clickOnLoginLink(){
    // clickOn(loginLink);
}





