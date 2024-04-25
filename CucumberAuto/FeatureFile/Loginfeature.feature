
Feature: Verify the login Functionality
  
  Scenario Outline: Login Page Validations
    Given Application launch appium 
    And Verify the login Functionality with "<inputedata>"
    When enter username as "<username>" and password as "<password>"
    And click on ligin button
    Then verify login outcome "<loginoutcome>"
    And verify the error message "<errormessage>" and <index> 
    

   Examples:      
|inputedata                           |   username  	                            | password 		                       | loginoutcome                |errormessage 									            | index |
|valid credential                     |  akashgokule12345@mailinator.com 	      	|akashgokule12345@mailinator.com     |     Login success           |Login Successful       		                |0      |
|invalid credential                   |  gokuleakash12@mailinator.com	            |akashgokule12@mailinator.com 		   |     Login failure           |Bad credentials!                          |1      |
|invalid username                     |  gokuleakash12@mailinator.com	            |akashgokule12345@mailinator.com 		 |     Login failure           |Bad credentials!                          |2      |
|invalid password                     |  akashgokule12345@mailinator.com		      |abc13                               |     Login failure           |Bad credentials!                          |3      |
|blanck password                      |  akashgokule12345@mailinator.com 	        |                                    |     Login failure           |Password cannot be blank                  |4      |        
|blanck username                      |                                           |akashgokule12345@mailinator.com     |     Login failure           |Please enter a valid email Address        |5      |     
|blank credential                     |                                           |                                    |     Login failure           |Please enter a valid email Address        |6      |
|blank_username invalid_password      |                                           | akashgokule12@mailinator.com       |     Login failure           |Please enter a valid email Address        |7      |
|invalid_username blank_password      | akashgokule12@mailinator.com              |                                    |     Login failure           |Password cannot be blank                  |8      |










