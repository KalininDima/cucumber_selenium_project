@navigationMenu
Feature: Navigation menu
  @nav_menu
  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When user navigates to Fleet module, Vehicle sub-module
    Then the url should be https://qa3.vytrack.com/entity/Extend_Entity_Carreservation
  @nav_menu
  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When user navigates to Marketing  module, Campaigns sub-module
    Then the url should be https://qa3.vytrack.com/campaign
  @nav_menu
  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When user navigates to Activities module, Calendar sub-module
    Then the url should be  https://qa3.vytrack.com/calendar/event




#  @Expected_Vehicle
#  Scenario: user navigates to Vehicles sub-module
#    Given user is logged in
#    When user navigates to Fleet module, Vehicle sub-module
#    Then verify expected url
#  @Expected_Campaigns
#  Scenario: user navigates to Vehicles sub-module
#    Given user is logged in
#    When user navigates to Marketing  module, Campaigns sub-module
#    Then verify expected url
#  @Expected_Calendar
#  Scenario: user navigates to Vehicles sub-module
#    Given user is logged in
#    When user navigates to Activities module, Calendar sub-module
#    Then verify expected url



