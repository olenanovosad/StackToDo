Feature: Login function
  Agile Story: As a user, I want to be able to log in

  @US2
  Scenario: Verify user can log in
    Given User is on login page
    When User enters valid email "rececor695@kkoup.com" and password "1234567c"
    And Clicks signIn button
    Then User should be taken to task page and url should contain "tasks"
    And user is logged out

  @US2.1
  Scenario Outline: Log in with invalid credentials
    Given User is on login page
    When user enters invalid email "<emails>"
    And user enters invalid password "<passwords>"
    And Clicks signIn button
    Then user should see message "Please Enter a valid Password"
    Examples:
      | emails          |  | passwords |
      | rececor65@k.com |  | 34f       |
      | ghgf@gmail.com  |  | 456       |