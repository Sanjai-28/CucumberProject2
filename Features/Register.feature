Feature: customer register to the application

Background: 
Given user enters the landing page
And user clicks the signup or login page link

Scenario: registration process
And user find the new user signup page
When user enters the name and email
Then user clicks the signup button
Then user enters the title male or female
And user enters the valid password
And user enters the DOB
And user enters the firstname and lastname
And user enters the company details
And user enters the address1 and address2
And user enters the country state city zipcode
And user enters the mobile number
And user clicks the create account button
And user successfully created account