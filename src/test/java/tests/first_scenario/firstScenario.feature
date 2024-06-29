Feature: Sign in with valid but not registered email


  Scenario Outline: Sign in with valid email
    Given user open signIn page
    When enter valid email "<email>"
    Then click on continue button
    And get the result message"<expectedMessage>"
    Examples:
      | email                      | expectedMessage                                   |
      | ypussefclayd105@@gmail.com | no cannot find an account with that email address |





