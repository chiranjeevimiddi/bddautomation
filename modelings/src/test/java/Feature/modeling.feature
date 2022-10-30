Feature: feature to test login functionality
Scenario: Verify feature to test login functionality
  Given browser is open
  When user enter username and password
  And hits login button
  Then user is navigated to homepage 

