@smoke
Feature: F01_Registration guest users could create new accounts

  #positive Scenario
  Scenario: user could create new account with valid data
    Given user go to registration page
    When user select gender type
    And user enter "automation" and "tester"
    And user select date of birth
    And user enter "test69@example.com"
    And user enter "7amo2apassword" password and confirm password
    And user click on register button
    Then  account is created successfully