Feature: Program for Tag 
@smoketest @sanitytest
Scenario: smoke Test
Given Launch Site
When Click on About Link
And Click on uncategorized link
And Click on First link
And Click on Home link
Then Smoke test is passed


Scenario: sanity test
Given Launch site
When Click on Contact link
And Enter First name
And Enter Last name
And Enter Email
And Enter Message 
And Click on Submit
And Click on Privacy policy link
And Click on The demo site link
Then Sanity test is passed

