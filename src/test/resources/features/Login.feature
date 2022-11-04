Feature: Login
  
  Scenario: As a user I can register using email
    Given The website "http://automationpractice.com" is opened using Chrome
    And I want to login
    When I try to register with email testresgister@gmail.com
    And I input mandatory fields