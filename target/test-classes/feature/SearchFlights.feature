@Test
Feature: Search Flights on MMT

  Scenario: Count number of flights
    Given user is on MMT page
    When user search for flights
    Then user verifies flight count