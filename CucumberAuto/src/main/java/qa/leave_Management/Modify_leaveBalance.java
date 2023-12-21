package qa.leave_Management;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Modify_leaveBalance {
		@FindBy(xpath="//android.view.View[@content-desc=\"Modify leave balances\"]")
		private WebElement modify_leavesBalance;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox")
		private WebElement selectall;
		@FindBy(xpath="//android.widget.CheckBox[@content-desc=\"satish kadam\"]")
		private WebElement employeename;
		@FindBy(xpath="//android.widget.CheckBox[@content-desc=\"is balance tracked\"]")
		private WebElement balance_tracked;
		@FindBy(xpath="//android.widget.CheckBox[@content-desc=\"is negative balance allowed\"]")
		private WebElement negative_balance_allowed;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
		private WebElement save;
//		@FindBy(xpath="(//android.widget.ImageView[@content-desc=\"Add\"])[1]")
		private WebElement add;
		@FindBy(xpath="//android.view.View[@content-desc=\"Add\"]")
		private WebElement addLeaves;
		@FindBy(xpath="//android.view.View[@content-desc=\"Set\"]")
		private WebElement setLeaves;
		
		@FindBy(xpath="//android.view.View[@content-desc=\"Modify leave balance\r\n"
				+ "Paid Leave\r\n"
				+ "leaves\r\n"
				+ "Entered number will be added in current balance.\"]/android.widget.EditText")
		private WebElement enterlives;
		@FindBy(xpath="//android.view.View[@content-desc=\"Select at least one team member\"]")
		private WebElement ErrorSelectatleastoneteammember;
		@FindBy(xpath="//android.view.View[@content-desc=\"Select at least one leave type\"]")
		private WebElement ErrorSelectatleastoneleavetype;
		
		
		
		AndroidDriver driver;


		public Modify_leaveBalance( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);

			this.driver = driver;

		}
		public String getErrorSelectatleastoneteammember() {//Select at least one team member

			String massage = ErrorSelectatleastoneteammember.getAttribute("content-desc");
			return massage;
		}
		public String getErrorSelectatleastoneleavetype() {//Select at least one leave type

			String massage = ErrorSelectatleastoneleavetype.getAttribute("content-desc");
			return massage;
		}
		public void clickOn_modify_leavesBalance() {
			modify_leavesBalance.click();
		}
		
		public void clickOn_selectallCkeckBox() {
			selectall.click();
		}
		
		public void clickOn_employeename() {
			employeename.click();
		}
		
		public void clickOn_leavesTypebalance_tracked() {
			balance_tracked.click();
		}
		
		public void clickOn_leavesTypenegative_balance_allowed() {
			negative_balance_allowed.click();
		}
		public void clickOn_add(int index) {
		
			add=driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc='Add'])['"+index+"']"));
			add.click();
		}
		public void clickOn_addLeaves() {
			addLeaves.click();
		}
		public void clickOn_setLeaves() {
			setLeaves.click();
		}
		public void enter_enterlives(String num) {
			Actions a=new Actions(driver);
			a.moveToElement(enterlives).click().perform();
			enterlives.sendKeys(num);
		}
		public void clickOn_Cancle() {
			cancle.click();
		}
		
		public void clickOn_Save() {
			save.click();
		}
		
		
		
	}



