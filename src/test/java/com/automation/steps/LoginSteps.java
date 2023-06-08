package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void user_open_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        loginPage.verifyLoginPage();
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getProperty(usernameKey), ConfigReader.getProperty(passwordKey));
    }


    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
        loginPage.verifyInvalidLoginErrorIsDisplayed();
    }
}