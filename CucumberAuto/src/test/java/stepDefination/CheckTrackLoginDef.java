package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import qa.TestBase.TestBase;
import qa.pageLayer.LoginPage;


public class CheckTrackLoginDef extends TestBase{
	
	//public static AndroidDriver driver;
//	public String appiumServer="127.0.0.1";
//	public int appiumPort=4723;
//	URL appiumURl=null;
	//public LoginPage login;
	 Logger logger;
	
//	public AndroidDriver initializerDriver() {
	 
//
//		DesiredCapabilities cap= new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android12");
////		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\agsat\\OneDrive\\Desktop\\employee-app\\build\\app\\outputs\\flutter-apk\\app-release.apk");
//		cap.setCapability(MobileCapabilityType.APP,"C:\\AkashWorkspace\\SetupFiles\\Project App\\app-release (1).apk");//pikar click
//		cap.setCapability("platformVersion", "12");
////		cap.setCapability("udid", "93JAY0BLTW");//for pixel 3a
////		cap.setCapability("udid", "8AMX0VP5S");//for pixel 3
////		cap.setCapability("udid", "emulator-5554");//for pixel 3
//		cap.setCapability("automationName","UiAutomator2");
//		cap.setCapability("unicodeKeyboard", "true");
//		
//		cap.setCapability("resetKeyboard", "true");
//		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
//		
//		//			WebDriverWait wait = new WebDriverWait(driver,30);
//		//			cap.setCapability("appPackage","com.greycell.dashcamuserapp");
//		//			cap.setCapability("appActivity","com.greycell.dashcamuserapp.MainActivity");
//		//			
//		try {
//			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
//			this.driver=new AndroidDriver(appiumURl,cap);
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		}
//
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//
//		return driver;
//	
//	}


    @After
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
        	
