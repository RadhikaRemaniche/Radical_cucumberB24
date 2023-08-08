Feature: Validate get request

#changed uri1 because of the error "duplicate scenario in applicationUPStepDef " 
Scenario: 1.Validate demoQA up and running
	Given hit the URI2
	Then validate title "Learning JavaScript Design Patterns" and pages "254" of application 
	
	#for multiple values 
	Scenario: 2.Validate demoQA up and running
	Given hit the URI2
	Then validate value for "books[0].title" is "Git Pocket Guide"
	Then validate value for "books[2].isbn" is "9781449337711"
	Then validate value for "books[0].author" is "Richard E. Silverman"
	Then validate value for "books[0].publisher" is "O'Reilly Media"
	Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"

	
	Scenario: 3.Validate demoQA up and running
	Given hit the URI2
	Then validate value for attribute "title" is "Git Pocket Guide" present in response 
	Then validate value for attribute "author" is "Axel Rauschmayer" present in response 
	
