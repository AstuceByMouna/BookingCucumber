Feature: Book cheapest hotel 

# language: EN and CURRENCY: USD
Background: 
	Given I am on the login page 
	And  language used is English 
	And  Currency is USD 
	
Scenario Outline: Book cheapest hotel in city 
	Given I have account created 
	And I am in Home page 
	When I set up destination as "<Destination>" 
	And I set dates "<ArrivalDate>" and "<DepartureDate>" 
	And I select "<NumberAdults>" adults and "<NumberChildren>" children 
	And I click on “Search” button 
	And I click on “See availability” for the cheapest hotel in the list with a rating above "<Stars>" stars 
	And “Hotel Details” page is opened for selected hotel 
	And I click on “I'll Reserve” button for the most expensive available room in the hotel 
	Then “Checkout” page is displayed dates are correct price matches the price in details page 
	And I enter valid booking information 
	And I click on “Next: Final Details” button 
	And “Final Details” page is displaye 
	
	Examples: 
		| Destination | ArrivalDate | DepartureDate | NumberAdults | NumberChildren | Stars |
		| Riga | 15-03-2023 | 20-03-2023 | 2 | 0 | 3 | 
	