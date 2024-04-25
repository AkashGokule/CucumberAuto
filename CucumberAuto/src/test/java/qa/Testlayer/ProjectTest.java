package qa.Testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import qa.Projects.Add_Task;
import qa.TestBase.TestBase;

public class ProjectTest extends TestBase {

	@Test
	public void add_Project() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("DemoProject");
		addproject.enter_ProjectdeScription("demo project");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
		String ActualFirst = addproject.getProjectName("DemoProject");
		String expexted ="DemoProject";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	
	}
	@Test
	public void add_Task() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("DemoTaks");
		addtask.enter_TaskdeScription("Task1");
		addtask.clickOn_Status();
		


	}
	@Test
	public void edit_Project() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("DemoProject");
		editproject.enter_ProjectdeScription("demo project");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
		
	}
	@Test
	public void edit_task() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("DemoTask");
		edittask.enter_TaskName("DemoTask");
		edittask.enter_TaskdeScription("Task1");
		edittask.clickOn_Status();
		edittask.clickOn_Save();



	}
	@Test
	public void varifyadd_ProjectWithEmptyField() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("   ");
		addproject.enter_ProjectdeScription("   ");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
		String ActualFirst = addproject.getErrorProjectName();
		String expexted ="Project name is empty!";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	
	@Test
	public void varifyadd_ProjectWith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("1234567890");
		addproject.enter_ProjectdeScription("1234567890");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
		String ActualFirst = addproject.getProjectName("1234567890");
		String expexted ="1234567890";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyadd_ProjectWith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		addproject.enter_ProjectdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
		String ActualFirst = addproject.getProjectName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyadd_ProjectWith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("abcdefghijklmnopqrstuvwxyz");
		addproject.enter_ProjectdeScription("abcdefghijklmnopqrstuvwxyz");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
		String ActualFirst = addproject.getProjectName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyadd_ProjectWith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		addproject.clickOn_add_Project();
		addproject.enter_ProjectName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		addproject.enter_ProjectdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		addproject.clickOn_Status();
		addproject.clickOn_Add();
//		String ActualFirst = addproject.getProjectName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
//		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
//		System.out.println(ActualFirst);
//		assertEquals(ActualFirst, expexted);
		
	}
	
	
	
	@Test
	public void varifyadd_TaskWithEmptyField() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("");
		addtask.enter_TaskdeScription("");
		addtask.clickOn_Status();
		addtask.clickOn_Add();
		String ActualFirst = addtask.getErrorTaskName();
		String expexted ="Task name is empty!";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyadd_TaskWith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		 
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("1234567890");
		addtask.enter_TaskdeScription("1234567890");
		addtask.clickOn_Status();
		addtask.clickOn_Add();
		String ActualFirst = addtask.getTaskName("1234567890");
		String expexted ="1234567890";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyadd_TaskWith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		addtask.enter_TaskdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		addtask.clickOn_Status();
		addtask.clickOn_Add();
		String ActualFirst = addtask.getTaskName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyadd_TaskWith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("abcdefghijklmnopqrstuvwxyz");
		addtask.enter_TaskdeScription("abcdefghijklmnopqrstuvwxyz");
		addtask.clickOn_Status();
		addtask.clickOn_Add();
		String ActualFirst = addtask.getTaskName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyadd_TaskWith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();
		
		addtask.clickOn_view_Project("DemoProject");
		addtask.clickOn_add_Task();
		addtask.enter_TaskName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		addtask.enter_TaskdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		addtask.clickOn_Status();
		addtask.clickOn_Add();
//		String ActualFirst = addtask.getTaskName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
//		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
//		System.out.println(ActualFirst);
//		assertEquals(ActualFirst, expexted);
	}
	
	
	@Test
	public void varifyEdit_ProjectWithEmptyField() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("    ");
		editproject.enter_ProjectdeScription("    ");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
		String ActualFirst = editproject.getErrorProjectName();
		String expexted ="Project name is empty!";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	

	@Test
	public void varifyEdit_ProjectWith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("1234567890");
		editproject.enter_ProjectdeScription("1234567890");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
		String ActualFirst =  addproject.getProjectName("1234567890");
		String expexted ="1234567890";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyEdit_ProjectWith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		editproject.enter_ProjectdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
		String ActualFirst =  addproject.getProjectName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyEdit_ProjectWith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("abcdefghijklmnopqrstuvwxyz");
		editproject.enter_ProjectdeScription("abcdefghijklmnopqrstuvwxyz");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
		String ActualFirst =  addproject.getProjectName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ActualFirst);
		assertEquals(ActualFirst, expexted);
		
	}
	@Test
	public void varifyEdit_ProjectWith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		editproject.clickOn_Edit_Project("DemoProject");
		editproject.enter_ProjectName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		editproject.enter_ProjectdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		editproject.clickOn_Status();
		editproject.clickOn_Save();
//		String ActualFirst =  addproject.getProjectName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
//		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
//		System.out.println(ActualFirst);
//		assertEquals(ActualFirst, expexted);
		
	}
	
	
	@Test
	public void varifyEdit_TaskWithEmptyField() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("DemoTask");
		edittask.enter_TaskName("");
		edittask.enter_TaskdeScription("");
		edittask.clickOn_Status();
		edittask.clickOn_Save();
		
		String ActualFirst = edittask.getErrorTaskName();
		String expexted ="Task name is empty!";
		System.out.println(ActualFirst);	
		assertEquals(ActualFirst, expexted);
	}
	
	@Test
	public void varifyEdit_TaskWith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("1234567890");
		edittask.enter_TaskName("DemoTask1");
		edittask.enter_TaskdeScription("1234567890");
		edittask.clickOn_Status();
		edittask.clickOn_Save();
		
		String ActualFirst = addtask.getTaskName("DemoTask1");
		String expexted ="DemoTask1";
		System.out.println(ActualFirst);	
		assertEquals(ActualFirst, expexted);
	}
	
	@Test
	public void varifyEdit_TaskWith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("DemoTask");
		edittask.enter_TaskName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		edittask.enter_TaskdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		edittask.clickOn_Status();
		edittask.clickOn_Save();
		
		String ActualFirst = addtask.getTaskName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(ActualFirst);	
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyEdit_TaskWith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("DemoTask");
		edittask.enter_TaskName("abcdefghijklmnopqrstuvwxyz");
		edittask.enter_TaskdeScription("abcdefghijklmnopqrstuvwxyz");
		edittask.clickOn_Status();
		edittask.clickOn_Save();
		
		String ActualFirst = addtask.getTaskName("abcdefghijklmnopqrstuvwxyz");
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(ActualFirst);	
		assertEquals(ActualFirst, expexted);
	}
	@Test
	public void varifyEdit_TaskWith_SpecialCharater() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Projects();

		edittask.clickOn_view_Project("DemoProject");
		edittask.clickOn_Edit_Task("DemoTask");
		edittask.enter_TaskName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		edittask.enter_TaskdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		edittask.clickOn_Status();
		edittask.clickOn_Save();
		
//		String ActualFirst = addtask.getTaskName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
//		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
//		System.out.println(ActualFirst);	
//		assertEquals(ActualFirst, expexted);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
