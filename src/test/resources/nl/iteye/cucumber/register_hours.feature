Feature: Register hours and verify they are saved

Scenario: Register hours and verify they are saved
Given "armin" has no hours registered
When user adds "10" hours to his week
Then connect should show "12" hours registered
