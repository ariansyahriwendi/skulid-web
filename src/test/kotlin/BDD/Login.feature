@Login
Feature: Login
  As an user
  I want to login
  So that I can access my account

  @SuccessToLogin
  Scenario: Success To Login
    Given Account is created
    When I open website
    And I input username "student"
    And I input password "Password123"
    And I click submit
    Then Success to login