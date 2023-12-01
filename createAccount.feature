Feature: Create Account functionality of LeafTaps application

Background:
Given Launch the browser
And Load the url

Scenario Outline: Create Account with multiple testdatas
Given Enter the username as Demosalesmanager
And Enter the password as crmsfa
When Click on Login button
And Click on Crmfsa link
And Click Accounts
And Click Create Account
Given Enter account name as <acct name>
And Enter description as <descript>
And Enter local name as <locname>
And Enter site name as <sname>
And Enter annual revenue as <amount>
Then Click on Create account button

Examples:
|acct name|descript|locname|sname|amount|
|Debit Limited Account|Selenium Automation Tester|Test|abcde|1XXXXX|
|Debit Limited Account|Automation|tester|sobiya|2RRRR|