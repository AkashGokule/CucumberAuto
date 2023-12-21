package qa.My_Details;

	import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;

	public class Request_My_Leaves {
		@FindBy(xpath="//android.view.View[@content-desc=\"My leaves\"]")
		private WebElement my_leaves;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"REQUEST LEAVE\"]")
		private WebElement request_leaves;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"Leaves\"]")
		private WebElement leaves;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"Projects\"]")
		private WebElement projects;
		private WebElement perticularprojects;
		private WebElement projectsTask;
		private WebElement assignleaveName;
		
		@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
		private WebElement cancle;
		@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
		private WebElement save;
		
	
		
		AndroidDriver driver;


		public Request_My_Leaves( AndroidDriver driver)
		{
			PageFactory.initElements(driver, this);

			this.driver = driver;

		}
		public void clickOn_my_leaves() {
		
			my_leaves.click();
		}
		public void clickOn_request_leaves() {
			request_leaves.click();
		}
		public void clickOn_leaves() {
			leaves.click();
		}
		public void clickOn_projects() {
			projects.click();
		}
		public void clickOn_perticularprojects(String projectName) {//DemoProject
			perticularprojects = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+projectName+"']"));
			perticularprojects.click();
		}
		public void clickOn_TaskName(String taskName) {//DemoTask
			projectsTask = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+taskName+"']"));
			projectsTask.click();
			
		}
		
		public void clickOn_AssignName(String AssignName) { //Unpaid Leave Used: 0.00d		//Paid Leave Used: 0.00d Balance: 10.00d            req-//Unpaid Leave  //Paid Leave Balance: 10.00d
			driver.findElement(ByAccessibilityId.accessibilityId(AssignName)).click();
//			assignleaveName = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='"+AssignName+"']"));
//			assignleaveName.click();
		}
		
		public void clickOn_Cancle() {
			cancle.click();
		}
		public void clickOn_Save() {
			save.click();
		}
		
		
		
	}



