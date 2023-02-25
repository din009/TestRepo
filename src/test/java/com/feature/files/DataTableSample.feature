Feature: Sample Scenarios for DataTable

  Scenario: Login into Adactin using asList
    Given Open Browser and pass Adacting URL
    When Enter the Username as List
      | Hari   |
      | Ganesh |
    And Enter the Password as List
      | hari123   |
      | ganesh123 |
    And Click Login button
    Then User logged into Adactin

  Scenario: Login into Adactin using asLists
    Given Open Browser and pass Adacting URL
    When Enter the Username as Lists
      | Dinesh  | Jayashree |
      | Kanmani | Mano      |
    And Enter the Password as Lists
      | dinesh123  | jaya123 |
      | kanmani123 | mano123 |
    And Click Login button
    Then User logged into Adactin

  Scenario: Login into Adactin using asMap
    Given Open Browser and pass Adacting URL
    When Enter the Username as Map
      | username | nitin |
    And Enter the Password as Map
      | password | nitin123 |
    And Click Login button
    Then User logged into Adactin

  Scenario: Login into Adactin using asMaps
    Given Open Browser and pass Adacting URL
    When Enter the User details as Maps
      | Username | Password   | Mail                 |
      | Ragu     | ragu123    | ragu123@gmail.com    |
      | Vinith   | vinith123  | vinith123@gmail.com  |
      | Vignesh  | vignesh123 | vignesh123@gmail.com |
    And Click Login button
    Then User logged into Adactin
