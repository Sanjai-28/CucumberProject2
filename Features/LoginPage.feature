Feature: Login to the webpage

Background: 
Given user enters the landing page
And user clicks the signup or login page link

Scenario: Login using valid credentials
When user enters the email and password
Then user clicks the login button
And user successfully logged in
