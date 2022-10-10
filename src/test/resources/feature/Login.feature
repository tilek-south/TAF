Feature: Login functionality

  Background: Land to Home page
    Given Go to login page

    @Smoke
    Scenario: Positive Login with valid credentials as Admin
      Given Enter "mamatovtilek1" in userName or Email input field
      And Enter "1202nokia" in password input field
      When user clicks on Login button
      Then user should successfully logged in

      @smoke
      Scenario: Positive: creating user
        Given Enter "mamatovtilek1" in userName or Email input field
        And Enter "1202nokia" in password input field
        When user clicks on Login button
        Then user should successfully logged in
        When user click add user button
        Then user should be in add user page
        And user should see following field names
        |First name|Last name|Email address|Username|Password|Bio|User type|Time zone|Language|


