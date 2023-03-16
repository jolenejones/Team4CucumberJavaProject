@SmokeScenario 
Feature: login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials

    Given user is on log in page 
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page