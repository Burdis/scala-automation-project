@tag
Feature: Test feature

  Scenario: Test
    Given I clear down the collection and add a record
    And I close the connection
    When I navigate to https://www.google.co.uk
    Then I should see the page title Google