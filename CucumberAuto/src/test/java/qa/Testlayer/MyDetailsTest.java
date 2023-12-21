package qa.Testlayer;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Calendors;
import qa.Utility.Scroll;
import qa.Utility.Scroll.ScrollDiretion;

public class MyDetailsTest extends TestBase {

	@Test
	public void verifyRequestFullDayLeave() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		Thread.sleep(1000);
		dbpage.ClickOn_MainMenu();
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		dbpage.ClickOn_MyDetails();
		request_my_leaves.clickOn_my_leaves();
		request_my_leaves.clickOn_request_leaves();
		request_my_leaves.clickOn_leaves();
		Thread.sleep(1000);
		request_my_leaves.clickOn_AssignName("Unpaid Leave");
		Thread.sleep(1000);
		Calendors.calendorForLeaves("14/10/2023","14, Saturday, October 14, 2023");
		timesheet.clickOn_FullDay();
		request_my_leaves.clickOn_Save();
		
	}
	
	@Test
	public void verifyRequestHalfDayLeave() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		Thread.sleep(1000);
		dbpage.ClickOn_MainMenu();
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		dbpage.ClickOn_MyDetails();
		request_my_leaves.clickOn_my_leaves();
		request_my_leaves.clickOn_request_leaves();
		request_my_leaves.clickOn_leaves();
		Thread.sleep(1000);
		request_my_leaves.clickOn_AssignName("Unpaid Leave");
		Thread.sleep(1000);
		Calendors.calendorForLeaves("14/10/2023","14, Saturday, October 14, 2023");
		timepickerweel.clickOn_from_Hourse("12");
        timepickerweel.clickOn_from_minute("35");
        timepickerweel.clickOn_from_Am_pm("AM");
        Thread.sleep(1000);
        timepickerweel.clickOn_to_Hourse("12");
     //   timepickerweel.clickOn_to_minute("35");
        timepickerweel.clickOn_to_Am_pm("PM");
		request_my_leaves.clickOn_Save();
		
	}
	
	
	
	@Test(enabled=false)
	public void verifyPaidRequestLeave() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		Thread.sleep(1000);
		dbpage.ClickOn_MainMenu();
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		dbpage.ClickOn_MyDetails();
		request_my_leaves.clickOn_my_leaves();
		request_my_leaves.clickOn_request_leaves();
		request_my_leaves.clickOn_leaves();
		Thread.sleep(1000);
		request_my_leaves.clickOn_AssignName("Paid Leave Balance: 10.00d");
		Thread.sleep(1000);
		Calendors.calendorForLeaves("14/10/2023","14, Saturday, October 14, 2023");
		timesheet.clickOn_FullDay();
		request_my_leaves.clickOn_Save();
		
	}
	
}
