Feature: Login feature

  Scenario Outline: Verify user login using invalid email
    Given user dashboard page
    When user login using email "<email>" and password "<password>"
    Then verify user can see login failed
    Examples:
      | email           | password |
      | random@mail.com | random |


  Scenario Outline: Verify user login using invalid account
    Given user dashboard page
    When user login using email "<email>" and password "<password>"
    Then verify user can see login failed
    Examples:
      | email | password |
      | Admin | Admin    |

  Scenario Outline: Verify user login using valid account
    Given user dashboard page
    When user login using email "<email>" and password "<password>"
    Then verify user can see login is success
    Examples:
      | email | password |
      | Admin | admin123 |