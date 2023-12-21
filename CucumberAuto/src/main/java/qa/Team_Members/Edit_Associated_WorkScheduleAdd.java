package qa.Team_Members;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import qa.Utility.Scroll;

public class Edit_Associated_WorkScheduleAdd {
	@FindBy(xpath="//android.widget.ImageView[@index='5']")
	private WebElement workschedule;
	@FindBy(xpath="//android.view.View[@content-desc=\"Marvel\"]")
	private WebElement workSchedule;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"CANCEL\"]")
	private WebElement cancle;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"SAVE\"]")
	private WebElement save;
	
	@FindBy(id="SK satish kadam")
	private WebElement employeename;
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Associated work schedule\"]")
	private WebElement associated_work_schedule;
	
	AndroidDriver driver;


	public Edit_Associated_WorkScheduleAdd( AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);

		this.driver = driver;

	}
	public void clickOn_Employeename() {
		employeename.click();
	}
	public void clickOn_associated_work_schedule() {
		associated_work_schedule.click();
	}
	public void Select_Workschedule() {
		workschedule.click();
	}
	public void clickOn_WorkSchedule() {
		Scroll.scrolltil(By.xpath("//android.view.View[@content-desc=\"Marvel\"]"));
	}
	public void clickOn_Cancle() {
		cancle.click();
	}
	public void clickOn_Save() {
		save.click();
	}
}
