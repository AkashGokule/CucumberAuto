package qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class DashBoardPage {
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Team members\"]")
	private WebElement Team_members;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Work schedules\"]")
	private WebElement Work_Schedules;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Projects\"]")
	private WebElement Projects;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"My timesheet\"]")
	private WebElement MyTimeSheet;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Timesheet approval\"]")
	private WebElement Timesheet_Approval;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Leave management\"]")                   
	private WebElement Leave_Management;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"My details\"]")
	private WebElement MyDetails;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Reports\"]")
	private WebElement Reports;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
	private WebElement Main_Menu;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Dashboard\"]")
	private WebElement DashBoard;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Log Out\"]")
	private WebElement LogOut;
	
	AndroidDriver driver;
	
	
	public DashBoardPage( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	
	public void ClickOn_MainMenu() {
		Main_Menu.click();
	}
	public void ClickOn_Team_members() {
		Team_members.click();
	}
	public void ClickOn_Work_Schedules() {
		Work_Schedules.click();
	}
	public void ClickOn_Projects() {
		Projects.click();
	}
	public void ClickOn_MyTimeSheet() {
		MyTimeSheet.click();
	}
	public void ClickOn_Timesheet_Approval() {
		Timesheet_Approval.click();
	}
	public void ClickOn_Leave_Management() {
		Leave_Management.click();
	}
	public void ClickOn_MyDetails() {
		MyDetails.click();
	}
	public void ClickOn_Reports() {
		Reports.click();
	}
	
	public void ClickOn_DashBoard() {
		DashBoard.click();
	}
	
	public void ClickOn_LogOut() {
		LogOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
