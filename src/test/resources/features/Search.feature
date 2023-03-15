@Search
Feature: feature to test youtube search functionality

Scenario: Validate youtube search is working
    Given I open the url "https://youtube.com/"
    And   the element "//input[@id='search']" not contains any text
    And I clear the inputfield "//input[@id='search']"
    And   I add "michelle yeoh" to the inputfield "//input[@id='search']"
    When  I press "//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']"
    Then  I expect that search content contains the text "//*[text()[contains(.,'Michelle Yeoh Accepts the Oscar for Lead Actress')]]"

