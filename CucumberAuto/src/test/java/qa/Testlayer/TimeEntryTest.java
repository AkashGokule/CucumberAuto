package qa.Testlayer;

import org.testng.annotations.Test;
import qa.TestBase.TestBase;
import qa.Utility.Calendors;


public class TimeEntryTest extends TestBase{
	
    @Test
	public void justForLogic() throws InterruptedException {
		login.enter_email("parthpatel@yopmail.com.com");	
		login.enter_password("parthpatel@yopmail.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
        addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
        addtimeentry.clickOn_add_button();
        Calendors.calendorForTimeSheet("14/10/2024","14, Monday, October 14, 2024");
        Thread.sleep(3000);
        sendkey_timeEntry.first_Hourse("12");
		Thread.sleep(1000);
		sendkey_timeEntry.first_minute("35");
		Thread.sleep(2000);
		sendkey_timeEntry.clickOn_from_Am_pm("PM");
		sendkey_timeEntry.second_Hourse("9");
		Thread.sleep(2000);
		sendkey_timeEntry.second_minute("30");
		Thread.sleep(1000);
		sendkey_timeEntry.clickOn_to_Am_pm("PM");
		Thread.sleep(1000);
        addtimeentry.clickOn_Save();
		
	}
	@Test
	public void addTimeEntry() throws InterruptedException {
		login.enter_email("akashgokule12345@yopmail.com");	
		login.enter_password("123456");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
        addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
        addtimeentry.clickOn_add_button();
        
        Calendors.calendorForTimeSheet("14/10/2024","14, Monday, October 14, 2024");
          
        Thread.sleep(3000);
        timepickerweel.clickOn_from_Hourse("06");
        timepickerweel.clickOn_from_minute("59");
        timepickerweel.clickOn_from_Am_pm("AM");
        Thread.sleep(1000);
        timepickerweel.clickOn_to_Hourse("06");
        timepickerweel.clickOn_to_minute("55");
        timepickerweel.clickOn_to_Am_pm("PM"); 
        addtimeentry.clickOn_Save();
     
    
	}
	
	@Test
	public void editTimeEntry() throws InterruptedException {
		
		login.enter_email("akashgokule12345@yopmail.com");	
		login.enter_password("123456");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
        addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
        addtimeentry.clickOn_EditTimeEntry("14/10/2024 06:40 AM to 03:35 PM 8h 55m");
        Calendors.calendorForTimeSheet("14/10/2023","14, Saturday, October 14, 2023");
        timepickerwheeledit.clickOn_from_Hourse("04" ,"06");
        timepickerwheeledit.clickOn_from_minute("35","40");
        timepickerwheeledit.clickOn_from_Am_pm("AM");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_Hourse("04","03");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_minute("35","35");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_Am_pm("PM");
        addtimeentry.clickOn_Save();
     
    
	}
	
	@Test
	public void month () throws InterruptedException {
		
		login.enter_email("akashgokule12345@yopmail.com");	
		login.enter_password("123456");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_MyTimeSheet();
		timesheet.clickOn_Filter("Monthly");
		Calendors.monthlyCalender(5);
		timesheet.clickOn_OK();
		timesheet.clickOn_Filter("Weekly");
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		timesheet.clickOn_OK();
		Thread.sleep(2000);
		timesheet.clickOn_Filter("Daily");
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","20, Friday, October 20, 2023");
		timesheet.clickOn_OK();
	}
	
}
