
@tag
Feature: Test the New Vehicle Module on Admin Portal
  I want to use this template for my feature file
  
  Background:
  Given I landed on the login page
  When I entered the Username <name> and Password <password>
  Then I am navigated to the "Dashboard" page on Admin Portal
  
     Examples: 
      | name                         | password |  
      | automationtest@opentrash.com | DMI@2022 |

  @tag1
  Scenario Outline: Navigate to New Vehicle Management Page
    Given I am on Dashboard page
    When I click on the New Vehicle Management Page
    Then I am navigated to the New Vehicle Management page

 
      
