Feature: To validate the login fuctionality of fb 
Background:
Given To launch the chrome browser and maximise window

@sanity
Scenario: To validate login with valid user name & invalid password

When To lauch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser


Scenario Outline: To validate the positive and negative combination of login functionality 

When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field 
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:

|emaildatas               |passworddatas|
|seleniuminmakes@gmail.com|Inmakes      |
|abc@gmail.com            |12345        |
|frame@gmail.com          |ididj        |
|sk@gmail.com             |Eydhd        |
|ram@gmail.com            |rkddjn       |

