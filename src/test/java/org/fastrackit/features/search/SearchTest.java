package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.steps.serenity.SearchSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Before
    public void maximiseWindow(){
        driver.manage().window().maximize();
    }

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void cheackSearchFunction(){
        loginSteps.navigateToHomepage();
        searchSteps.clickOnSearchButton();
        searchSteps.searchForProduct("album");
        searchSteps.clickOnSearchSubmitButton();
        searchSteps.checkSearchedItem("album");
    }
}
