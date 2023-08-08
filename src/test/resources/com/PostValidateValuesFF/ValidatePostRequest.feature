Feature: Validate POST request

#Scenario: 1. Validate you are able to create data in system
#Given post the data to create user 
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value 


#Scenario: 2. Validate you are able to create user from file
#Given post the data to create user from file
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value

#Scenario: 3. Validate you are able to create user from updated file with name field
#Given post the data to create user from file with updated name
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value

Scenario: 4. Validate you are able to create user from updated file with name field
Given post the data to create user from file with updated name fields
|name|
|mob|
Then validate status code is 201
Then validate id created for user with non null value
Then validate id created for user with non zero value


#Scenario: 5. Validate you are able to create data and validate date in response 
#Given post the data to create user from file with updated name
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value
#
#Scenario: 6. Validate you are able to create user with name as only number
#Given post the data to create user from file with updated name
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value
#
#Scenario: 7. Validate you are able to create user with name as only character  
#Given post the data to create user from file with updated name
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value
#
#Scenario: 8. Validate you are able to create user with name as character and special character 
#Given post the data to create user from file with updated name
#Then validate status code is 201
#Then validate id created for user with non null value
#Then validate id created for user with non zero value