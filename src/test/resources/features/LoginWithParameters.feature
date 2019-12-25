Feature: Login as different users
  @wip
  Scenario: Login as a driver user
    Given the user is on the login page
    When user logs in using "user23" and "UserUser123"
    Then the user should be able to login
    And the title should contains "Dashboard"
  @wip
  Scenario: Login as a store manager user
    Given the user is on the login page
    When user logs in using "storemanager85" and "UserUser123"
    Then the user should be able to login
    And the title should contains "Dashboard"

