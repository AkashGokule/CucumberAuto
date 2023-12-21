package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		//remove unwanted charactor
		monochrome=true,
		
		//for log information in console at time of  automation
		//dryRun = true,
		
		//feature file path
		features= {".//FeatureFile/CheckTrackLogin.feature"},
		
		
		//other folder step defination store then
		glue= {"stepDefination"},
		
		plugin= {
				"pretty", 
				"html:reports/myreport.html",
				"rerun:target/rerun.txt"
				  //"html:target/cucumber-htmlreport",
				  //"json:target/cucumber-report.json",
//				 "html:test-output",
		}
		
		)
public class CheckTrackRunner extends AbstractTestNGCucumberTests{

	
	
	
}
