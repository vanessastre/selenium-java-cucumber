@signUp
Feature: User can create a new account

  Scenario Outline: User creates a new account with valid data
    Given User is on the home page
    When User clicks on the Create Account button
    And User inputs "<first_name>", "<last_name>", "<email_address>", "<password>", and "<password_confirmation>"
    And User clicks on the Create Account button
    Then User should be redirected to the dashboard page

    Examples:
      | first_name | last_name | email_address   | password  | password_confirmation |
      | Bota       | Bota      | bota1@gmail.com | Ab@123456 | Ab@123456             |
