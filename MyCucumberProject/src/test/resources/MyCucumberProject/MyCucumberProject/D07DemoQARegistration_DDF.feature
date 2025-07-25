Feature: Registration process on DemoQA

  Scenario Outline: Validate registration process on DemoQA
    Given Launch DemoQA using link "https://demoqa.com/automation-practice-form"
    When Enter "<FirstName>" "<LastName>" "<EmailId>" and "<Gender>"
    When Select "<State>" and "<City>"
    Then Registration process is completed

    Examples: 
      | FirstName | LastName | EmailId            | Gender | State         | City   |
      | Aditya    | Singh    | aditya@gmail.com   | Male   | NCR           | Delhi  |
      | Rahul     | Kumar    | rahul@gmail.com    | Male   | Uttar Pradesh | Agra   |
      | Vrushali  | Sawarkar | vrushali@gmail.com | Female | Haryana       | Karnal |
