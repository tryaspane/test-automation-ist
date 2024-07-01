Feature: Register Account

  Scenario: Verify user register account
    Given user register account page
    When user register using valid email
    Then will navigate to my account page

