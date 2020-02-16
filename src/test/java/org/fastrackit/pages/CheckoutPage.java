package org.fastrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;
    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;
    @FindBy(css = "#billing_address_1.input-text")
    private WebElementFacade streetAddressField;
    @FindBy(id = "billing_city")
    private WebElementFacade cityField;
    @FindBy(css = "#billing_postcode.input-text")
    private WebElementFacade postcodeField;
    @FindBy(id = "billing_phone")
    private WebElementFacade phoneNumberField;
    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;
    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade confirmationMessage;


    public void setFirstName(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setLastName(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setStreetAddress(String streetAddress) {
        typeInto(streetAddressField, streetAddress);
    }

    public void setCityField(String city) {
        typeInto(cityField, city);
    }

    public void setPostcodeField(String postcode) {
        typeInto(postcodeField, postcode);
    }

    public void setPhoneNumberField(String phoneNumber) {
        typeInto(phoneNumberField, phoneNumber);
    }

    public void clickOnPlaceOrderButton() {
        clickOn(placeOrderButton);
    }

    private String text = "Thank you. Your order has been received.";

    public boolean isCompleteeTheOrder() {
        return confirmationMessage.containsText(text);
    }

}
