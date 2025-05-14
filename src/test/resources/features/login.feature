Feature: Login Feature

  Scenario Outline: User logs in with valid credentials
    Given user is on the login page
    When user enters username "<username>" and password "<password>"
    Then user should see the dashboard

    Examples:
      | username | password  |
      | admin    | admin123  |
      | user1    | pass1     |
      | qauser   | test@123  |

  Scenario Outline: Invalid login scenarios
    Given user is on the login page
    When user enters username "<username>" and password "<password>"
    Then user should see an error message "<errorMessage>"

    Examples:
      | username | password   | errorMessage                     |
      | wrong    | wrongpass  | Invalid credentials              |
      | admin    |            | Password is required             |
      |          | admin123   | Username is required             |
      |          |            | Username and password required   |