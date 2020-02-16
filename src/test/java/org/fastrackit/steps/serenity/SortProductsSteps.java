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
    public void sortByPriceI(){
        productGridPage.selectFromDropdown("Sort by price: high to low");
    }

    @Step
    public void sortByPrice(){
        productGridPage.selectFromDropdown("Sort by price: low to high");
    }
    @Step
    public void checkPriceAscending(){
        Assert.assertTrue(productGridPage.checkProductsPricesLowToHigh());
    }
    @Step
    public void checkPriceDescending(){
        Assert.assertTrue(productGridPage.checkProductsPricesHighToLow());
    }


}
