Feature: Edit lead 

Background:
    

Scenario: TC002 Positive Flow 

	Given Open Chrome Browser 
	And Navigate to the Leaftaps URL 
	And Enter Username as DemoSalesmanager 
	And Enter password as crmsfa 
	When User clicks login 
	And User clicks on CRM_SFA 
	And User clicks on Leads 
	And User clicks on Find Leads 
	And User clicks on email 
	And Enter email address as .com 
	And User clicks on Find Leads Search 
	And User selects the first resulting lead 
	And User verifies the title of the page 
	And Click on Edit 
	And User enters the CompanyName as TestLeaf 
	And Click on Update 
	Then User verfies the update name 
	
	
