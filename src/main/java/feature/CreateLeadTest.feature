Feature: CreateLead Test 

Scenario Outline: TC001 Positive Flow 
	Given Open chrome Browser 
	And Enter Url 
	And Enter Username against UsernameField 
	|username|
	|DemoSalesManager|
	And Enetr password against passwordField <Password> 
	|Password|
	|crmsfa|
	When User clicks on login button 
	And Click on CRM_SFA link 
	And Click on Leads Link 
	And Click on Create Lead link 
	And Enter Company name as <CN> 
	And Enter First name as <FN> 
	And Enter Last name as <LN> 
	And Click CreateLead 
	Then verifiy Create lead is successful 
	
	Examples: 
		|CN|FN|LN|
		|Capgemini|Sabari|Raj|
		
		
		
		
		
