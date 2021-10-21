Feature: Login to Retail Website

#Each feature file starts with feature keyword and name for feature file
#Each scenario starts with Scenario keyword and : then name of scenario
#Given is used for precondition
#When is used for an action 
#And is used for actions step following when keyword 
#Then is use for expected result and writing assertions.


 Scenario: 
Scenario: Retail website LOGIN test
Given user is on Retail website
When user click on Myaccount
And user click on Login option 
And user enter userName '' and password ''
And user click on Login Button
 Then user should be logged in to Myaccount dashboard
,

Scenario Outline: 
 