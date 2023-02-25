Feature: LoginPage TestCases

  Scenario: Login with Valid Credentials
    Given Open Browser
    And Launch Adactin URL
    When Enter the Username "Muthulakshmi07"
    And Enter the Password "Viji@1703"
    And Click on Login button
    Then Validate User Logged successfully

  Scenario Outline: Login with different possibility of Credentials
    Given Open Browser
    And Launch Adactin URL
    When Enter the Username as "<username>"
    And Enter the Password as "<password>"
    And Click on Login button
    Then Validate User Logged successfully

    Examples: 
      | username | password   |
      | Ragu     | ragu123    |
      | Nithin   | nithin123  |
      | kanmani  | kanmani123 |
