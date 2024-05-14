@TeacherLogin
Feature: Teacher Login
  As an user
  I want to login
  So that I can access my account

  @SuccessToTeacherLogin
  Scenario: Success To Teacher Login
    Given Account is created
    When I open website
    And I select user role teacher
    And I input username "081211111001"
    And I input password "Skulid123"
    And I click privacy policy
    And I click login
    Then Success to login