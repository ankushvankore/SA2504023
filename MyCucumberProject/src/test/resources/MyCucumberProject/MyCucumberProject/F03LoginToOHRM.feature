Feature: Login functionality on OHRM

  Scenario: To validate login functionality on Orange HRM with valid data
    Given Launch Orange HRM site
    When I Enter valid userName
    When I Enter valid password
    And I Click on Login button
    Then Dashboard page should display

  Scenario: To validate login functionality on Orange HRM with invalid data
    Given Launch OHRM site
    When I Enter invalid userName
    When I Enter invalid password
    And Click on Login button
    Then Error message should display
