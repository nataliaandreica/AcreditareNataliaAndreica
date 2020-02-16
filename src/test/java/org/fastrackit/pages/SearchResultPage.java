package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchResultPage extends PageObject {

    @FindBy(className = "page-title")
    private WebElementFacade searchResultTest;

    public boolean checkSearchedText(String text) {
        return searchResultTest.containsOnlyText("Search Results for: " + text);
    }
}