@navigationMenu
Feature: Navigation menu
    @nav-menu
  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When the user goes to "Fleet" "Vehicles"
    Then the url should be https://qa3.vytrack.com/entity/Extend_Entity_Carreservation


    @nav_menu
  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When the user goes to "Marketing" "Campaigns"
    Then the url should be https://qa3.vytrack.com/entity/Extend_Entity_Carreservation



  Scenario: user navigates to Vehicles sub-module
    Given the user is on the login page
    And the users enters the sales manager information
    When the user go to "Activities" "Calendar Events"
    Then the url should be https://qa3.vytrack.com/calendar/event




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



