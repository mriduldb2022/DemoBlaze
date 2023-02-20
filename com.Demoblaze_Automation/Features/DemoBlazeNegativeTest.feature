Feature: Testing Login functionality to the application

Scenario Outline: This scenario tests all the invalid username and password
Discription: We can use boundary tests, State Transition techniques, etc.

Given I open the browser and I navigate to the application
When I click on the Login button on the homepage
And I enter "<email>" and "<password>"
And I click on the Submit button
Then I am suppose to get an error message 

Examples:
| email 						| password  |
| mriduldb654@email.com         | 123456    |
| mridul 1234567@email.com  	| 123456	|
| testuser12345@email.com		| 123456	|
| tmridul345@email.com 			| 1234567 	|
