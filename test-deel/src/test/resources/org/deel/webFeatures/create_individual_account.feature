Feature: Verify Create Individual Account
  This feature verifies the sign-up process

  Background: Successful Initial Login
    Given I have opened the Browser
    When I input the email
    Then I input the password
    And I click submit
    Then I am redirected to the create account page
    And I click the I'm an individual box
    And I click the next button
    Then I am redirected to the individual details page


  Scenario: Invalid Date of Birth
    Then I enter the first name
      |Jane|
    And I enter the last name
      |Doe|
    And I select the citizenship
      |Kenya|
    And I select the Country of tax residence
      |Kenya|
