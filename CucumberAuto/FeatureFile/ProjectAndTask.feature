
Feature: Verify the project and Task Functionality
  
 Background:
    When enter username as "akashgokule12345@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
 
  Scenario: Varify add Project With Empty Field
    And clickOn_MainMenu
    And clickOn Project 
    And clickOn add project
    When enter project as "" 
    And enter project Discription As "" 
    And clickon add button
    Then verify the error massage as "Project name is empty"

  
