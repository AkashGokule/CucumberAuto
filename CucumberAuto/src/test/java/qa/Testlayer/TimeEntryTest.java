package qa.Testlayer;





import org.openqa.selenium.By;
import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Calendors;


public class TimeEntryTest extends TestBase{

	@Test
	public void addTimeEntry() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
        addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
        addtimeentry.clickOn_add_button();
        Calendors.calendorForTimeSheet("14/10/2024","14, Monday, October 14, 2024");
        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"04\"])[1]")).click();
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"46\"]")).click();
        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"AM\"])[1]")).click();
        Thread.sleep(3000);
//        timepickerweel.clickOn_from_Hourse("06");
//        timepickerweel.clickOn_from_minute("40");
//        timepickerweel.clickOn_from_Am_pm("AM");
//        Thread.sleep(1000);
//        timepickerweel.clickOn_to_Hourse("06");
//        timepickerweel.clickOn_to_minute("40");
//        timepickerweel.clickOn_to_Am_pm("PM");
//        addtimeentry.clickOn_Save();
     
    
	}
	
	@Test
	public void editTimeEntry() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
        addtask.clickOn_view_Project("DemoProject");
        addtimeentry.clickOn_view_task();
        addtimeentry.clickOn_EditTimeEntry("Fri, 09/15/2023\r\n"
        		+ "03:05 AM\r\n"
        		+ "13h");
        Calendors.calendorForTimeSheet("14/10/2023","14, Saturday, October 14, 2023");
        timepickerwheeledit.clickOn_from_Hourse("04" ,"04");
        timepickerwheeledit.clickOn_from_minute("35","06");
        timepickerwheeledit.clickOn_from_Am_pm("AM");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_Hourse("04","05");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_minute("35","06");
        Thread.sleep(1000);
        timepickerwheeledit.clickOn_to_Am_pm("PM");
        addtimeentry.clickOn_Save();
     
    
	}
	
	@Test
	public void month () throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
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
