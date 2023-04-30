@smoke
Feature: WishList feature

  Scenario: Success msg appears when we press on whish list
    When pressing on whishList on HTC One M Android L Lollipop
    Then Success msg appears green

    Scenario:
      When pressing on whishList on HTC One M Android L Lollipop
      And wait until this success message with green color to disappear then click on Wishlist Tab
      Then the quantity is bigger than zero

