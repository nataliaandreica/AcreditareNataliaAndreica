package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.steps.serenity.CartSteps;
import org.fastrackit.steps.serenity.CategorySteps;
import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.steps.serenity.ProductSteps;
import org.fastrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CategoryTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private CategorySteps categorySteps;
    @Test
    public void checkCategoryAssigned() {
        loginSteps.login(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.goToAllProducts();
        cartSteps.clickOnProduct();
        productSteps.clickOnMusicCategory();
        categorySteps.checkHasCategoryMusic();
    }

}
