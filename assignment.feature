Feature: Login functionality of Ribble cycles site
Given the user is already registered to the website Ribble cycles
Given the user is on the homepage
When the user clicks on the "Register or Log In"
And the user inputs the correct Email ID
And the user inputs the correct password
And the user clicks the Login button 
Then the user should be authenticated
And the user should be presented with a login message 

Feature: Search functionality of Ribble cycles site
Given the user is logged in to the account 
Given the user is on the homepage
When the user clicks on the "Search" button 
And the user enters the search term 
Then the user should be presented with products related to the search term

Feature: Description page of the product from the search result
Given the user has entered the search term and the page displayed related products
When the user clicks on the desired product
Then the user should be directed to the product page 
And the user should be presented with products related to the search term

Feature: Product page to choose variant of the product
Given the user clicks the product which he wants to buy
When the user clicks on the desired product
Then the user should be directed to the product page 
And the user should be presented with different variants of the product selected

Feature: Variant selected to be added in cart
Scenario: the user should be only able to add the product in the cart which is in stock
Given the user clicks the product variant which he wants to buy
And the user clicks the "Add to cart" button
Then the user should be presented with shopping cart with the product he has added
And the user should get a message-"Product has been added to the cart"