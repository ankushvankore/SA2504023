Feature: Registration on Rediff

  Background: 
    Given Launch Rediff Registration Page

  Scenario: To validate registration process with valid data
    When Enter full name as "Ankush Vankore"
    When Enter rediff id as "ankushvankore123"
    When Enter password as "Ankush@123"
    When Retype password as "Ankush@123"
    When I Enter Birth date as
      |   29 |
      | JAN  |
      | 1979 |
    And Click on Check availablity
    Then Rediff id available message should display

  Scenario: To validate registration process with invalid data
    When Enter invalid full name as "Rahul Kumar"
    When Enter invalid rediff id as "rahulkumar"
    When Enter invalid password as "Rahul@123"
    When Retype invalid password as "Rahul@123"
    When Select Birth date as
      |   09 |
      | DEC  |
      | 2000 |
    And I Click on Check availablity
    Then Rediff id not available message should display
