Feature: This is a Selenium Demo using Cucumber

  Background:
    Given my browser is open

  Scenario: Google Search - Standard
    When I navigate to google
    And I search for selenium webdriver
    Then result stats would not be empty

  Scenario: Google Search - Params
    When I navigate to google
    And I search for "Selenium WebDriver"
    Then result stats would not be empty

  @Regression
  Scenario: Google Search - Data Table
    When I navigate to google
    And I search for the following text:
      | selenium
      | webdriver
      | automation
    Then result stats would not be empty


  Scenario Outline: Google Search - Examples
    When I navigate to google
    And I search for "<query>"
    Then result stats would not be empty

    Examples:
      | query                     |
      |    Saudi Digital Academy  |
      |    Test Automation        |

  @BetterGherkin
  Scenario: Google Search - Better Gherkin
    When I search for something
    Then result stats would not be empty