@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    Given  user go to login page
    When user login with "test69@example.com" and "7amo2apassword"
    And user press on login button
    Then user login to the system successfully



  Scenario: user could not login with invalid email and password
   Given  user go to login page
    When user login with "te@gmail.com" and "7amo2apassword"
    And user press on login button
    Then user could not login to the system