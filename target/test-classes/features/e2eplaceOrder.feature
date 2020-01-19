Feature: Place online order on shopping portal 

Scenario: End to end shopping experience
Given User is on shopping portal landing page
When User select item from homepage featured items
And User selects continue shopping
And User select second item from homepage featured items
And User select proceed to checkout
And User provide email address in create new account section
And User provide all required information and click submit to register
Then User lands on order confirmation page and agrees before placing order
And User place order by clicking confirm order