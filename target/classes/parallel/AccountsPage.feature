Feature: My Account Page Feature

  Background: 
    Given user has already logged in to application
      | username       | password       |
      | Tom4@gmail.com | Tom2@gmail.com |

  @accounts
  Scenario: Accounts page title
    Given user click on My account page
    When user gets the title of the page
    Then page title should be "Home Page"

  @accounts
  Scenario: Accounts section count
    Given user gets accounts section
      | My Orders                |
      | My Downloadable Products |
      | My Wish List             |
      | Address Book             |
      | Account Information      |
      | Stored Payment Methods   |
      | My Product Reviews       |
    And accounts section count should be 0
