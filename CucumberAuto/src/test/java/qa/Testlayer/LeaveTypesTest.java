package qa.Testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;

public class LeaveTypesTest extends TestBase{

	@Test
	public void VarifyAddLeaveEmptyInpute() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		add_leave_types.clickOn_leave_type();
		add_leave_types.clickOn_add_LeaveType();
		add_leave_types.enter_leaveType("     ");
		add_leave_types.enter_leavdeScription("    ");
		add_leave_types.clickOn_balance_tracked();
		add_leave_types.clickOn_Save();
		String Actual = add_leave_types.getErrorEmptyLeaveType();	
		String expexted ="Name can't be empty";
		System.out.println(Actual);
		assertEquals(Actual, expexted);


	}
	@Test
	public void VarifyAddLeavewith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		add_leave_types.clickOn_leave_type();
		add_leave_types.clickOn_add_LeaveType();
		add_leave_types.enter_leaveType("1234567890");
		add_leave_types.enter_leavdeScription("1234567890");
		add_leave_types.clickOn_balance_tracked();
		add_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("1234567890");	
		String expexted ="1234567890";
		System.out.println(Actual);
		assertEquals(Actual, expexted);


	}
	@Test
	public void VarifyAddLeavewith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		add_leave_types.clickOn_leave_type();
		add_leave_types.clickOn_add_LeaveType();
		add_leave_types.enter_leaveType("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		add_leave_types.enter_leavdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		add_leave_types.clickOn_balance_tracked();
		add_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}
	@Test
	public void VarifyAddLeavewith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		add_leave_types.clickOn_leave_type();
		add_leave_types.clickOn_add_LeaveType();
		add_leave_types.enter_leaveType("abcdefghijklmnopqrstuvwxyz");
		add_leave_types.enter_leavdeScription("abcdefghijklmnopqrstuvwxyz");
		add_leave_types.clickOn_balance_tracked();
		add_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("abcdefghijklmnopqrstuvwxyz");	
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}
	@Test
	public void VarifyAddLeavewith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		add_leave_types.clickOn_leave_type();
		add_leave_types.clickOn_add_LeaveType();
		add_leave_types.enter_leaveType("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		add_leave_types.enter_leavdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		add_leave_types.clickOn_balance_tracked();
		add_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");	
		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}

	
















	@Test
	public void VarifyEditLeaveEmptyInpute() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		edit_leave_types.clickOn_leave_type();
		edit_leave_types.clickOn_edit_LeaveType("Unpaid Leave");
		edit_leave_types.enter_leaveType("     ");
		edit_leave_types.enter_leavdeScription("    ");
		edit_leave_types.clickOn_balance_tracked();
		edit_leave_types.clickOn_Save();
		String Actual = edit_leave_types.getErrorEmptyLeaveType();	
		String expexted ="Name can't be empty";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}
	
	@Test
	public void VarifyEditLeavewith_NumericValue() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		edit_leave_types.clickOn_leave_type();
		edit_leave_types.clickOn_edit_LeaveType("Unpaid Leave");
		edit_leave_types.enter_leaveType("1234567890");
		edit_leave_types.enter_leavdeScription("1234567890");
		edit_leave_types.clickOn_balance_tracked();
		edit_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("1234567890");	
		String expexted ="1234567890";
		System.out.println(Actual);
		assertEquals(Actual, expexted);


	}
	
	@Test
	public void VarifyEditLeavewith_CapitalLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		edit_leave_types.clickOn_leave_type();
		edit_leave_types.clickOn_edit_LeaveType("Unpaid Leave");
		edit_leave_types.enter_leaveType("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		edit_leave_types.enter_leavdeScription("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		edit_leave_types.clickOn_balance_tracked();
		edit_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("ABCDEFGHIJKLMNOPQRSTUVWXYZ");	
		String expexted ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}
	
	@Test
	public void VarifyEditLeavewith_SmallLatter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		edit_leave_types.clickOn_leave_type();
		edit_leave_types.clickOn_edit_LeaveType("Unpaid Leave");
		edit_leave_types.enter_leaveType("abcdefghijklmnopqrstuvwxyz");
		edit_leave_types.enter_leavdeScription("abcdefghijklmnopqrstuvwxyz");
		edit_leave_types.clickOn_balance_tracked();
		edit_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("abcdefghijklmnopqrstuvwxyz");	
		String expexted ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}
	
	@Test
	public void VarifyEditLeavewith_SpecialCharacter() throws InterruptedException {
		login.enter_email("akashgokule12345@mailinator.com");
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_Leave_Management();
		edit_leave_types.clickOn_leave_type();
		edit_leave_types.clickOn_edit_LeaveType("Unpaid Leave");
		edit_leave_types.enter_leaveType("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		edit_leave_types.enter_leavdeScription("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");
		edit_leave_types.clickOn_balance_tracked();
		edit_leave_types.clickOn_Save();
		String Actual = add_leave_types.getleaveName("~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./");	
		String expexted ="~!@#$%^&*()_+{}|:\"<>?`-=[]\\;',./";
		System.out.println(Actual);
		assertEquals(Actual, expexted);

	}



	}
