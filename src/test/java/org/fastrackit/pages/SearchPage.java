package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {
    @FindBy(className= "search-field")
    private WebElementFacade searchField;

    @FindBy(className = "searchsubmit")
    private WebElementFacade seachSubmitButton;

    public void setSearchField(String text){
        clickOn(searchField);
        typeInto(searchField,text);
    }

    public void clickSearchSubmitButton(){
        clickOn(seachSubmitButton);
    }
}
