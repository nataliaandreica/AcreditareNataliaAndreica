package org.fastrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.fastrackit.steps.serenity.LoginSteps;
import org.fastrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;


    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validLoginTest(){
      loginSteps.navigateToHomepage();
      loginSteps.goToMyAccount();
      loginSteps.enterCredentials(Constants.USER_NAME,Constants.USER_PASS);
      loginSteps.clickLogin();
      loginSteps.checkLoggedIn(Constants.USER_NAME);
    }

   }

