Feature: Verify Create Individual Account
  This feature verifies the sign-up process

  Background: Successful Initial Login
    Given I have opened the Browser
    Then I signup into the system
    Then I visit the deel dev url
    When I input the email
    Then I input the password
    And I click submit
    Then I am redirected to the create account page
    And I click the I'm an individual box
    And I click the next button
    Then I am redirected to the individual details page
    Then I enter the first name
      |Test|
    And I enter the last name
      |Contractor|
    And I select citizenship
      |Kenya|
    And I select the Country of tax residence
      |Kenya|


  Scenario: Invalid Date of Birth - Negative Test
    And I select the birth date
      |2021-04-29|
    And I select the legal status
    And I enter the personal Id
    And I enter the Tax ID
    And I select the timezone
    And I select the preferred default currency
    And I select the valid phone code
    And I enter the phone number
    And I enter the street address
    And I enter the city
    And I enter the zip code
    And I select the country
    And I click Complete Profile
    Then I should get the error message You must be at least 16 to use Deel

  Scenario: Empty street address - Negative Test
    And I select the birth date
      |2000-04-29|
    And I select the legal status
    And I enter the Tax ID
    And I select the timezone
    And I select the preferred default currency
    And I select the valid phone code
    And I enter the phone number
    And I enter the city
    And I enter the zip code
    And I select the country
    And I click Complete Profile
    Then I should get the error message Street is required
#
  Scenario: Successful user sign up - Positive Test
    And I select the birth date
      |2000-04-29|
    And I select the legal status
    And I enter the personal Id
    And I enter the Tax ID
    And I select the timezone
    And I select the preferred default currency
    And I select the valid phone code
    And I enter the phone number
    And I enter the street address
    And I enter the city
    And I enter the zip code
    And I select the country
    And I click Complete Profile
    Then I should be redirected to the home page

