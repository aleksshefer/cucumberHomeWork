Feature: Belly

  Background:
    Given I have 42 cukes in my belly

    @scenarioOutline
  Scenario Outline: a few cukes
    When I wait "<time>" hour
    Then my belly should growl
    Examples:
      | time |
      | 0    |
      | 1    |
