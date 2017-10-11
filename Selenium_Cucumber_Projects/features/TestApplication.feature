Feature: Test vzone smoke scenario

	Scenario: Test login with valid credentials
	Given Open chrome and start application
	When I enter valid user name and password
	Then User should be able to log	in