Feature: Creating new user
  Scenario: Add new User
    Given  user on web
    Then user should see home page
    And user click Add user button to create new user
    Then user should see input fields
    And user create new user with mick data using faker