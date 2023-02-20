Feature: User will check the functionality of login

Scenario: User can login using the correct username and password

Given User opens the browser
And User navigates to "https://www.demoblaze.com"
When User clicks on the Login button
And User enters the email
And User enters the password 
And User clicks on the submit button
Then User is successfully logged in and username is displayed
And User is navigated to home page