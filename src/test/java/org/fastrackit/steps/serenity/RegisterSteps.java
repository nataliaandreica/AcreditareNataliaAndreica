package org.fastrackit.steps.serenity;

import net.thucydides.core.annotations.Step;

import org.fastrackit.pages.DashboardPage;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {


    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToMyAccount() {
        homePage.clickAccountLink();
    }

    @Step
    public void enterRegistrationCredentials(String emailRegistration, String passRegistration) {
        myAccountPage.setEmailFieldRegistration(emailRegistration);
        myAccountPage.setPassFieldRegistration(passRegistration);
    }
    @Step
    public void clickRegister(){
        myAccountPage.clickRegister();
    }

}

