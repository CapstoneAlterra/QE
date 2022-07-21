Feature: ClassOffline
  As Admin
  I Want to go manage offline class page
  So that I can manage about class offline

  Scenario: As Admin, I have be able see the list of class
    Given I am in dashboard page
    When I click class offline manage page button
    Then i see the list of offline class
