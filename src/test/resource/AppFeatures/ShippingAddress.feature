Feature: Shipping Address
  
  Given User click on Men top products with selection
  When  User navigate select product with size and colour
  Then  User navigate Product itam page
  And   Click on add to cart for select product
  Then  Click on Shoping Cart for view the page
  And   User click on proceed on CheckOut order
  When  user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
  And   user clicks on next button
  Then  Review & payments page will come for place the order
