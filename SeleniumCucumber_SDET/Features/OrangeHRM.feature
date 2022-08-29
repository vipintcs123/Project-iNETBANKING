Feature: OrangeHRM Login

Scenario: Logo present on OrangeHRM home Page
Given I launch chrome browser
When I open orange hrm homepage  
Then I verify that the logo present on page 
And close browsers
