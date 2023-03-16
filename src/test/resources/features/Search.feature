@Search
Feature: feature to test youtube search functionality

  Scenario Outline: Validate youtube search is working
    Given browser is open
    And user is on youtube search page
    When user enters for <searchTerm> in search box
    And hits enter
    Then user is navigated to search results

    Examples: 
      | searchTerm    |
      | Michelle yeoh |
