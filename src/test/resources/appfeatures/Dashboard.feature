Feature: Dashboard search
@smoke
Scenario: search a group
Given search field is available on dashboard page
When i enter the group with name "TestGroup"
Then group with name "TestGroup" should be displayed
 
#Scenario: search a external group
#Given search field is available on dashboard page
#When i enter the external group with name "TestGroup"
#Then external group with name "TestGroup" should be displayed

