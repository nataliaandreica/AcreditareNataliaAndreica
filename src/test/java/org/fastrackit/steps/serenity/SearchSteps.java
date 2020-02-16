package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;

import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.SearchPage;
import org.fastrackit.pages.SearchResultPage;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private SearchPage searchPage;
    private SearchResultPage searchResultPage;

    @Step
    public void clickOnSearchButton(){
        homePage.clickSearchButton();
    }
    @Step
    public void searchForProduct(String text){
              searchPage.setSearchField(text);}

    @Step
    public void clickOnSearchSubmitButton(){
        searchPage.clickSearchSubmitButton();
    }

    @Step
    public void checkSearchedItem(String text){
        Assert.assertTrue(searchResultPage.checkSearchedText(text));
    }
}
