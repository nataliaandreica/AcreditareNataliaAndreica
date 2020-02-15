package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
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


   private String username = RandomStringUtils.randomAlphanumeric(10)+"@gmail.com";
   private String password = "123456855996654";

    @Test
    public void validRegisterTest() {
       registerSteps.navigateToHomepage();
       registerSteps.goToMyAccount();
       registerSteps.enterRegistrationCredentials( username,password);
       registerSteps.clickRegister();
    }
}


