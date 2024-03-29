#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Skillrary demo app login

  Background: 
    Given I enter to login page

  Scenario: Login to Skillrary demo app with valid credentials
    When I provide valid credentials
    And I hit on login
    Then I should navigate to home page

  Scenario Outline: Login to Skillrary demo app with multiple credentials
    When I provide <username> nd <password>
    And I hit on login
    Then I should navigate to home page

    Examples: 
      | username | password |
      | admin    | admin    |
      | user     | user     |
      | abcdef   |   123456 |
