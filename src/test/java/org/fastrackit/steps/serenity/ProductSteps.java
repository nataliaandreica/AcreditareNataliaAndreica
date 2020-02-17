package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.ProductGridPage;
import org.fastrackit.pages.ProductPage;
import org.junit.Assert;

public class ProductSteps {
    private ProductPage productPage;
    private HomePage homePage;
    private ProductGridPage productGridPage;

    @Step
    public void goToAllProducts(){
        homePage.clickOnShopLink();

    }

    @Step
    public void clickOnProduct(){
        productGridPage.clickOnFirstProduct();
    }
    @Step
    public void checkHasACategory(){
        Assert.assertTrue(productPage.hasACategory());
    }
    @Step
    public void clickOnMusicCategory(){
        productPage.clickMusicCategory();
    }
}
