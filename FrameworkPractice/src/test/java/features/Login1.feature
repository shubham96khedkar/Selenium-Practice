Feature: Login

  Scenario: Login with correct credentials
    Given Navigate to the URL
    When Enter the username and password and click on loginbutton
    Then User should land on the homepage
