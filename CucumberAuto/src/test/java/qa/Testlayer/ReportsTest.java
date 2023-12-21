package qa.Testlayer;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Scroll;
import qa.Utility.Scroll.ScrollDiretion;

public class ReportsTest extends TestBase {

	@Test
	public void reportvarification() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		Thread.sleep(1000);
		dbpage.ClickOn_MainMenu();
		Thread.sleep(3000);
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		Thread.sleep(1000);
		dbpage.ClickOn_Reports();
		report.clickOn_Timesheet_Report();
		report.clickOn_Selectproject();
		report.clickOn_Project("DemoProject");
		report.clickOn_Monthly_daily_Weekly_Filter("Monthly");
		report.clickOn_Selectgroup();
		report.clickOn_grProject_Wise();
		report.clickOn_Selectgroup();
		report.clickOn_grDay_Wise();
		report.clickOn_Selectgroup();
		report.clickOn_grNone();
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		report.clickOn_TimeFormate();
		report.clickOn_HoursMinuteWithoughtunit();
		report.clickOn_Report_Download_Format();
		report.clickOn_Download();
		report.clickon_allowTomediapopup();

		Thread.sleep(3000);




	}


}
