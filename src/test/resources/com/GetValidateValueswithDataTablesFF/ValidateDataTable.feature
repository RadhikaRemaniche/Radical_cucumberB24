Feature: Validate get request

	#for multiple values 
#	Scenario: 1.Validate demoQA up and running
#	Given hit the URI
#	Then validate value for "books[0].title" is "Git Pocket Guide"
#	Then validate value for "books[2].isbn" is "9781449337711"
#	Then validate value for "books[0].author" is "Richard E. Silverman"
#	Then validate value for "books[0].publisher" is "O'Reilly Media"
#	Then validate value for "books[1].title" is "Learning JavaScript Design Patterns"

		#Data Tables
	Scenario: 2.Validate demoQA up and running2
	Given hit the URI1
	Then validate value for below table
			| books[0].title 			| Git Pocket Guide										 |
			| books[2].isbn 			|9781449337711												 |
			|	books[0].author			|Richard E. Silverman									 |
			|	books[0].publisher	|O'Reilly Media												 |
			|	books[1].title			|Learning JavaScript Design Patterns	 |