package com.automation.steps;

import com.automation.pages.ReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewSteps {

    ReviewPage reviewPage = new ReviewPage();

    @Then("verify user is on review page")
    public void verify_user_is_on_review_page() {
        reviewPage.printReviewPageDetails();
    }

    @When("user click on finish button")
    public void user_click_on_finish_button() {
        reviewPage.clickOnFinish();
    }
}