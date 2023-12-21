package qa.Projects;



	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import io.appium.java_client.android.AndroidDriver;

	public class Edit_Task {
//		@FindBy(xpath="//android.view.View[@content-desc=\"DemoProject\"]/android.widget.ImageView[2]")
//		private WebElement view_Project;
//		@FindBy(xpath="//android.view.View[@content-desc=\"DemoTask\"]/android.widget.ImageView[3]")
//		private WebElement edit_Task;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
		private WebElement name;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
		private WebElement deScription;
		@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")
		private WebElement status;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
		private WebElement save;
		@FindBy(xpath="//android.view.View[@content-desc=\"Task name is empty!\"]")
		private WebElement ErrorTaskName;
		
		AndroidDriver driver;


		public Edit_Task( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);

			this.driver = driver;

		}
		public String getErrorTaskName() {//Task name is empty!

			String massage = ErrorTaskName.getAttribute("content-desc");
			return massage;
		}
		
		public void clickOn_view_Project(String edit_Projecttype) {//DemoProject
			
			 driver.findElement(By.xpath("//android.view.View[@content-desc='"+edit_Projecttype+"']/android.widget.ImageView[2]")).click();
			
		}

		public void clickOn_Edit_Task(String edit_tasktype) {//DemoTask
			
				 driver.findElement(By.xpath("//android.view.View[@content-desc='"+edit_tasktype+"']/android.widget.ImageView[3]")).click();
	
		}
		
		public void enter_TaskName(String name1) {
			Actions a =new Actions(driver);

			a.moveToElement(name).click().perform();
			name.clear();
			name.sendKeys(name1);
			
		}
		public void enter_TaskdeScription(String name1) {
			Actions a =new Actions(driver);
			
			a.moveToElement(deScription).click().perform();
			deScription.clear();
			deScription.sendKeys(name1);
			
		}
		public void clickOn_Status() {
			status.click();
		}
		public void clickOn_Cancle() {
			cancle.click();
		}
		public void clickOn_Save() {
			save.click();
		}
	}


