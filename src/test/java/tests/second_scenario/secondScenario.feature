Feature: all products tab


  Scenario Outline: check add to cart process
    Given user click on all products tab
    And choose today's deals
    When choose the second category
    And take the first product
    And add quantity"<quantity>"
    And click on add to cart button
    Then go to cart page
    And check items name"<name>" and price"<price>" and total price"<total>"
    Examples:
      | quantity | name                                            | price      | total      |
      | 2        | Uhu no:37585 wood adhesive, size: 27 ml - clear | EGP 121.00 | EGP 242.00 |