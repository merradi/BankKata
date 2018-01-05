Feature: Deposit into account

  Scenario: Create account for Customer with account
   	Given create account for Customer "marouane" with 200 EUR in his account 
   	When he deposits 100 EUR into his account
   	And he withdraws 50 EUR from his account
   	Then customer new balance is 250 EUR
   	
   	
   	
   	
   	
   	


 
