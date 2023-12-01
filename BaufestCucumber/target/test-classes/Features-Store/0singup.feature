#Author: Juan A. Ledesma
#Date: Nov, 2023
#Description: This feature has been created for testing purposes

@SmokeFeature
Feature: Test Sign Up of DemoBlaze store

  @SmokeTest
  Scenario: Verify Sign Up is successful with valid information
  	Given browser is open
    And user is on sign up page
    And user enters sign up username and password
    When user clicks on sign up button
    Then user is redirected to the home page