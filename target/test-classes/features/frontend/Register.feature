Feature: Register Account

  Scenario: Verify user register account
    Given user register account page
    When user register using valid email
    Then will navigate to my account page

  Scenario: Verify user register account using existing email
    Given user register account page
    When user register using existing email
    Then will show register is failed

