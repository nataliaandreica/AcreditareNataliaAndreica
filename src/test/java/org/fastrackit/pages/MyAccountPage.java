package org.fastrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class MyAccountPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade emailRegistration;

    @FindBy (id="reg_password")
    private WebElementFacade passRegistration;

    @FindBy (css=".woocommerce-Button[name='register']")
    private WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-form-row input#username")
    private WebElementFacade emailField;

    @FindBy(css = ".woocommerce-form-row input#password")
    private WebElementFacade passField;

    @FindBy(css = ".woocommerce-Button[name='login']")
    private WebElementFacade loginButton;




    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }
    public void clickRegister(){ clickOn(registerButton ); }

    public void setEmailFieldRegistration(String emailFieldRegistration){
        typeInto(emailRegistration,emailFieldRegistration); }


    public void setPassFieldRegistration(String passFieldRegistration){
        typeInto(passRegistration,passFieldRegistration);    }
}

