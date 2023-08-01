Feature: Integration function
  Agile story: As a user i want to have access to integration page

  @US4
  Scenario: Verify integration function
    Given User is on main page
    When User clicks integration button
    Then User should see following message "Coming soon!"
    And Url should contain "integration"

