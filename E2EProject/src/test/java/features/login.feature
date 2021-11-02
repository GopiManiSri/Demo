Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "QAClickAcademy" site
And Click on Login link in hone page
When user enters "manisri@gmail.com" and "123456789" and logs in
Then verify that user is successfully logged in