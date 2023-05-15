Feature: Dropdown Validations

  @StaticDropdown
  Scenario: To validate the static dropdown
    Given User Navigates to URL
    When User Handles the currency dropdown
    And User Extracts the dropdown value

  @DynamicDropdown
  Scenario: To validate the dynamic dropdown
    Given User Navigates to URL
    When User Handles the dynamic dropdown

  @Auto
  Scenario: Auto Suggestive
    Given User Navigates to URL
    When User handles the auto suggestive dropdown

  @MouseHower
  Scenario:  Mouse Action
    Given User Navigates to URL
    When User handles the mouse action

  @Frame
  Scenario: To handle the frame
    Given User Navigates to URL
    When Handle the frame

  @Table
  Scenario: Table
    Given  User Navigates to URL
    When Handles the table

