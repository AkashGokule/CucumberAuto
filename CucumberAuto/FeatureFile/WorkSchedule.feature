
Feature: Work schedule functionality
 Verify the add work schedule and edit work schedule functionality 

Background:
    Given enter username as "akashgokule12345@mailinator.com" and password as "akashgokule12345@mailinator.com"
    Then click on ligin button
    
  Scenario: Verify the add work schedule 
    When click On MainMenu
    And click On Work schedule
    And click on add Work schedule
    Then enter Work schedule name "akash"
    And click on hours box 
    And click on minute box
    And click on save button
    And verify the Work schedule add as "akash"
     
  Scenario: Verify the add work schedule with empty field
    When click On MainMenu
    And click On Work schedule
    And click on add Work schedule
    Then enter Work schedule name ""
    And click on hours box   
    And click on minute box 
    And click on save button
    And verify the error message as "Name can't be empty"
         
    Scenario: Verify the edit work schedule 
    When click On MainMenu
    And click On Work schedule
    And click on edit Work schedule
    Then enter edit Work schedule name "akash"
    And click on hours box 
    And click on minute box
    And click on save button
    And verify the Work schedule add as "akash"
    
    Scenario: Verify the edit work schedule with empty field
    When click On MainMenu
    And click On Work schedule
    And click on edit Work schedule
    Then enter edit Work schedule name "akash"
    And click on hours box 
    And click on minute box
    And click on save button
    And verify the error message as "Name can't be empty"
    
    
    
    
    