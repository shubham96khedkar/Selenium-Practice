Feature: Login with multiple username and password

  Scenario Outline: Multiple login
    Given Navigate to URL
    When Enter usrename and password and click on login button
    Then User should land on homepage

    Examples: 
      | username              | password        |
      | abc                   | def             |
      | pqr                   | xyz             |
      | bddcucumber@gamil.com | BDDcucumber@123 |
