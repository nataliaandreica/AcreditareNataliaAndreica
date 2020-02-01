package org.fastrackit.steps.serenity;


import net.thucydides.core.annotations.Step;
import org.fastrackit.pages.DashboardPage;
import org.fastrackit.pages.HomePage;
import org.fastrackit.pages.MyAccountPage;
import org.junit.Assert;

    public class LoginSteps {

        private DashboardPage dashboardPage;
        private HomePage homePage;
        private MyAccountPage myAccountPage;

        @Step
        public void navigateToHomepage(){
            homePage.open();
        }

        @Step
        public void goToLogin(){
            homePage.clickAccountLink();
            //  homePage.clickOnLoginLink();
        }

        @Step
        public void enterCredentials(String email, String pass){
            myAccountPage.setEmailField(email);
            myAccountPage.setPassField(pass); }

        @Step
        public void clickLogin(){
            myAccountPage.clickLogin(); }
        @Step
        public void goToMyAccount() {
            homePage.clickAccountLink();
        }

        @Step
        public void checkLoggedIn(String user){
            Assert.assertTrue(dashboardPage.checkHelloText(user));
        }

        @Step
        public void login(String user, String pass){
            navigateToHomepage();
            goToMyAccount();
            enterCredentials(user,pass);
            clickLogin();
            checkLoggedIn(user);
        }
    }

