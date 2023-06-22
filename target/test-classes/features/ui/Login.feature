@ui
Feature: Validate login functionality
@Smoke
  Scenario: Verify user can logout
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page
    When user click on hamburger menu
    And click on logout link
    Then verify user is on login page

  Scenario: Verify user cannot login with invalid credentials
    Given user open website
    Then verify user is on login page
    When user login with username "invalid.login.user" and password "invalid.login.password"
    Then verify invalid login error message is displayed