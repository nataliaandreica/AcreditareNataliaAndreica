package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.CartPage;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.ProductPage;
import org.fastrackit.pages.ProductGridPage;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;
    private ProductGridPage productGridPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @Step
    public void goToAllProducts(){
        homePage.clickOnShopLink();

    }

    @Step
    public void clickOnProduct(){
        productGridPage.clickOnFirstProduct();
    }
    @Step
    public void addProducToCart(){
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkAddedToCart(){
        Assert.assertTrue(productPage.isAddedToCart());
    }
    @Step
    public void goToCart(){
        homePage.clickCart();
    }

    @Step
    public void emptyCart(){
        cartPage.removeProductsFromCart();

    }
}
