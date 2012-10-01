Register hours as a user

Narrative:
In order to register hours
As a user
I want to register my hours in Connect

Scenario: Register hours and verify they are saved
Given armin has no hours registered
When user adds 10 hours to his week
Then connect should show 10 hours registered
