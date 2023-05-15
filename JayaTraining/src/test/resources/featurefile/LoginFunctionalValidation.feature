Feature: Validating the login page of Sales force application

  @RegessionTest @login
  Scenario: To validate the login functionality
    Given User Naviagte to Salesforce application
    When User enters the user name "Jaya" and password "123"
   # And User clicks the login button
    #Then User should navigate to home page

  @SmokeTest @RegessionTest @ErrorMessage
  Scenario: To validate the error message
    Given User Naviagte to Salesforce application
    When User enters the user name "Aravinth" and password "abc"
    And User clicks the login button
    Then user validate the error message

  Scenario Outline: To validate the error message with multiple data
    Given User Naviagte to Salesforce application
    When User enters the user name "<UserName>" and password "<Password>"
    And User clicks the login button
    Then user validate the error message

    Examples:
      |UserName|Password|
      |Aravinth|abc|
      |Raja|3456|
      |Jaya|yrur|



