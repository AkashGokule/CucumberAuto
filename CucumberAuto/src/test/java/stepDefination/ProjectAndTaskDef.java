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

	
	@Then("clickOn_MainMenu")
	public void click_on_main_menu() {
		dbpage.ClickOn_MainMenu();
	}
	@Then("clickOn Project")
	public void click_on_project() {
		dbpage.ClickOn_Projects();
	}
	@Then("clickOn add project")
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
	@When("clickon add button")
	public void clickon_add_button() {
		addproject.clickOn_Add();
	}
	@Then("verify project add succesfull")
	public void verify_project_add_succesfull() {
		
	}
	@Then("verify the error massage as {string}")
	public void verify_the_error_massage_as(String expexted) {
		String ActualFirst = addproject.getErrorProjectName();
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
}
