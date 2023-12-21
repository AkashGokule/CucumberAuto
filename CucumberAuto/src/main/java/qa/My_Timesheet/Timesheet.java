package qa.My_Timesheet;

	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Timesheet {
		@FindBy(xpath="//android.widget.ImageView[@content-desc=\"ADD\"]")
		private WebElement addButton;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.ImageView[1]")
		private WebElement projectwise;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.ImageView[2]")
		private WebElement datewise;
    	//@FindBy(xpath="//android.widget.Button[@content-desc=\"Monthly\"]")
		private WebElement monthlyfilter;
//		@FindBy(xpath="//android.view.View[@content-desc=\"Oct, 2023\"]")
		private WebElement weeklyfilter;
 	    //@FindBy(xpath="//android.widget.Button[@content-desc=\"Daily\"]")
	    //private WebElement dailyfilter;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"Leaves\"]")
		private WebElement leaves;
		private WebElement project;
		private WebElement selectproject;
		private WebElement selecttask;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"OK\"]")
		private WebElement ok;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
		private WebElement fullday;
     	private	WebElement selectleaves;
     	@FindBy(xpath="//android.view.View[@content-desc=\"No hours for the selected period!\"]")
		private WebElement InfoMassageForNodata;
     	@FindBy(xpath="//android.widget.Button[@content-desc=\"SUBMIT\"]")
		private WebElement submit;
     	
		AndroidDriver driver;
		
		
		public Timesheet( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;

		}
		public String getInfoMassageForNodata() {//No hours for the selected period!

			String massage = InfoMassageForNodata.getAttribute("content-desc");
			return massage;
		}
		public void clickOn_addButton() {
			addButton.click();
		}
		public void clickOn_SubmitButton() {
			submit.click();
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
		
		public void clickOn_Project() {
			cancle.click();
			
		}
		public void selectproject(String contendesc) {
			selectproject = driver.findElement(By.xpath("//android.widget.Button[@content-desc='"+contendesc+"']"));//
			selectproject.click();
		}
		public void selecttask(String contendesc) {
			selecttask	= driver.findElement(By.xpath("//android.widget.Button[@content-desc='"+contendesc+"']"));//
			selecttask.click();
		}
		public void selectleaves(String contendesc) {
            selectleaves = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Paid Leave\r\n"
					+ "Balance: 10.00d\"]"));
			selectleaves.click();
		}
		public void clickOn_leaves() {
			cancle.click();
			
		}
		public void clickOn_FullDay() {
			fullday.click();
			
		}
		public void clickOn_Cancle() {
			cancle.click();
			
		}
		public void clickOn_OK() {
			ok.click();
		}
		
		
		
	}



