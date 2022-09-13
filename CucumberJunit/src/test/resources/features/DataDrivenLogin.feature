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
@tag
Feature: login with multiple credentials
 
  @tag1
  Scenario: login
  Scenario Outline: login is sucessfull with valid credentials
   
   #Given user launch browser
    When  user opens URL "https://opensource-demo.orangehrmlive.com/"
    And   user enter "<username>" and "<password>" 
    And   login should be successful
    And  user clicks on user dropdown and on logout button
 # Then close browser
   Examples: 
      |  username   | password  | 
      | name2       | dfh7      |
      |Admin        | admin123   | 
   