package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.steps.serenity.CartSteps;
import org.fastrackit.steps.serenity.CheckoutSteps;
import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void proceedWithCheckout(){
        loginSteps.login(Constants.USER_NAME,Constants.USER_PASS);
        cartSteps.goToAllProducts();
        cartSteps.clickOnProduct();
        cartSteps.addProducToCart();
        cartSteps.goToCart();
        checkoutSteps.clickProceedWithCheckout();
        checkoutSteps.enterBillingAddress(Constants.FIRST_NAME,Constants.LAST_NAME,Constants.STREET_ADDRESS,Constants.CITY_NAME,Constants.POST_CODE,Constants.PHONE_NUMBER);
        checkoutSteps.clickOnPlaceOrder();
        checkoutSteps.checkConfirmedOrder();
    }
}
