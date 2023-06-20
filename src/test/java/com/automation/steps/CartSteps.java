package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        cartPage.verifyPage();
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        cartPage.clickOnCheckoutBtn();
    }

    @When("user click on continue shopping button")
    public void userClickOnContinueShoppingButton() {
        cartPage.clickOnContinueShoppingBtn();
    }

    @And("verify more than one item is available on cart page")
    public void verifyMoreThanOneItemIsAvailableOnCartPage() {
        cartPage.verifyMoreThanOneItemInCart();
    }


}