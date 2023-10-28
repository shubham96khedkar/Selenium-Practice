Feature: Home page

  Background: Login
    Given Navigate to URL
    When Enter username and password and click on login button

# @Regression
  Scenario: Check home page
    When click on paid course
