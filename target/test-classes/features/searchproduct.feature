Feature: Search and place the order

@OffersPage
Scenario Outline: Search Experience for product search for both home and offers page

Given User is on Greenkart landing page
When User search for a product with shortname <Name> and capture the actual product name
Then User searched for <Name> shortname in the offers page 
And Validate product name matches with the landing page

Examples: 
| Name |
| Tom |
| Beet |