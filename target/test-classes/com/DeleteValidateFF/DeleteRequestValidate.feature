Feature: Validate the delete request 


Scenario: 1.Validate you are able to create user and delete the user
    Given post the data to create user from file with updated fields
    |name|
    Then validate status code is "201"
    Then validate id created for user with non null value 
    Then validate id created for user with non zero value
    When delete the user from system 
    Then validate user deleted from system
    
    
    
    