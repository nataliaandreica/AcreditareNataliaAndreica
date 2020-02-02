package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.CartPage;
import org.fastrackit.pages.CheckoutPage;
import org.junit.Assert;

public class CheckoutSteps {

    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void clickProceedWithCheckout(){
        cartPage.clickProceedToCheckoutButton();    }

    @Step
    public void enterBillingAddress(String firstName,String lastName, String streetAddress, String city, String postcode, String phoneNumber){
    checkoutPage.setFirstName(firstName);
    checkoutPage.setLastName(lastName);
    checkoutPage.setStreetAddress(streetAddress);
    checkoutPage.setCityField(city);
    checkoutPage.setPostcodeField(postcode);
    checkoutPage.setPhoneNumberField(phoneNumber);
    }

    @Step
    public void clickOnPlaceOrder(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void checkConfirmedOrder(){
        Assert.assertTrue(checkoutPage.isCompleteeTheOrder());
    }
}
