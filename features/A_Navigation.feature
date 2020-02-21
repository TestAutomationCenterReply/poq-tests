Feature: Navigation

  Scenario: Navigation

    When I click NavigationPage.HAMBURGER
    And I scroll "DOWN" until i find the element NavigationPage.CLEARANCE_OPTION
    And I click NavigationPage.CLEARANCE_OPTION
    Then I should be on ShopPage

    When I click the 7 item in the shop
    Then I should be on ProductPage
    And I click ProductPage.ADD_TO_BAG
    And I click ProductPage.FIRST_SIZE_OPTION

    When I click NavigationPage.BAG
    And I should be on BagPage
    Then At least an element should be in the bag

    When I click BagPage.CHECKOUT_BUTTON
    Then I should be on LoginPage
