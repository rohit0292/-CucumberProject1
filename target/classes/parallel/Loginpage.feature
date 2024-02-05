Feature: Login function

  Scenario: Verify Sucessful login with valid entries
    Given Users navigate website
    When Click on Sign in link
    Then Enter username "Tom4@gmail.com" and password "Tom2@gmail.com"
    Then Click on Sign-in button for login page
    Then User Click on welcome list with logout link for successfull logout
