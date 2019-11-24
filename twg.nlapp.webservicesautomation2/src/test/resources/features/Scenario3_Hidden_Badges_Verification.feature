
Feature: To verify Hidden Badges

  Scenario: Verify Hidden Badges
    Given update required offer status as active in offer DB table
    |update nl.offer set Status = 'A' where OfferId like '%120%'|
    Given expiry date in offer DB table
    |update nl.offer set Expiry=DATEADD(day,2,GETDATE()) where OfferId=12001|
    Given product with offer in ProductOffer DB table
    |insert into nl.ProductOffer(itemid,OfferId) values ('174469','12001)'|
    Then user verifies the badges in getProduct API
    When user launches the app and search the product
    Then product is searched
    When user clicks on the product
    Then product details page should be displayed
    Then user verify the Hot price badge and offer text
     
  
 