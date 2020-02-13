Feature: Validate user able to add new place using AddPlace API

Scenario: Verify Place is being added successfully using AddPlace API
	Given user add new place payload
	When user calls "AddPlaceAPI" using POST http request
	Then API call got success with status code as 200
	And "Status" in responce body is "OK"
	And "Scope" in responce body is "APP"