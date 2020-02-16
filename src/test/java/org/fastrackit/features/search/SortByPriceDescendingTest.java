package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.pages.HomePage;
import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.steps.serenity.SortProductsSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SortByPriceDescendingTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximiseWindow(){
        driver.manage().window().maximize();
    }

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private SortProductsSteps sortProductsSteps;

    @Steps
    private HomePage homePage;

    @Test
    public void checkSortByPriceFunction(){
        loginSteps.navigateToHomepage();
        homePage.clickOnShopLink();
        sortProductsSteps.sortByPriceI();
        sortProductsSteps.checkPriceDescending();
    }
}
