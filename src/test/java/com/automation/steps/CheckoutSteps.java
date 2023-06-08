package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify user is on checkout page")
    public void verify_user_is_on_checkout_page() {
        checkoutPage.verifyCheckoutPage();
    }

    @When("user fill all shipping details")
    public void user_fill_all_shipping_details() {
        checkoutPage.fillShippingDetails();
    }

    @When("click on continue button")
    public void click_on_continue_button() {
        checkoutPage.clickOnContinueBtn();
    }
}