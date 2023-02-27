Feature: Book first displayed hotel 

# language: EN and CURRENCY: USD
Background: 
	Given I am on the login page 
	And  language used is English 
	And  Currency is USD 
	
Scenario Outline: Book first displayed hotel 
	Given I have account created 
	And I am in Home page 
	When I set up destination as "<Destination>" 
	And I set dates "<ArrivalDate>" and "<DepartureDate>" 
	And I select "<NumberAdults>" adults and "<NumberChildren>" children 
	And I click on “Search” button 
	And I click on “See availability” for fist hotel in the list 
	And “Hotel Details” page is opened for selected hotel 
	And  I click on “Reserve” button for recommended room 
	And  I click on “I'll Reserve” button 
	Then  “Checkout” page is displayed 
	And  I enter valid booking information 
	And  I click on “Next: Final Details” button 
	And  “Final Details” page is displayed 
	
	Examples: 
		| Destination | ArrivalDate | DepartureDate | NumberAdults | NumberChildren | 
		| Liepaja | 15-03-2023 | 20-03-2023 | 2 | 1 | 