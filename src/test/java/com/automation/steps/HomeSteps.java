package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        homePage.verifyHomePage();
    }

    @When("user click on add to cart button of first item")
    public void user_click_on_add_to_cart_button_of_first_item() {
        homePage.clickOnAddToCartBtnOfFirstProduct();
    }

    @When("click on cart icon")
    public void click_on_cart_icon() {
        homePage.clickOnCartIcon();
    }

    @When("user click on hamburger menu")
    public void userClickOnHamburgerMenu() {
        homePage.clickOnHamburgerIcon();
    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
        homePage.clickOnLogoutLink();
    }
}