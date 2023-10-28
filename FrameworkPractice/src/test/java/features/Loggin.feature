Feature: Login

# @Smoke 
  Scenario: Login with correct credentials
    Given Navigate to URL
    When Enter username and password and click on login button
    Then User should land on homepage
    
#@Regression
  Scenario: Login with wrong credentials
   Given Navigate to URL
    When Enter incorrect username and password and click on login button
    Then User should land on homepage and verify Url
