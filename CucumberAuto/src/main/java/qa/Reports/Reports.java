package qa.Reports;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Reports {
		@FindBy(xpath="//android.view.View[@content-desc=\"Timesheet report\"]")
		private WebElement timesheet_Report;
		
		@FindBy(xpath="//android.widget.ImageView[@index=\"2\"]")
		private WebElement selectproject;
		
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Monthly\"]/android.widget.RadioButton")
		private WebElement monthly;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Weekly\"]/android.widget.RadioButton")
		private WebElement weekly;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Daily\"]/android.widget.RadioButton")
		private WebElement daily;
		
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]")
		private WebElement selectdate;
		
		@FindBy(xpath="//android.widget.ImageView[@index=\"9\"]")
		private WebElement selectgroup;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"None\"]")
		private WebElement grNone;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Project wise\"]")
		private WebElement grProject_Wise;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Day wise\"]")
		private WebElement grDay_Wise;
		
		@FindBy(xpath="//android.widget.ImageView[@index=\"3\"]")
		private WebElement Report_Download_Format;
		
		@FindBy(xpath="//android.view.View[@index=\"0\"]")
		private WebElement Download_Format;
		
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		
		@FindBy(xpath="//android.widget.Button[@content-desc=\"DOWNLOAD\"]")
		private WebElement download;
		
		@FindBy(xpath="//android.widget.ImageView[@index=\"10\"]")
		private WebElement TimeFormate;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Hours (E.g. 2h 30m)\"]")
		private WebElement hoursMinuteWithunit;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Hours (E.g. 2.5)\"]")
		private WebElement hoursMinute;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Minutes (E.g. 150m)\"]")
		private WebElement MinutWithunit;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Minutes (E.g. 150)\"]")
		private WebElement minute;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
		private WebElement allowTomediapopup;
		AndroidDriver driver;


		public Reports( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);

			this.driver = driver;

		}
		public void clickOn_Timesheet_Report() {
			timesheet_Report.click();
		}
		public void clickOn_Selectproject() {
			selectproject.click();
		}
		public void clickOn_Project(String Content_dec) {//DemoProject

			 driver.findElement(By.xpath("//android.view.View[@content-desc='"+Content_dec+"']")).click();
		}
		
		public void clickOn_Monthly_daily_Weekly_Filter(String Content_dec) {//Monthly  ,Weekly ,Daily
			
			driver.findElement(By.xpath("//android.view.View[@content-desc='"+Content_dec+"']/android.widget.RadioButton")).click();
			
		}
//		public void clickOn_Weekly_Filter() {
//			weekly.click();
//		}
//		public void clickOn_Daily_Filter() {
//			daily.click();
//		}
		public void clickOn_SelectDate() {
			selectdate.click();
		}
		public void clickOn_Selectgroup() {
			selectgroup.click();
		}
		public void clickOn_grNone() {
			grNone.click();
		}
		public void clickOn_grProject_Wise() {
			grProject_Wise.click();
		}
		public void clickOn_grDay_Wise() {
			grDay_Wise.click();
		}
		public void clickOn_Report_Download_Format() {
			Report_Download_Format.click();
			
			Download_Format.click();
		}
		public void clickOn_Cancle() {
			cancle.click();
		}
		public void clickOn_Download() {
			download.click();
		}
		public void clickOn_TimeFormate() {
			TimeFormate.click();
		}
		public void clickOn_hoursMinutWithunit() {
			hoursMinuteWithunit.click();
		}
		public void clickOn_HoursMinuteWithoughtunit() {
			hoursMinute.click();
		}
		public void clickOn_MinutWithunit() {
			MinutWithunit.click();
		}
		public void clickOn_MinuteWithoughtunit() {
			minute.click();
		}
		public void clickon_allowTomediapopup() {
			allowTomediapopup.click();
		}
	}



