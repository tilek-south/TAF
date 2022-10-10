Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page
    Given Enter "mamatovtilek1" in userName or Email input field
    And Enter "1202nokia" in password input field
    When user clicks on Login button
    Then user should successfully logged in

    Scenario: Positive: Create new user
      Given user should click Add user button
      And verify following field names are displayed
        | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
      And enter following data to create new user
        | firstName | lastName | emailAddress     | userName | password |
        | Elon      | Musk     |musl@tesla.com    | elton    | 4545566daadas  |

