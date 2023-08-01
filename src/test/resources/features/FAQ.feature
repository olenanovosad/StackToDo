Feature: FAQ function
  Agile story: As a user i want to have access to FAQ page

  @US5
  Scenario: Verify FAQ function
    Given User is on main page
    When User clicks FAQ button
    Then User should see following message "Coming soon!"
    And Url should contain "faq"