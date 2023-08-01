Feature: Sign Up function
  Agile Story: As a user, I want to be able to sign up

  @US1
  Scenario: Verify user can sign up
  Given User is on signUp page
    When User enters name "Clara" , email "f80utoy@kzccv.com" and password "1234567c"
    And User agrees to terms and condition
    And Clicks signUp button
    Then User should be taken to task page and url should contain "tasks"
