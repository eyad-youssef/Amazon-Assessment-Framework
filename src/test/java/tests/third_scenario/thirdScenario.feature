Feature: Options without Sign in

  Scenario: go to orders page
    Given user hover over Hello, sign in Account & Lists tab
    When select your orders option
    Then user go to sign in  page



  Scenario: go to addresses page
    Given user hover over Hello, sign in Account & Lists tab
    When select your address option
    Then user go to sign in  page




  Scenario: go to lists page
    Given user hover over Hello, sign in Account & Lists tab
    When select your lists option
    Then user go to lists page