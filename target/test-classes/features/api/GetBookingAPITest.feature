@api
Feature: Validate the functionality get booking api

  Scenario: Verify user can retrieve list of booking
    Given user set up request for "/booking" end point
    When user perform GET request
    Then verify status code is 200

  Scenario: Verify user can create a booking
    Given user set up request for "/booking" end point
    And set header value "Content-Type" to "application/json"
    And set body for the create booking request
    When user perform POST request
    Then verify status code is 200


  Scenario: Verify user can create a token
    Given user set up request for "/auth" end point
    And set header value "Content-Type" to "application/json"
    And set body for the create token request
    When user perform POST request
    Then verify status code is 200
    And verify response body has a token