Feature: Select Id
  User Story: As a user I should be able to select Id option of from the vehicle

  @wip
  Scenario: Select Id functionality
    Given user is already logged in to the Home Page
    When user clicks on the Fleet dropdown
    And user clicks on the settings button and select Id option
    Then user should see the selected option
