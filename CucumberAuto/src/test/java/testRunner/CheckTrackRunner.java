package testRunner;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		//remove unwanted charactor
		monochrome=true,
		
		 // for log information in console at time of automation
	     //dryRun = true,
		
		// feature file path
		features= // {".//FeatureFile/CheckTrackLogin.feature"},
				 // {".//FeatureFile/ProjectAndTask.feature"},
				// {".//FeatureFile/WorkSchedule.feature"},
			      {".//FeatureFile/Loginfeature.feature"},
			       
		//other folder step defination store then
		glue= {"stepDefination"},
		
		plugin= {
				"pretty", 
				"html:reports/myreport.html",
				"rerun:target/rerun.txt",

				  //"html:target/cucumber-htmlreport",
				  //"json:target/cucumber-report.json",
//				 "html:test-output",
		}
				
//				,tags="@edittask"
				
		)
public class CheckTrackRunner extends AbstractTestNGCucumberTests {

	
}
//public class CheckTrackRunner {
//
//	
//}
