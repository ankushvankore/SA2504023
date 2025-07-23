Feature: Google Search

  Scenario: To validate search functionality on Google
    Given I Open Google
    When I enter keyword to search
    And Hit enter
    Then A valid search result should display
