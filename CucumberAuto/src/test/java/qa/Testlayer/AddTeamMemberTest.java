package qa.Testlayer;



import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Calendors;
import qa.Utility.Scroll;
import qa.Utility.Scroll.ScrollDiretion;

public class AddTeamMemberTest extends TestBase {
	Random random = new Random();
	
	@Test(enabled=true)
	public void addTeamMemberTest() throws InterruptedException {
		
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("satish");
		add_teammembers.enter_LastName("Kadam");
		add_teammembers.enter_Mail("satishkadam"+random.nextInt()+"inc@mailinator.com");
//		add_teammembers.clickOn_Countrycode();
//		add_teammembers.clickOn_countrycodesearch("+91");
//		add_teammembers.clickOn_ClickOncountry("India +91");
		add_teammembers.enter_PhoneNo("7020761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
//		add_teammembers.clickOn_Timezone();
//		add_teammembers.clickOn_selecttimezone();
//		add_teammembers.clickOn_EmploymentType();
		add_teammembers.clickOn_StartDate();
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("Qa");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_reportTo();
		add_teammembers.clickOn_SelectEmployeeToReport("Akash Gokule");
		add_teammembers.clickOn_Save();
		String actualResult = add_teammembers.getSuccessMassage("'satish Kadam");
		Thread.sleep(1000);
		role_assignment.clickOn_Hr();
		role_assignment.clickOn_Save();
		Thread.sleep(1000);
		associated_workschedule.Select_Workschedule();
		associated_workschedule.clickOn_WorkSchedule();
		Thread.sleep(1000);
		associated_workschedule.clickOn_Save();
		
		String expexted ="satish Kadam has been successfully added.";
		System.out.println(actualResult);
		assertEquals(actualResult,expexted);
//		leaves.clickOn_assignLeaveType();
//		leaves.clickOn_selectleaveType("is negative balance allowed");
//		Thread.sleep(1000);
//		leaves.enter_leaveBalance("10");
//		leaves.clickOn_Save();
		
	}
	@Test
	public void varifyAddTeamMemberWithallEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("");
		add_teammembers.enter_LastName("");
		add_teammembers.enter_Mail("");
		add_teammembers.enter_PhoneNo("");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();
		Scroll.scroll(ScrollDiretion.Up,0.5); 
	
		String ActualFirst = add_teammembers.getErrorFirstname();
		String Actuallast= add_teammembers.getErrorLastname();
		String ActualEmail= add_teammembers.getErrorEmail();
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		String ActualDate = add_teammembers.getErrorStartDate();
		String ActualJobTitle = add_teammembers.getErrorJobTitle();
	
		String expexted ="Name can't be empty";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		String expexted1 ="Name can't be empty";
		System.out.println(Actuallast);
		assertEquals(Actuallast, expexted1);
		String expexted2 ="Please enter a valid email Address";
		System.out.println(ActualEmail);
		assertEquals(ActualEmail, expexted2);
		String expexted3 ="Start date can't be empty";
		System.out.println(ActualDate);
		assertEquals(ActualDate, expexted3);
		String expexted4 ="Job title can't be empty";
		System.out.println(ActualJobTitle);
		assertEquals(ActualJobTitle, expexted4);
		
	}
	@Test
	public void varifyAddTeamMemberWithFirstNameEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("");
		add_teammembers.enter_LastName("Kadam");
		add_teammembers.enter_Mail("satishkadam"+random.nextInt()+"inc@mailinator.com");
		add_teammembers.enter_PhoneNo("70761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_StartDate();
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("qa");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();
		Scroll.scroll(ScrollDiretion.Up,0.5); 
	
		String ActualFirst = add_teammembers.getErrorFirstname();
		
	
		String expexted ="Name can't be empty";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
		
	}
	@Test
	public void varifyAddTeamMemberWithlastNameEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("satish");
		add_teammembers.enter_LastName("");
		add_teammembers.enter_Mail("satishkadam"+random.nextInt()+"inc@mailinator.com");
		add_teammembers.enter_PhoneNo("7020761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_StartDate();
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("qa");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();
		Scroll.scroll(ScrollDiretion.Up,0.5); 

		String Actuallast= add_teammembers.getErrorLastname();
		
		String expexted1 ="Name can't be empty";
		System.out.println(Actuallast);
		assertEquals(Actuallast, expexted1);
		
	}
	@Test
	public void varifyAddTeamMemberWithEmailEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("satish");
		add_teammembers.enter_LastName("Kadam");
		add_teammembers.enter_Mail("");
		add_teammembers.enter_PhoneNo("7020761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_StartDate();
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("qa");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();
		Scroll.scroll(ScrollDiretion.Up,0.5); 

		String ActualEmail= add_teammembers.getErrorEmail();
		
		String expexted2 ="Please enter a valid email Address";
		System.out.println(ActualEmail);
		assertEquals(ActualEmail, expexted2);
		
		
	}
	@Test
	public void varifyAddTeamMemberWithDateEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("satish");
		add_teammembers.enter_LastName("Kadam");
		add_teammembers.enter_Mail("satishkadam"+random.nextInt()+"inc@mailinator.com");
		add_teammembers.enter_PhoneNo("7020761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5); 
		add_teammembers.clickOn_jobTitle("qa");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();
		String ActualDate = add_teammembers.getErrorStartDate();
		
		String expexted3 ="Start date can't be empty";
		System.out.println(ActualDate);
		assertEquals(ActualDate, expexted3);
		
		
	}
	@Test
	public void varifyAddTeamMemberWithJobTitleEmptyField() throws InterruptedException{
		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Team_members();
		add_teammembers.clickOn_AddTeamMember();
		add_teammembers.enter_FirstName("satish");
		add_teammembers.enter_LastName("Kadam");
		add_teammembers.enter_Mail("satishkadam"+random.nextInt()+"inc@mailinator.com");
		add_teammembers.enter_PhoneNo("7020761388");
		Scroll.scroll(ScrollDiretion.DOWN,0.5);
		add_teammembers.clickOn_StartDate();
		Calendors.calendorForWeeklyAndDailyFilter("13/10/2023","13, Friday, October 13, 2023");
		Scroll.scroll(ScrollDiretion.DOWN,0.5);
		add_teammembers.clickOn_jobTitle("");
		Scroll.scroll(ScrollDiretion.DOWN,0.2); 
		add_teammembers.clickOn_Save();

		String ActualJobTitle = add_teammembers.getErrorJobTitle();
		String expexted4 ="Job title can't be empty";
		System.out.println(ActualJobTitle);
		assertEquals(ActualJobTitle, expexted4);
		
	}
	
		
	}
	