//        	TakesScreenshot ts=(TakesScreenshot) driver;
//        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//        	scenario.attach(screenshot, "image/png",scenario.getName());
        	 
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	 File src = ts.getScreenshotAs(OutputType.FILE);
        	String path ="C:\\Users\\agsat\\git\\CucumberAuto\\CucumberAuto\\ScreenShot\\"+scenario.getName()+System.currentTimeMillis()+".png";
        	File des =new File(path);
        	FileHandler.copy(src, des);
        	
        }
        
       driver.quit();
    }
	 
    @Before
	public void open_application() {
//		    driver =initializerDriver();
    	    intialize();
			logger= LogManager.getLogger(this.getClass());
			//login=new LoginPage(driver);
			
	}
    
	@Given("Application launch appium")
	public void launch_appium() {
		logger.info("Application Launch");
		
	}

	@When("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String string, String string2) {
		logger.info("Enter username");
		login.enter_email(string);
	    logger.info("Enter password ");
	    login.enter_password(string2);
	   
	}

	@Then("click on ligin button")
	public void click_on_ligin_button() {
		 logger.info("Clicked on Login ");
	     login.click_on_login_btn();
	}

	@And("varify login succefull")
	public void varify_login_succefull() {
		
		String Actualresult = login.loginSuccessFullmassage();
		String expexted ="Login Successful";
		System.out.println(Actualresult);
		assertEquals(Actualresult , expexted);
		 logger.info("Login Successful");
	}
	
	
	@Then("varify login not succefull and Error massage should display")
	public void varify_login_not_succefull_and_error_massage_should_display() {
		String Actualresult =	login.badCredentials();
		System.out.println(Actualresult);
		String expexted1 = "Bad credentials!";
		assertEquals(Actualresult , expexted1);
		
		
	}
	
	@Then("varify login not succefull and Error massage should display For both username and password")
	public void varify_login_not_succefull_and_error_massage_should_display_for_both_username_and_password() {
		String Actualresult =login.ErroremailId();
		String expexted = "Please enter a valid email Address";
		System.out.println(Actualresult);
		assertEquals(Actualresult, expexted);

		String expexted1 = "Password cannot be blank";	
		String Actualresult1 = login.Errorepass();
		System.out.println(Actualresult1);
		assertEquals(Actualresult1 , expexted1);
	}
	
	@Then("varify login not succefull and Error massage should display For username")
	public void varify_login_not_succefull_and_error_massage_should_display_for_username() {
		String Actualresult =login.ErroremailId();
		String expexted = "Please enter a valid email Address";
		System.out.println(Actualresult);
		assertEquals(Actualresult , expexted);
	}
	
	@Then("varify login not succefull and Error massage should display For password")
	public void varify_login_not_succefull_and_error_massage_should_display_for_password() {
		String expexted1 = "Password cannot be blank";	
		String Actualresult1 = login.Errorepass();
		System.out.println(Actualresult1);
		assertEquals(Actualresult1 , expexted1);
	}
	
	@Then("verify login outcome {string}")
	public void verify_login_outcome(String string) {
		
	    if (string.equals("Login success")) {
	    	System.out.println(string);
	    }
	    
	    if (string.equals("Login failure")) {
	    	System.out.println(string);
	    }
	} 


	@Then("verify the error message {string} and {int}")
	public void verify_the_error_message_and(String expexted, int index) {
//		String[] arrayOfMessages = {"Login Successful","Bad credentials!","Bad credentials!","Bad credentials!","Password cannot be blank","Please enter a valid email Address","Please enter a valid email Address","Please enter a valid email Address","Password cannot be blank"};
//	
//		String Actualresult = login.allMessage(arrayOfMessages[index]);
//
//		System.out.println(Actualresult);		
//		assertEquals(Actualresult, expexted);
		
	
			
		
		int selectedIndex = 0;
		
		String[] arrayOfMessages = {"Login Successful","Bad credentials!","Please enter a valid email Address","Password cannot be blank"};
		
		for(int i= 0; i<arrayOfMessages.length ; i++) {
			
			if(arrayOfMessages[i].equals(expexted)) {
				
				selectedIndex = i;
				
			}
			
		}
		
		System.out.print("Selected Index : " + selectedIndex);
		
		if(selectedIndex == 0) {
			if(login.loginSuccessFullmassage().equals(expexted)) {
		    	   
	    		//print for error in loginSuccessFullmassage
	   		System.out.println("Login Error for loginSuccessFullmassage : " + login.loginSuccessFullmassage());
	   		System.out.println("Expected error : " + expexted);
	   		System.out.println("Bool Condition : " + login.loginSuccessFullmassage().equals(expexted));
	    	   
	    	   String Actualresult = login.loginSuccessFullmassage();
	   		   System.out.println(Actualresult);
	   		   assertEquals(Actualresult , expexted);
	               } 
		}
		
		else if(selectedIndex == 1) {
			
			 if(login.badCredentials().equals(expexted)) {
		        	
		        	//print for error in bad credential
		    		System.out.println("Login Error for badCredentials : " + login.badCredentials());
		    		System.out.println("Expected error : " + expexted);
		    		System.out.println("Bool Condition : " + login.badCredentials().equals(expexted));
		        	
		        	String Actualresult =	login.badCredentials();
		    		System.out.println(Actualresult);
		    		assertEquals(Actualresult , expexted);
				}
		      
			
		}
		
		else if(selectedIndex == 2) {
         if(login.ErroremailId().equals(expexted)) {
				
				//print for error in mail
				System.out.println("Login Error for mail : " + login.ErroremailId());
				System.out.println("Expected error : " + expexted);
				System.out.println("Bool Condition : " + login.ErroremailId().equals(expexted));
				
				
				String Actualresult =login.ErroremailId();
				System.out.println(Actualresult);
				assertEquals(Actualresult , expexted);
			}
		}
		
		else if(selectedIndex == 3) {
			 if (login.Errorepass().equals(expexted)) {
				 
					//print for error in password
						System.out.println("Login Error for password : " + login.Errorepass());
						System.out.println("Expected error : " + expexted);
						System.out.println("Bool Condition : " + login.Errorepass().equals(expexted));
					 
						String Actualresult1 = login.Errorepass();
						System.out.println(Actualresult1);
						assertEquals(Actualresult1 , expexted);
					}
				
			        
			
		}
		
		
		
		
		
		
		
	
	}
		
		
		
		
		
		
	
	@Given("Verify the login Functionality with {string}")
	public void verify_the_login_functionality_with(String string) {
	   
		
	}
	
 }
