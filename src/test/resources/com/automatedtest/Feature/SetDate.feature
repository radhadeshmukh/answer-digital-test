Feature: Use the date picker to set the date to 1 month in the future



  Scenario Outline: Use the date picker to set the date to 1 month in the future
   Given A user navigates to HomePage
    When Must select a date using date picker from ‘Select Date’ field
    Then Date Must be 1 month from today’s date