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

	public class Edit_Leave_types {
		@FindBy(xpath="//android.view.View[@content-desc=\"Leave types\"]")
		private WebElement leave_type;
		
		private WebElement edit_LeaveType;
		
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


		public Edit_Leave_types( AndroidDriver driver)
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

		public void clickOn_edit_LeaveType(String edit_teavetype) {//is negative balance allowed  ,is balance tracked, Unpaid Leave
			edit_LeaveType = driver.findElement(By.xpath("//android.view.View[@content-desc='"+edit_teavetype+"']/android.widget.ImageView[2]"));
			edit_LeaveType.click();
		}
		
		public void enter_leaveType(String name) {
			Actions a =new Actions(driver);

			a.moveToElement(leaveType).click().perform();
			leaveType.clear();
			leaveType.sendKeys(name);
			
		}
		public void enter_leavdeScription(String name) {
			Actions a =new Actions(driver);
			a.moveToElement(deScription).click().perform();
			deScription.clear();
			deScription.sendKeys(name);
			
		}
		public void clickOn_balance_tracked() {
			balance_tracked.click();
		}
		public void clickOn_negative_balance_allowed() {
			negative_balance_allowed.click();
		}
		public void clickOn_Cancle() {
			cancle.click();
		}
		public void clickOn_Save() {
			save.click();
		}
		
		
		
	}



