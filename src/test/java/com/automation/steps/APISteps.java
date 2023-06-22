package com.automation.steps;


import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class APISteps {
	@Given("user set up request for {string} end point")
	public void user_set_up_request_for_end_point(String endpoint) {
		RestAssuredUtils.setEndpoint(endpoint);
	}
	@When("user perform GET request")
	public void user_perform_get_request() {
		RestAssuredUtils.get();
	}
	@Then("verify status code is {int}")
	public void verify_status_code_is(int statusCode) {
		Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
	}

}
