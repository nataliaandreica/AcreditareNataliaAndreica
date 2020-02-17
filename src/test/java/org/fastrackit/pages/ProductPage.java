package org.fastrackit.pages;

import com.paulhammant.ngwebdriver.ByAngularBinding;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy(className = "single_add_to_cart_button")
    private WebElementFacade addToCartButton;

    @FindBy(className = "woocommerce-message")
    private WebElementFacade confirmMessage;

    @FindBy (className = "posted_in")
    private WebElementFacade category;

    @FindBy (css=".woocommerce-breadcrumb a[href*='cat=music'")
    private WebElementFacade musicCategory;

    private String text = "has been added to your cart.";
    private String categoryMessage ="Music";
    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }
    public void clickMusicCategory(){
        clickOn(musicCategory);
    }
    public boolean isAddedToCart() {
        return confirmMessage.containsText(text);
    }
    public boolean hasACategory(){
        return category.containsText(categoryMessage);
    }
}
