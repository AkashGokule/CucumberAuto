package qa.Timesheet_Approval;

	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Timesheet_Approval {
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
		private WebElement backTaskButton2;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]")
		private WebElement backButton1;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.ImageView[1]")
		private WebElement projectwise;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.ImageView[2]")
		private WebElement datewise;
    	//@FindBy(xpath="//android.widget.Button[@content-desc=\"Monthly\"]")
		private WebElement monthlyfilter;
		//@FindBy(xpath="//android.widget.Button[@content-desc=\"Weekly\"]")
		//private WebElement weeklyfilter;
 	    //@FindBy(xpath="//android.widget.Button[@content-desc=\"Daily\"]")
	    //private WebElement dailyfilter;
		private WebElement selectEmployee;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"APPROVE\"]")
		private WebElement approve;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="")
		private WebElement request;
		@FindBy(xpath="//android.view.View[@content-desc=\"Request to revise\"]")
		private WebElement requestToRevise;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"NO\"]")
		private WebElement No;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"YES\"]")
		private WebElement yes;
		private WebElement projectTask;
		@FindBy(xpath="//android.view.View[@content-desc=\" All submitted timesheet for the selected period has been approved!\"]")
		private WebElement InfoMassageWhenApprovenotPending;
		AndroidDriver driver;
		
		
		public Timesheet_Approval( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}
		public String getInfoMassageWhenApprovenotPending() {// All submitted timesheet for the selected period has been approved!

			String massage = InfoMassageWhenApprovenotPending.getAttribute("content-desc");
			return massage;
		}
		public void clickOn_backTaskButton() {
			backTaskButton2.click();
		}
		public void clickOn_backButton1() {
			backButton1.click();
		}
		public void clickOn_projectwise() {
			projectwise.click();
		}
		public void clickOn_Datewise() {
			datewise.click();
		}
		public void clickOn_Filter(String contendesc) {
			monthlyfilter	= driver.findElement(By.xpath("//android.widget.Button[@content-desc='"+contendesc+"']"));//Monthly,Weekly,Daily
			monthlyfilter.click();
			
		}
		
		public void selectEmployee(String contendesc) {
			selectEmployee = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+contendesc+"']"));//AG Akash Gokule 12h 42h
			selectEmployee.click();
		}
		public void clickOn_approve() {
			approve.click();
		}
		public void clickOn_cancle() {
			cancle.click();
		}
		public void clickOn_requestToRevise() {
			request.click();
		}
		public void clickOn_requestToRevise1() {
			requestToRevise.click();
		}
		public void clickOn_Revise_No() {
			No.click();
		}
		public void clickOn_Revise_yes() {
			yes.click();
		}
		
	public void select_projectTask(String contendesc) {
		projectTask = driver.findElement(By.xpath("//android.view.View[@content-desc='"+contendesc+"']"));//DemoTask 12h 42h                                                
		projectTask.click();
		}
		
		
	}



