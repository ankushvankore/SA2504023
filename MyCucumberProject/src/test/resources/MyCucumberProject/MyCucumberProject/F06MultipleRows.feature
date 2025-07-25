Feature: Multiple Rows

  Scenario: Demonstrate passing multiple rows
    Given Test page should open
    When I pass the data as follows
      | Sangeetha | M     | sangeetha@gmail.com | Kerala | 98989898989 |
      | Pooja     | Dubey | pooja@gmail.com     | Indore | 89898989898 |
    Then Registration should successful
