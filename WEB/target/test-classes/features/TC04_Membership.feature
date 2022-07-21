Feature: MembershipUser
  As Admin
  I Want to see User with Membership
  So that I can see some membership informations

  Scenario: As Admin, I have be able the manage user page
    Given I am on dashboard page
    When I click membership user button
    Then i see membership user information