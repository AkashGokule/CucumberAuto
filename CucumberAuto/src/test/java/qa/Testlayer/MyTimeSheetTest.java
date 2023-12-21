package qa.Testlayer;

import org.testng.annotations.Test;

import qa.TestBase.TestBase;
import qa.Utility.Calendors;

public class MyTimeSheetTest extends TestBase {

	@Test
	public void VarifySubmitButton() {

		login.enter_email("akashgokule12345@mailinator.com");	
		login.enter_password("akashgokule12345@mailinator.com");
		login.click_on_login_btn();
		dbpage.ClickOn_MainMenu();
		dbpage.ClickOn_MyTimeSheet();
		timesheet.clickOn_Filter("Monthly");
		Calendors.monthlyCalender(8);
		timesheet.clickOn_OK();
		
		
	}

}
