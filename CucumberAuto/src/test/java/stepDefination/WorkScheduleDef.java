package stepDefination;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;
import qa.TestBase.TestBase;

public class WorkScheduleDef extends TestBase {
	
	@When("click On Work schedule")
	public void click_on_work_schedule() {
		 
			dbpage.ClickOn_Work_Schedules();			
	}

	@When("click on add Work schedule")
	public void click_on_add_work_schedule() {
		addworkSchedule.clickOn_Add_WorkSchedule();
	}

	@Then("enter Work schedule name {string}")
	public void enter_work_schedule_name(String string) {
		addworkSchedule.enter_WorkScheduleName(string);
	}

	@Then("click on hours box")
	public void click_on_hours_box() {
//		addworkSchedule.clickOn_Hoursbox();
	}

	@Then("click on minute box")
	public void click_on_minute_box() {
//		addworkSchedule.clickOn_Minute();

	}

	@Then("verify the Work schedule add as {string}")
	public void verify_the_work_schedule_add_as(String expexted) {
		String Actual = editWorkSchedule.getWorkScheduleName(expexted);
		System.out.println(Actual);
		assertEquals(Actual, expexted);
	}
	@When("click on edit Work schedule")
	public void click_on_edit_work_schedule() {
		editWorkSchedule.clickOn_Edit_WorkSchedule();
	}
	@Then("verify the error message as {string}")
	public void verify_the_error_message_as(String expexted) {
		String ActualFirst = editWorkSchedule.getErrorName();
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Then("enter edit Work schedule name {string}")
	public void enter_edit_work_schedule_name(String string) {
		editWorkSchedule.enter_WorkScheduleName("akash");
	}
}
