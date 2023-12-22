

Feature: Verify the login Functionality


  Scenario: Verify the login Functionality with valid credential
    Given Application launch appium 
    When enter username as "akashgokule12345@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    And varify login succefull
    
   
   Scenario: Verify the login Functionality with invalid credential
    Given Application launch appium 
    When enter username as "akashgokule12345@mailinator.co" and password as "akashgokule12345@mailinator.co"
    Then click on ligin button
    And varify login not succefull and Error massage should display
    
    
   
    Scenario: Verify the login Functionality with enter empty space 
    Given Application launch appium 
    When enter username as "" and password as ""
    Then click on ligin button
    And varify login not succefull and Error massage should display For both username and password
    
    
    Scenario: Verify the login Functionality with enter invalid username
    Given Application launch appium 
    When enter username as "akashgokule125@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    And varify login not succefull and Error massage should display 
    
    
    Scenario: Verify the login Functionality with enter invalid password
    Given Application launch appium 
    When enter username as "akashgokule12345@mailinator.com" and password as "akashgokule125@mailinator.com"
    Then click on ligin button
    And varify login not succefull and Error massage should display
    
    
     Scenario: Verify the login Functionality with enter empty space in username field
    Given Application launch appium 
    When enter username as "" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    And varify login not succefull and Error massage should display For username 
    
    
     Scenario: Verify the login Functionality with enter empty space in password field
    Given Application launch appium 
    When enter username as "akashgokule12345@mailinator.com" and password as ""
    Then click on ligin button
    And varify login not succefull and Error massage should display For password
    
    
    
    
    
    
    
    