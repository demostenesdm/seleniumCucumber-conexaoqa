Feature: Login in conexaoqa
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid credencials
    And hits submit
    Then the user should be logged in successfully