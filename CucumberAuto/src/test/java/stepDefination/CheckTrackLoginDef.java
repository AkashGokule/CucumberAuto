package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import qa.pageLayer.LoginPage;


public class CheckTrackLoginDef {
	
	public static AndroidDriver driver;
	public String appiumServer="127.0.0.1";
	public int appiumPort=4723;
	URL appiumURl=null;
	public LoginPage login;

	
	public AndroidDriver initializerDriver() {

		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android12");
//		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\agsat\\OneDrive\\Desktop\\employee-app\\build\\app\\outputs\\flutter-apk\\app-release.apk");
		cap.setCapability(MobileCapabilityType.APP,"C:\\AkashWorkspace\\SetupFiles\\Project App\\app-release (1).apk");//pikar click
		cap.setCapability("platformVersion", "12");
//		cap.setCapability("udid", "93JAY0BLTW");//for pixel 3a
//		cap.setCapability("udid", "8AMX0VP5S");//for pixel 3
//		cap.setCapability("udid", "emulator-5554");//for pixel 3
		cap.setCapability("automationName","UiAutomator2");
		cap.setCapability("unicodeKeyboard", "true");
		
		cap.setCapability("resetKeyboard", "true");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		
		//			WebDriverWait wait = new WebDriverWait(driver,30);
		//			cap.setCapability("appPackage","com.greycell.dashcamuserapp");
		//			cap.setCapability("appActivity","com.greycell.dashcamuserapp.MainActivity");
		//			
		try {
			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
			this.driver=new AndroidDriver(appiumURl,cap);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		catch(Exception e) {
			e.printStackTrace();
		}

		return driver;
	
	}


    @After
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {
        	
//        	TakesScreenshot ts=(TakesScreenshot) driver;
//        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//        	scenario.attach(screenshot, "image/png",scenario.getName());
        	 
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	 File src = ts.getScreenshotAs(OutputType.FILE);
        	String path ="C:\\AkashWorkspace\\WorkSpaceEclips\\CucumberAuto\\ScreenShot\\"+scenario.getName()+System.currentTimeMillis()+".png";
        	File des =new File(path);
        	FileHandler.copy(src, des);
        	
        }
        
       driver.quit();
    }

	@Given("launch appium")
	public void launch_appium() {
		
		driver =initializerDriver();
		login=new LoginPage(driver);
	}

	@Given("open application")
	public void open_application() {
	   
	}

	@When("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String string, String string2) {
	   login.enter_email(string);
	   login.enter_password(string2);
	}

	@Then("click on ligin button")
	public void click_on_ligin_button() {
	    login.click_on_login_btn();
	}

	@And("varify login succefull")
	public void varify_login_succefull() {
		
		String Actualresult = login.loginSuccessFullmassage();
		String expexted ="Login Successfu";
		System.out.println(Actualresult);
		assertEquals(Actualresult , expexted);
		
	}

}
