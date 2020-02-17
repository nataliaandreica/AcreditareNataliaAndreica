package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CategoryPage extends PageObject {

    @FindBy(css=".page-title")
    private WebElementFacade categoryName;



    private String text = "Music";
    public boolean checkCategory(){
        return categoryName.containsText(text);
    }

}
