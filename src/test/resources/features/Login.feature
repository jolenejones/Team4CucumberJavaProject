
@SmokeScenario
Feature: login functionality
  @SmokeTest
  Scenario: Check login is successful with valid credentials
  
    Given is on login page
    When user enters username and password
    And clicks on login button 
    Then user is navigated to the home page

