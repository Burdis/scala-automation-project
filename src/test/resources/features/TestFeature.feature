@tag
Feature: Test feature

  Scenario: Test
#    Given I clear down the collection and add a record
#    And I close the connection
    When I navigate to http://www.google.co.uk
    Then I should be on the title Googleds