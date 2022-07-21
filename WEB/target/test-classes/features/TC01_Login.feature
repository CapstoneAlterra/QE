Feature: Login
  As Admin
  I Want to see dashboard
  So that I can manage gym system

  Scenario Outline: As Admin, I have be able to success login
    Given I am on login page
    When I input valid email
    And  i input valid password
    And I click login button
    Then I am on the dashboard

  Scenario: As Admin, I have submit invalid data login
    Given I am on login page
    When I input invalid email
    And i input valid password
    And I click login button
    Then I can see error message

