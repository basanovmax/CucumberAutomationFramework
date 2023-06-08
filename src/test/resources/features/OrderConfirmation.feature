Feature: Order Confirmation Tests

  Scenario: Verify user can place order
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on add to cart button of first item
    And click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fill all shipping details
    And click on continue button
    Then verify user is on review page
    When user click on finish button
    Then verify user is on order confirmation page