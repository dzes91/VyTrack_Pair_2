Feature: Favorites
  User Story: As a user I should be able to add Vehicle Page to favorites and see it under "Favorites" module

  @wip
  Scenario: Add to Favorites Functionality
    Given user is already logged in to the Home Page
    When user clicks on the Fleet dropdown
    And user clicks on the star button
    Then user should see the page under Favorites module
