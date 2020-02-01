package org.fastrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class DashboardPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade helloTextParagraph;

    public boolean checkHelloText(String text){
        return helloTextParagraph.containsOnlyText("Hello "+text+" (not "+text+"? Log out)");
    }

}


