package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.ProductGridPage;
import org.junit.Assert;

public class SortProductsSteps {

    private HomePage homePage;
    private ProductGridPage productGridPage;

    @Step
    public void goToAllProducts(){
        homePage.clickOnShopLink();

    }
    @Step
    public void sortByPopularity(){
        productGridPage.selectFromDropdown("Sort by popularity");
    }

    @Step
    public void sortByPrice(){
        productGridPage.selectFromDropdown("Sort by price: low to high");
    }
    @Step
    public void checkPriceAscending(){
        Assert.assertTrue(productGridPage.checkProductsPrices());
    }


}
