@smoke
Feature: search feature
  Scenario Outline: User search using product name
    When when user go to search field and type "<product>"
    And user click on search field
    Then the page containing product appears
    And the search contains the "<product>"
    Examples:
      | product |
      | book    |
      | laptop  |
      | nike    |

    Scenario Outline: user could search for product using sku
      When when user go to search field and type "<product>"
      And user click on search field dynamic
      Then the page containing the sku appears with the "<product>" in it
      Examples:
        | product    |
        | SCI_FAITH  |
        | APPLE_CAM  |
        | SF_PRO_11  |