
Feature: Verify the project and Task Functionality
  
 Background:
    Given enter username as "akashgokule12345@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    
 @addproject
  Scenario: Varify add Project With Empty Field
    And click On MainMenu
    And click On Project 
    And click On add project
    When enter project as "" 
    And enter project Discription As "" 
    And click on add button
    Then verify the error massage as "Project name is empty!"
    
  @addproject   
  Scenario: Varify add project functionality
    And click On MainMenu
    And click On Project 
    And click On add project
    When enter project as "DemoProject" 
    And enter project Discription As "DemoProject" 
    And click on add button
    Then verify the project name add as "DemoProject"
    
    @editproject
    Scenario: Varify Edit Project With Empty Field
    And click On MainMenu
    And click On Project 
    And click On edit project "DemoProject"
    When enter edit  project as "" 
    And enter edit project Discription As "" 
    And click on save button
    Then verify the error massage as "Project name is empty!"
    
   @editproject
   Scenario: Varify Edit Project functionality
    And click On MainMenu
    And click On Project 
    And click On edit project "DemoProject"
    When enter edit  project as "DemoProject" 
    And enter edit project Discription As "DemoProject"
    And click on save button
    Then verify the project name add as "DemoProject"

   @addtask
   Scenario: Varify add task with empty field
    And click On MainMenu
    And click On Project 
    And click On View project "DemoProject"
    When click on add task 
    And enter task name As ""
    And enter task Discription As "" 
    And click on add button
    Then verify the task error massage as "Task name is empty!"
    
    @addtask
    Scenario: Varify add task functionality 
    And click On MainMenu
    And click On Project
    And click On View project "DemoProject"
    When click on add task 
    And enter task name As "DemoTask1"
    And enter task Discription As "Task123" 
    And click on add button
    Then verify the task name add as "DemoTask1"
    
    @edittask 
    Scenario: Varify edit task with empty field
    And click On MainMenu
    And click On Project 
    And click On View project "DemoProject"
    When click on edit task "DemoTask1"
    And enter edit task name As ""
    And enter edit task Discription As "" 
    And click on save button
    Then verify the task error massage as "Task name is empty!"
    
    @edittask 
    Scenario: Varify edit task functionality 
    And click On MainMenu
    And click On Project 
    And click On View project "DemoProject"
    When click on edit task "DemoTask1"
    And enter edit task name As "DemoTask1"
    And enter edit task Discription As "DemoTask1"  
    And click on save button
    Then verify the task name add as "DemoTask1"
    
    
    
    
    