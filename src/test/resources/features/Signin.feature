@Login
Feature: login functionality

  	@UI @Login
  Scenario: Check login is successful with valid credentials
    Given user is on youtube search page
    When user enters username "practicetesting666@gmail.com" and click next
    And user eneters password "testing666" and click next
    Then user is navigated to the home page

