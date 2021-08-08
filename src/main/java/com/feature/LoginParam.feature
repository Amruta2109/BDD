
@LoginParameter
Feature:jbk offline project

 Scenario Outline:login test1
    Given user should be on login page
    When  user enters "<uname>" and "<pass>"
    And   user clicks on login button  
    Then  user shpuld be o home page
   
Examples: 
      | uname  | pass | 
      | kiran@gmail.com   | 123456     | 
      | amruta@gmail.com  |  vvsghbsjn | 
      | reyansh@gmail.com |  fggg      | 
