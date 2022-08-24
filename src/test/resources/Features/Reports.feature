
Feature: future to test google search functionality

  Scenario: Verify google search is working
    Given Browser is open
    And user is on google search page
    When user enter a text in search box
    And hits enter
  Then user is navigate to search results

