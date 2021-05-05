Feature: Hover over the button and the input field
  
  Background:
    Given A user navigates to the page
    

  Scenario: Hoverover the button
    Then  Hoverover the button
    Then Must hover over the ‘Hover me to see’ button

  Scenario: Hoverover the input field
    When Hoverover the input field
    Then Must hover over the ‘Hover me to see’ field