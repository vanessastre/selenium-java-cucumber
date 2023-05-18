@signIn
Feature: Sign In

  Scenario Outline: User signs in with valid credentials
    Given User is on the home page
    When User clicks on the sign in button
    When User enters "<email>" in the email field
    And User enters "<password>" in the password field
    And User clicks the Sign In button
    Then User should be logged in successfully

    Examples:
      | email          | password   |
      | rodo@gmail.com | Ab@123456  |
