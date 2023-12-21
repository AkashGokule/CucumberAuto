package qa.TestBase;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import qa.My_Details.Request_My_Leaves;
import qa.My_Details.TeamMembersProfile;
import qa.My_Timesheet.Timesheet;
import qa.Projects.Add_Project;
import qa.Projects.Add_Task;
import qa.Projects.Add_TimeEntry;
import qa.Projects.Edit_Project;
import qa.Projects.Edit_Task;
import qa.Reports.Reports;
import qa.Team_Members.Add_TeamMembers;
import qa.Team_Members.Associated_WorkSchedule;
import qa.Team_Members.Edit_Associated_WorkScheduleAdd;
import qa.Team_Members.Edit_Role_Assignment;
import qa.Team_Members.Edit_TeamMembers;
import qa.Team_Members.Leaves;
import qa.Team_Members.Role_Assignment;
import qa.Timesheet_Approval.Timesheet_Approval;
import qa.Utility.Scroll;
import qa.Utility.Scroll.ScrollDiretion;
import qa.Utility.TimePickerWeel;
import qa.Utility.TimePickerWheelEdit;
import qa.Work_Schedules.Add_WorkSchedule;
import qa.Work_Schedules.Edit_WorkSchedule;
import qa.leave_Management.Add_Leave_types;
import qa.leave_Management.Edit_Leave_types;
import qa.leave_Management.Modify_leaveBalance;
import qa.pageLayer.DashBoardPage;
import qa.pageLayer.LoginPage;


public class TestBase {

	public static AndroidDriver driver;
	public String appiumServer="127.0.0.1";
	public int appiumPort=4723;
	URL appiumURl=null;
	public static Properties prop;
	public LoginPage login;
	public DashBoardPage dbpage;
	public Add_WorkSchedule addworkSchedule;
	public Edit_WorkSchedule editWorkSchedule;
	public Add_Project addproject;
	public Add_Task addtask;
	public Edit_Project editproject;
	public Edit_Task edittask;
	public Reports report;
	public Add_TimeEntry addtimeentry;
	public TimePickerWeel timepickerweel;
	public TimePickerWheelEdit timepickerwheeledit;
	public Timesheet timesheet;
	public Add_TeamMembers add_teammembers;
	public Associated_WorkSchedule associated_workschedule;
	public Role_Assignment role_assignment;
	public Edit_Associated_WorkScheduleAdd edit_associated_workschedule;
	public Edit_Role_Assignment edit_role_assignment;
	public Edit_TeamMembers edit_teammembers;
	public Leaves leaves;
	public Timesheet_Approval timesheet_approval;
	public Request_My_Leaves request_my_leaves;
	public Add_Leave_types add_leave_types;
	public Edit_Leave_types edit_leave_types;
	public Modify_leaveBalance modify_leavebalance;
    public TeamMembersProfile teammembersprofile;

	public TestBase() {
		//		try {
		//			prop=new Properties();
		//			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"src/main/java/com"+"/qa/Config/OR.properties");
		//		prop.load;
		//		}
		//		catch(Exception e){
		//			e.printStackTrace();
	}

	public AndroidDriver initializerDriver() {

		try {
			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
			this.driver=new AndroidDriver(appiumURl,setAppCapabilitiesAndroid());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		catch(Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public DesiredCapabilities setAppCapabilitiesAndroid() {
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
		return cap;

	}
       //@BeforeSuite
	  @BeforeClass
	//	@BeforeMethod
	public void intialize() {
		  
		driver= initializerDriver();

		login=new LoginPage(driver);
		dbpage=new DashBoardPage(driver);
		add_teammembers  =new Add_TeamMembers(driver);
		associated_workschedule=new Associated_WorkSchedule(driver);
		role_assignment =new Role_Assignment(driver);
		addworkSchedule= new Add_WorkSchedule(driver);
		editWorkSchedule=new Edit_WorkSchedule(driver);
		addproject =new Add_Project(driver);
		addtask =new Add_Task(driver);
		editproject =new Edit_Project(driver);
		edittask =new Edit_Task(driver);
		report =new Reports(driver);
		addtimeentry=new Add_TimeEntry(driver);
		timepickerweel=new TimePickerWeel(driver);
		timesheet =new Timesheet(driver);
		edit_associated_workschedule =new Edit_Associated_WorkScheduleAdd(driver);
		edit_role_assignment =new Edit_Role_Assignment(driver);
		edit_teammembers =new Edit_TeamMembers(driver);
		leaves =new Leaves(driver);
		timesheet_approval =new Timesheet_Approval(driver);
		request_my_leaves =new Request_My_Leaves(driver);
		add_leave_types =new Add_Leave_types(driver);
		edit_leave_types =new Edit_Leave_types(driver);
		modify_leavebalance =new Modify_leaveBalance(driver);
		timepickerwheeledit =new TimePickerWheelEdit(driver);
		teammembersprofile =new TeamMembersProfile(driver);
	}

	//		@BeforeMethod
	//		public void Logins() {		
	//			login.enter_email("akashgokule12345@mailinator.com");
	//			login.enter_password("akashgokule12345@mailinator.com");
	//			login.click_on_login_btn();		
	//		}
	//		
//			@AfterMethod
//			public void tearDown() {
//				dbpage.ClickOn_MainMenu();			
//				Scroll.scroll(ScrollDiretion.DOWN ,0.2); 
//				dbpage.ClickOn_LogOut();
//			}

}

