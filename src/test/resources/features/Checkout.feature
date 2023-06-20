Feature: Verify Checkout Functionality

  Scenario: Verify user can navigate back to homepage from checkout page
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on add to cart button of first item
    And click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user click on cancel button
    Then verify user is on cart page
    And user click on continue shopping button
    Then verify user is on home page


