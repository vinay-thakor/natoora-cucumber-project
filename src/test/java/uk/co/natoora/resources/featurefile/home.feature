Feature: Natoor page functionality
  As a user
  I want to navigate to Natoor website

  Scenario: User should navigate to events page successfully
    Given I am on home page
    And  I click on community link
    And I click on  events
    Then I should see events page
