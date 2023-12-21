package qa.Testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Calendors;

public class TimeSheetAprovalAndTimeEntrySubmitTest extends TestBase {
	
	
    @Test
	public void timeEntryAprove() {

		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Timesheet_Approval();
		timesheet.clickOn_Filter("Monthly");
		Calendors.monthlyCalender(8);
		timesheet.clickOn_OK();
		timesheet_approval.clickOn_approve();
		timesheet_approval.clickOn_approve();
		String actual = timesheet_approval.getInfoMassageWhenApprovenotPending();
		String Expected =" All submitted timesheet for the selected period has been approved!";
		System.out.println(actual);
		assertEquals(actual,Expected);
		
	}
    @Test
	public void timeEntrySubmitThrowMyTimesheet() {
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_MyTimeSheet();
		timesheet.clickOn_Filter("Monthly");
		Calendors.monthlyCalender(8);
		timesheet.clickOn_OK();
		addtimeentry.clickOn_SubmitButton();
		addtimeentry.clickOn_SubmitButton();
		String actual =addtimeentry.getSubmitInfomassageInMyTimeSheet();
		String Expected ="Your draft timesheet for the selected period has been submitted!";
		System.out.println(actual);
		assertEquals(actual,Expected);
		
	}
    @Test
   	public void timeEntrySubmitThrowProject() {
   		login.enter_email("akashgokule12345@mailinator.com");	
   		login.enter_password("akashgokule12345@mailinator.com");
   		login.click_on_login_btn();
   		dbpage.ClickOn_MainMenu();
   		dbpage.ClickOn_Projects();
   	    addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
   		addtimeentry.clickOn_SubmitButton();
   		addtimeentry.clickOn_SubmitButton();
   		String actual =addtimeentry.getSubmitInfomassageInProject();
   		String Expected ="Your draft timesheet for \"DemoTask\" has been submitted!";
   		System.out.println(actual);
   		assertEquals(actual,Expected);
   		
   	}
}
