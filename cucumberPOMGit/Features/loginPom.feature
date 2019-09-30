@functionalTest
Feature: Login functionality

  @SmokeTest
  Scenario: Login with Heroku App
    Given user is on HerokuApp
    When user enters username and password
    Then user logged in successfully
