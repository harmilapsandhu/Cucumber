Feature: Application Login

Scenario: Home Page default login

Given User is on NetBanking Login Page
When User logs in using "Aubameyang" and "14"
Then Dashboard is populated
And Cards are "Displayed"

Scenario: Pepe Page default login

Given User is on NetBanking Login Page
When User logs in using "Pepe" and "19"
Then Dashboard is populated
And Cards are "Not Displayed"
