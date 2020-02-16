package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.steps.serenity.CartSteps;
import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CartWithLoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCartTestWithLogin() {
        loginSteps.login(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.goToAllProducts();
        cartSteps.clickOnProduct();
        cartSteps.addProducToCart();
        cartSteps.checkAddedToCart();
        cartSteps.goToCart();
        cartSteps.emptyCart();

    }


}
