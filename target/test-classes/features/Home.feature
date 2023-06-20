Feature: Verify HomePage Functionality

  Scenario: Verify sorting functionality

    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user sorting the product by price - high to low
    Then verify products are displayed by price high to low
