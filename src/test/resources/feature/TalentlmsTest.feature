Feature: test Talentlms


  @Smoke
  Scenario:
    Given user is on "https://www.talentlms.com/" web page
    And user clicks on Login button
    Then user should see text
