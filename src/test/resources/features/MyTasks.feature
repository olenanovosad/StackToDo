Feature: Tasks

  @US6
  Scenario:Deleting two or more tasks belonging to an user results in only one task being left displayed on the task table
    Given User is logged in
    And User have created 10 tasks
    When User deletes 2 or more tasks
    Then User sees only one task being displayed on task table