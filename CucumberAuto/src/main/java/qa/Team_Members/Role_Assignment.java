package qa.Team_Members;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Role_Assignment {
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[1]")
	private WebElement company_Admin;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[2]")
	private WebElement manager;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[3]")
	private WebElement hr;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[4]")
	private WebElement employee;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	@FindBy(xpath="//android.view.View[@content-desc=\"Select atleast one role\"]")
	private WebElement ErrorRole;
	
	AndroidDriver driver;


	public Role_Assignment( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public String getErrorRole() {//Select atleast one role

		String massage = ErrorRole.getAttribute("content-desc");
		return massage;
	}
	public void clickOn_Company_Admin() {
		company_Admin.click();
	}

	public void clickOn_Manager() {
		manager.click();
	}
	public void clickOn_Hr() {
		hr.click();
	}

	public void clickOn_employee() {
		employee.click();
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
