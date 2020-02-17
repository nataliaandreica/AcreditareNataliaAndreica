package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.CategoryPage;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.ProductGridPage;
import org.fastrackit.pages.ProductPage;
import org.junit.Assert;

public class CategorySteps {

    private ProductPage productPage;
    private HomePage homePage;
    private ProductGridPage productGridPage;
    private CategoryPage categoryPage;

    @Step
    public void goToAllProducts(){
        homePage.clickOnShopLink();

    }

    @Step
    public void clickOnProduct(){
        productGridPage.clickOnFirstProduct();
    }


    @Step
    public void checkHasCategoryMusic(){
        Assert.assertTrue(categoryPage.checkCategory());}
}
