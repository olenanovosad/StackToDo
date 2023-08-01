Feature: Calendar function
  Agile story: As a user i want to have access to calendar page

  @US3
  Scenario: verify calendar function
    Given User is on main page
    When User clicks calendar button
    Then User should see following message "Coming soon!"
    And Url should contain "calendar"
