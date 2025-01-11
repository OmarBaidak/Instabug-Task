Feature: Login

	@validLogin
	Scenario: As a customer, I want to login to my account so I can see my account information
		Given User opens Mobile Application
		Then User enters valid username
		And User enters valid password
		And User clicks on login button
		Then Validate user is directed to home page
