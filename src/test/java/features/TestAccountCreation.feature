Feature: Account creation 

# language: EN and CURRENCY: USD
Background: 
	Given I am on the login page 
	And  language used is English 
	And  Currency is USD 
	
Scenario Outline: Account creation 
	Given I am in Sign Up page 
	When I enter valid "<useremail>" 
	And click on “GET STARTED” button 
	And I enter valid "<password>" two times 
	And click on “Create Account” button 
	And main page is opened 
	And I click on “Manage Acounts” button under account menu 
	And I click on “Personal Details” button under manage accounts section 
	Then “Personal Details” page is opened 
	And correct value is prefilled in email verification placeholder based on registered "<useremail>" 
	
	Examples: 
		| useremail | password |
		|    usertotest@gmail.com |   Azerty@123456 |