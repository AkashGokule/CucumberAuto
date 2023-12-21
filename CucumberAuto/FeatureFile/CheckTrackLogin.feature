

Feature: Verify the login Functionality


  Scenario: Verify the login Functionality with valid credential
    Given launch appium 
    And open application
    When enter username as "akashgokule12345@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    And varify login succefull
    

  