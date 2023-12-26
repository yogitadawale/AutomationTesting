Feature: Lovelocal - Login Page
#2nd
  Scenario: Validate Successful Login - Unique Data
    Given The user accesses lovelocal page
    When The user clicks on the account button
    And The user clicks on the get started button
    And The user enter valid mobile number
    And The user clicks on Next button
    And The user enter valid OTP
    And The user clicks on the Next button
    And The user selects a language
    And The user clicks on the update button
    Then The user should be redirected to a successful lovelocal page


#3rd HomePage-Banner part.
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When  The user clicks on the banner shop now page
    And The user clicks on the order now banner page
    And The user clicks on the refer now banner page
    Then The user successfully navigates back to the home page


#4th  HomePage-Want to repeat section
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to the want to repeat section
    And The user clicks on the want to repeat product
    And The user successfully lands on the shops front
    Then The user successfully navigates back to the home page


#5th HomePage-super saving for you
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to super saving for you
    And The user clicks on earn and refer page
    And The user successfully lands on the refer a friend popup
    Then The user successfully navigates back to the home page


#6th HomePage-shop discover shop near you
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to shop discover shop near you
    And The user clicks on the 1st shop
    And The user successfully lands on the shop front
    Then The user successfully navigates back to the home page


#7th  HomePage-shop by categories
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to shop by categories
    And The user clicks on the 1st category
    And The user successfully lands on the category page
    Then The user successfully navigates back to the home page


#  8th  HomePage-banners section
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to banners section
    And The user clicks on the 1st banner
    And The user successfully lands on the monthly saman page
    Then The user successfully navigates back to the home page


#9th HomePage- Text content section
  Scenario: Validate Successful Home page All Sections
    Given The user accesses lovelocal page
    When The user scrolls up to Text content section


