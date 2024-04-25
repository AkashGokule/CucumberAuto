package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import qa.TestBase.TestBase;

public class ProjectAndTaskDef extends TestBase{

	
	@Then("click On MainMenu")
	public void click_on_main_menu() {
		dbpage.ClickOn_MainMenu();
	}
	@Then("click On Project")
	public void click_on_project() {
		dbpage.ClickOn_Projects();
	}
	@Then("click On add project")
	public void click_on_add_project() {
		addproject.clickOn_add_Project();
	}
	@When("enter project as {string}")
	public void enter_project_as(String string) {
		addproject.enter_ProjectName(string);
	}
	@When("enter project Discription As {string}")
	public void enter_project_discription_as(String string) {
		addproject.enter_ProjectdeScription(string);
	}
	@When("click on add button")
	public void clickon_add_button() {
		addproject.clickOn_Add();
	}
	
	@Then("verify the error massage as {string}")
	public void verify_the_error_massage_as(String expexted) {
		String ActualFirst = addproject.getErrorProjectName();
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Then("verify the task error massage as {string}")
	public void verify_the_task_error_massage_as(String expexted) {
		String ActualFirst = addtask.getErrorTaskName();
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}

	
	
	@Then("verify the project name add as {string}")
	public void verify_the_project_name_add_as(String expexted) {
		
		String ActualFirst = addtask.getTaskName(expexted);
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}

	@Then("click On View project {string}")
	public void click_on_view_project(String string) {
		addtask.clickOn_view_Project(string);
		
	}

	@When("click on add task")
	public void click_on_add_task() {
		addtask.clickOn_add_Task();
	}

	@When("enter task name As {string}")
	public void enter_task_name_as(String string) {
		addtask.enter_TaskName(string);
	}

	@When("enter task Discription As {string}")
	public void enter_task_discription_as(String string) {
		addtask.enter_TaskdeScription(string);
	}

	@Then("verify the task name add as {string}")
	public void verify_the_task_name_add_as(String expexted) {
		
		String ActualFirst = addtask.getTaskName(expexted);
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	
	@When("click on edit task {string}")
	public void click_on_edit_task(String string) {
		edittask.clickOn_Edit_Task(string);
	}
	@Then("click On edit project {string}")
	public void click_on_edit_project(String project) {
		editproject.clickOn_Edit_Project(project);
	}
	@When("click on save button")
	public void click_on_save_button() {
		edittask.clickOn_Save();
	}
	@When("enter edit  project as {string}")
	public void enter_edit_project_as(String string) {
		editproject.enter_ProjectName(string);
	}
	@When("enter edit project Discription As {string}")
	public void enter_edit_project_discription_as(String string) {
		
		editproject.enter_ProjectdeScription(string);
	}
	@When("enter edit task name As {string}")
	public void enter_edit_task_name_as(String string) {
		edittask.enter_TaskName(string);
		
	}
	@When("enter edit task Discription As {string}")
	public void enter_edit_task_discription_as(String string) {
		edittask.enter_TaskdeScription(string);
	}

	

}
