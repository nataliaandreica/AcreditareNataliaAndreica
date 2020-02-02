package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy (id = "billing_first_name")
    private WebElementFacade firstNameField;

    public void setFirstName (String firstName){
        typeInto(firstNameField, firstName);
    }

    @FindBy(id="billing_last_name")
    private WebElementFacade lastNameField;

    public void setLastName (String lastName){typeInto(lastNameField, lastName); }


    @FindBy(css="#billing_address_1.input-text")
    private WebElementFacade streetAddressField;

    public  void setStreetAddress (String streetAddress){typeInto(streetAddressField,streetAddress);}

    @FindBy(id ="billing_city")
    private WebElementFacade cityField;

    public  void setCityField (String city){typeInto(cityField,city);}

    @FindBy(css="#billing_postcode.input-text")
    private WebElementFacade postcodeField;

    public void setPostcodeField (String postcode) {typeInto(postcodeField,postcode);}

    @FindBy(id= "billing_phone")
    private  WebElementFacade phoneNumberField;

    public  void setPhoneNumberField (String phoneNumber){typeInto(phoneNumberField,phoneNumber);}

    @FindBy(id= "place_order")
    private WebElementFacade placeOrderButton;

    public void clickOnPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade confirmationMessage;

    private  String text = "Thank you. Your order has been received.";

    public boolean isCompleteeTheOrder(){
        return confirmationMessage.containsText(text);}

}
