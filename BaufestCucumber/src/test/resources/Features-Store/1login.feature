#Author: Juan A. Ledesma
#Date: Nov, 2023
#Description: This feature has been created for testing purposes

@SmokeFeature
Feature: Test Login of DemoBlaze store

  @SmokeTest
  Scenario: Verify user can add a new item to cart
  	Given browser is open
    And user is on login page
    And user enters login username and password
    When user clicks on login button
    Then user is redirected to the home page
