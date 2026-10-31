Feature: Place the order for Products


@PlaceOrder
Scenario Outline: Search Experience for product search for both home and offers page

Given User is on Greenkart landing page
When User search for a product with shortname <Name> and capture the actual product name
And Added "3" items of the selected products to the cart
Then User proceeds to checkout and validate the <Name> items in the checkout page
And Verify user has ability to enter promo code and place the order
Examples: 
| Name |
| Tom |
