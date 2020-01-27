package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fastrackit.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void validRegisterTest() {
       registerSteps.navigateToHomepage();
        registerSteps.goToMyAccount();
        registerSteps.enterRegistrationCredentials("naty_16259@yahoo.com", "123456855996654");
        registerSteps.clickRegister();


    }
}


