Feature:Validating Login function of facebook Application
Scenario:Login With incorrect UserName and incorrect password
Given User is on facebook page
When User enter UserName and Password
And User Should click login button
Then User need to verify home page is appeard (or) not