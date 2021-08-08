@Login
Feature: jbk offline website

  Scenario: login test
    Given user should be on login page
    When  user enters unames and pass
    And   user clicks on login button  
    Then  user shpuld be o home page
   
    Scenario: logo test
    Given user should be on login page
    When  user should see jbk logo

   
 

    