Feature: Login Feature

  Scenario Outline: User logs in with valid credentials
    Given user is on the login page
    When user enters username "<username>" and password "<password>"
    Then user should see the dashboard

    Examples:
      | username              | password              |
      | admin@covergo.com     | zVx*bV3Yh2zHJHJYdkwm  |

#   Scenario Outline: Invalid login scenarios
#   Given user is on the login page
#   When user enters username "<username>" and password "<password>"
#   Then user should see an error message "<errorMessage>"
#
#   Examples:
#     | username              | password   | errorMessage                       |
#     | admin@covergo.com     | 123        | Invalid username or password       |