@api
Feature: Validate the functionality get booking api

  Scenario: Verify user can retrieve list of booking
    Given user set up request for "/booking" end point
    When user perform GET request
    Then verify status code is 200