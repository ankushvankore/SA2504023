Feature: Validate Google Title

  Scenario: To validate google title
    Given Open Google
    When Read the title
    Then Title should be Google
