package qa.leave_Management;

	import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Add_Leave_types {
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Leave types\"]")
		private WebElement leave_type;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"ADD LEAVE TYPE\"]")
		private WebElement add_LeaveType;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
		private WebElement leaveType;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
		private WebElement deScription;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[1]")
		private WebElement balance_tracked;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[2]")
		private WebElement negative_balance_allowed;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
		private WebElement save;
		@FindBy(xpath="//android.view.View[@content-desc=\"Name can't be empty\"]")
		private WebElement ErrorEmptyLeaveType;
		
		AndroidDriver driver;


		public Add_Leave_types( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);

			this.driver = driver;

		}
		public String getErrorEmptyLeaveType() {//Name can't be empty

			String massage = ErrorEmptyLeaveType.getAttribute("content-desc");
			return massage;
		}
		public void clickOn_leave_type() {
			leave_type.click();
		}

		public void clickOn_add_LeaveType() {
			add_LeaveType.click();
		}
		
		public void enter_leaveType(String name) {
			Actions a =new Actions(driver);

			a.moveToElement(leaveType).click().perform();
			leaveType.sendKeys(name);
			
			
		}
		public void enter_leavdeScription(String name) {
			Actions a =new Actions(driver);
			a.moveToElement(deScription).click().perform();
			deScription.sendKeys(name);
			
		}
		public String getleaveName (String contendesc) {
			WebElement leave = driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']"));
			
			String massage = leave.getAttribute("content-desc");
			return massage;
		}
		public boolean clickOn_balance_tracked() {
			balance_tracked.click();
			boolean result = balance_tracked.isSelected();
			return result;
		}
		public boolean clickOn_negative_balance_allowed() {
			negative_balance_allowed.click();
			boolean result = negative_balance_allowed.isSelected();
			return result;
		}
		public void clickOn_Cancle() {
			cancle.click();
		}
		public void clickOn_Save() {
			save.click();
		}
		
		
		
	}



