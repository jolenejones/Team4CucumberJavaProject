@Feedback
Feature: 

  @UI
  Scenario: 
    Given browser is open
    And user is on youtube search page
    When user clicks feedback
    And user enters feedback content and click send
    Then user should see "Report sent, thank you!" message
