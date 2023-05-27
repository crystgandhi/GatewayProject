Feature: Landing on Payment Gateway Project HomePage
  
Scenario: Landing on gateway payment Page
    Given User Launch Chrome browser
    When User open URL "https://demo.guru99.com/payment-gateway/index.php"
		# When User click Payment Gateway Project
	  # Then User land on Guru99 Payment Gateway
		Then User check the page title
		When User select number of Quantities as "4"
		Then User click Buy now Btn 
		Then Check the Page title
		Then User Check Pay Amount 
		When User enter Card Number as "3444678912345643"
		And User enter Expiration Month as "02"
		And User enter Expiration Year  as "2025"
		And User enter CVV Code as "453"
		Then User Click pay button
	   Then user land on Order ID page
	   And User get Order ID
	   Then close the window
    
  
