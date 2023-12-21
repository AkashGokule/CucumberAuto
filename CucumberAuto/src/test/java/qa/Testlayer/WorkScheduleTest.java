package qa.Testlayer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Scroll;

public class WorkScheduleTest extends TestBase {

	@Test
	public void addWorkSchedule() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("akash");
//		addworkSchedule.clickOn_Hoursbox();
//		addworkSchedule.clickOn_Minute();
		addworkSchedule.clickOn_save();
		Thread.sleep(2000);
		String Actual = editWorkSchedule.getWorkScheduleName("akash");
		String expexted ="akash";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	@Test
	public void varifyAddWorkscheduleWith_EmptyName() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("           ");	
		addworkSchedule.clickOn_save();
		String ActualFirst = addworkSchedule.getErrorName();
		String expexted ="Name can't be empty";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyAddWorkscheduleWith_NumericInpute() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("123456789");	
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("123456789");
		String expexted ="123456789";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyAddWorkscheduleTextFieldWith_allCapitallatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	@Test
	public void varifyAddWorkscheduleTextFieldWith_AllSmalllatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("abcdefghijklmnopqrstuvwxyz");	
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyAddWorkscheduleTextFieldWith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./");	
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./");
		String expexted ="~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyAddWorkscheduleTextFieldWith_InitialLargeSpace() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("      Tushar");
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("Tushar");
		String expexted ="Tushar";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyAddWorkscheduleTextFieldWith_largeSpaceBetweenTwoWord() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		addworkSchedule.clickOn_Add_WorkSchedule();
		addworkSchedule.enter_WorkScheduleName("Tushar              Jadhav");
		addworkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("Tushar Jadhav");
		String expexted ="Tushar Jadhav";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	
	
	@Test
	public void editWorkSchedule() throws InterruptedException {

		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		Thread.sleep(3000);
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("akash");
		Thread.sleep(1000);
		editWorkSchedule.clickOn_Hoursbox();
		Thread.sleep(1000);
		editWorkSchedule.clickOn_Minute();
		editWorkSchedule.clickOn_save();
		
	}
	@Test
	public void varifyEditWorkscheduleWithEmptyName() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("");
		editWorkSchedule.clickOn_save();
		String ActualFirst = editWorkSchedule.getErrorName();
		String expexted ="Name can't be empty";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	
	@Test
	public void varifyEditWorkscheduleWith_NumericInpute() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("123456789");	
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("123456789");
		String expexted ="123456789";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyeditWorkscheduleTextFieldWith_allCapitallatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	@Test
	public void varifyEditWorkscheduleTextFieldWith_AllSmalllatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("abcdefghijklmnopqrstuvwxyz");	
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyEditWorkscheduleTextFieldWith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./");	
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./");
		String expexted ="~!@#$%^&*()_+{}|\"<>?`-=[]\\;',./";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyEditWorkscheduleTextFieldWith_InitialLargeSpace() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("      Tushar");
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("Tushar");
		String expexted ="Tushar";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	@Test
	public void varifyEditWorkscheduleTextFieldWith_largeSpaceBetweenTwoWord() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
	
        dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Work_Schedules();
		editWorkSchedule.clickOn_Edit_WorkSchedule();
		editWorkSchedule.enter_WorkScheduleName("Tushar              Jadhav");
		editWorkSchedule.clickOn_save();
		
		String Actual = editWorkSchedule.getWorkScheduleName("Tushar Jadhav");
		String expexted ="Tushar Jadhav";
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	
	
}
