Feature: Dashboard search
@smoke
Scenario: search a group
Given search field is available on dashboard page
When i enter the group with name "TestGroup"
Then group with name "TestGroup" should be displayed

@smoke 
Scenario: search a external group
Given search field is available on dashboard page
When i enter the external group with name "TestGroup"
Then external group with name "TestGroup" should be displayed

@Regression
Scenario: search a dynamic group
Given search field is available on dashboard page
When i enter the dynamic group with name "TestGroup"
Then dynamic group with name "TestGroup" should be displayed

@Regression
Scenario: search a entitlement group
Given search field is available on dashboard page
When i enter the entitlement group with name "TestGroup"
Then entitlement group with name "TestGroup" should be displayed

