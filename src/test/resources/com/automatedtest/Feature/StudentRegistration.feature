Feature: Enter all details into the student registration form and submit

  Scenario Outline: Enter all details into the student registration form and submit
    Given A user navigates to Student Registration page
    When All mandatory details must be entered
    Then A picture must be uploaded
    And On success a popup will be displayed detailing all information entered
      | Student Name   | Radha Deshmukh |
      | Student Email  | \n             |
      | Gender         | Female         |
      | Mobile         |   123455676789 |
      | Date of Birth  | 05 June,2021   |
      | Subjects       | \n             |
      | Hobbies        | \n             |
      | Picture        | download.jpeg  |
      | Address        | \n             |
      | State and City | \n             |
    And Validation will be displayed on any mandatory fields that have not been entered correctly
